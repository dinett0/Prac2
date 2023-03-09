package com.example.prac2_r;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button button1, button2;
    private EditText field1, field2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button_login);
        button2 = findViewById(R.id.button_signup);
        field1 = findViewById(R.id.editTextTextEmailAddress);
        field2 = findViewById(R.id.editTextTextPassword);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    private void onClickSignUp(View v){

    }
}