package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView its_work;
    TextView github;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        github = findViewById(R.id.link_git_hub);
        its_work = findViewById(R.id.its_work);
        github.setMovementMethod(LinkMovementMethod.getInstance());
    }
    public void onPushMe(View view){
        its_work.setTextColor(getResources().getColor(R.color.my_black));
    }
}