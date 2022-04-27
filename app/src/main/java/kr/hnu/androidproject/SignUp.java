package kr.hnu.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class SignUp extends AppCompatActivity {
    EditText idEdit, pwEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        idEdit = (EditText) findViewById(R.id.id_Edit);
        pwEdit = (EditText) findViewById(R.id.pw_Edit);

    }

    public void checkClick(View v){

        Toast.makeText(SignUp.this, "Good ID", Toast.LENGTH_SHORT).show();
    }

    public void backClick(View v){
        switch (v.getId()){
            case R.id.but:
                Intent intent = new Intent();
                intent.putExtra("UserOut", new User(idEdit.getText().toString(), pwEdit.getText().toString()));
                setResult(RESULT_OK, intent);
                finish();
                break;

        }

    }
}