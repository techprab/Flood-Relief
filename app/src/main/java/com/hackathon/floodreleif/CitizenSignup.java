package com.hackathon.floodreleif;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CitizenSignup extends AppCompatActivity {

    TextView login_here;
    Button signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up_citizen);

        login_here = findViewById(R.id.login_here);
        signUp = findViewById(R.id.signUp);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CitizenSignup.this,HomeActivity1.class);
                startActivity(intent);
            }
        });

        login_here.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CitizenSignup.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}