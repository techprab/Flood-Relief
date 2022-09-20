package com.hackathon.floodreleif;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class LoginScreenOne extends AppCompatActivity {

    private MaterialButton citizenButton,ngoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen_part_one);

        citizenButton = findViewById(R.id.citizenButton);
        ngoButton = findViewById(R.id.ngoButton);

        citizenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginScreenOne.this,CitizenSignup.class);
                startActivity(intent);
            }
        });

        ngoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginScreenOne.this,NgoSignUp.class);
                startActivity(intent);
            }
        });
    }
}