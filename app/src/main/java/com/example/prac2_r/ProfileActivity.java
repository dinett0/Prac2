package com.example.prac2_r;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    private ImageButton back;
    private TextView name, email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        back = findViewById(R.id.backbutt);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            name.setText(bundle.get("name").toString());
            email.setText(bundle.get("login").toString());
            password.setText(bundle.get("password").toString());
        }
    }

    public void onBack(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}