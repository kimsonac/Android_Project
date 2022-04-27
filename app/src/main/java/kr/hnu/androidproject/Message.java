package kr.hnu.androidproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class Message extends AppCompatActivity {
    View v;
    RelativeLayout rel;
    LinearLayout lin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);


        lin = (LinearLayout) findViewById(R.id.linear);

        for (int i = 0; i < 3; i++) {
            rel = (RelativeLayout) View.inflate(this, R.layout.newmessage, null);
            lin.addView(rel);
        }


    }
}




