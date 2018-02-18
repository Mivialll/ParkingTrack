package com.example.bivashpandey.dr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Profile extends AppCompatActivity {

    private Button yesButton, noButton;
    //when click No then send to the screen which say stay healthy
    //when click Yes then show up the questions

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        noButton = findViewById(R.id.buttonNo);
        noButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this, HealthyLife.class);
                startActivity(intent);
            }
        });

        yesButton = findViewById(R.id.buttonYes);
        yesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Profile.this, Questions.class);
                startActivity(intent);
            }
        });

    }
}
