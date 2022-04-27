package kr.hnu.androidproject;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ActivityResultLauncher<Intent> activityResultLauncher;
    User user; //이렇게 바꾸기 굳이 string id, pw 따로 선언할 필요 없음

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }



    public void signUpClick(View v){
        switch (v.getId()) {
            case R.id.signup:
                Intent intent = new Intent(this, SignUp.class);
                activityResultLauncher.launch(intent);
                break;
        }

    }

    void init(){
        activityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), result -> {
            if(result.getResultCode() == RESULT_OK) {
                user = (User) result.getData().getSerializableExtra("UserOut");
            }
        });
    }
    public void logInClick(View v){

        EditText curId = (EditText) findViewById(R.id.id_Edit);
        EditText curPw = (EditText) findViewById(R.id.pw_Edit);

        if(user.getId().equals(curId.getText().toString()) && user.getPw().equals(curPw.getText().toString())) { //여기도 user.getId로
            Intent subIntent = new Intent(this, Message.class);
            startActivity(subIntent);
        }

        else {
            Toast.makeText(MainActivity.this, "잘못 입력하였습니다.", Toast.LENGTH_SHORT).show();
        }

    }

}