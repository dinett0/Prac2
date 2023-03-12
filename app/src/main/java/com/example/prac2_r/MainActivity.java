package com.example.prac2_r;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button1, button2;
    private EditText field1, field2;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button_login);
        button2 = findViewById(R.id.button_signup);
        field1 = findViewById(R.id.editTextTextEmailAddress);
        field2 = findViewById(R.id.editTextTextPassword);
        //button1.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //    public void onClick(View v) {
        //
        //        Log.i(this.getClass().getSimpleName(), "Info");
        //    }
        //});
    }

    public void onClickLogIn(View v) {
        Intent intent = new Intent(this, ProfileActivity.class);
        if (name == null){
            Toast.makeText(this, "Unregistered personnel", Toast.LENGTH_SHORT).show();
        } else {
            intent.putExtra("login", field1.getText().toString())
                    .putExtra("password", field2.getText().toString())
                    .putExtra("name", name);
            startActivity(intent);
        }
        Log.i(this.getClass().getSimpleName(), "Info");
    }

    public void onClickSignUp(View v) {
        Intent intent = new Intent(this, SignUpActivity.class);
        SignUpActivity.launch(intent);
    }

    ActivityResultLauncher<Intent> SignUpActivity = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    if (result.getResultCode() == Activity.RESULT_OK) {
                        Intent data = result.getData();
                        field1.setText(data.getStringExtra("email"));
                        field2.setText(data.getStringExtra("password"));
                        name = data.getStringExtra("name");
                    }
                }
            });

}