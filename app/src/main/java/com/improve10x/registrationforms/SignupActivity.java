package com.improve10x.registrationforms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        EditText emailTxtText = findViewById(R.id.email_txt);
        emailTxtText.setText("Siva.Kumar@Improve10X.com");

        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(v -> {
            String emailAdress = emailTxtText.getText().toString();
            EditText passwordTxt = findViewById(R.id.password_txt);
            String Password = passwordTxt.getText().toString();
            EditText confirmPasswordText = findViewById(R.id.confirm_txt);
            String ConfirmPassword = confirmPasswordText.getText().toString();

            Intent intent = new Intent(this, PersonalInfoActivity.class);
            intent.putExtra("emailAddress",emailAdress);

            startActivity(intent);
        });

    }
}