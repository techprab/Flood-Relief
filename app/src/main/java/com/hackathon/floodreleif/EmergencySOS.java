package com.hackathon.floodreleif;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class EmergencySOS extends AppCompatActivity {

            Button sendPolice;
            Button ngo;
            Button ambulance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sos_citizen);

        sendPolice = findViewById(R.id.sendPolice);
        ngo = findViewById(R.id.ngo);
        ambulance = findViewById(R.id.ambulance);

        sendPolice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmergencySOS.this,EmergencySOS.class);
                startActivity(intent);
            }
        });

        ngo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmergencySOS.this,HomeActivity.class);
                startActivity(intent);
            }
        });

        ambulance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmergencySOS.this,HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}