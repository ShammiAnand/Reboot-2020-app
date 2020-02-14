package com.example.tourism_welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class signup_activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_activity);
        Button login_signup = findViewById(R.id.login_signup);
        TextView login_text = findViewById(R.id.login_text);

        login_signup.setOnClickListener(this);
        login_text.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(signup_activity.this,login_activity.class);
        startActivity(intent);
    }
}
