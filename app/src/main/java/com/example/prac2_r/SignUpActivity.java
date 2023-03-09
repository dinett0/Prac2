package com.example.prac2_r;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

    private Button signUp;
    private EditText fieldName, fieldEmail, fieldPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        signUp = findViewById(R.id.buttonSignUp);
        fieldName = findViewById(R.id.editTextName);
        fieldEmail = findViewById(R.id.editTextEmail);
        fieldPassword = findViewById(R.id.editTextPassword);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}