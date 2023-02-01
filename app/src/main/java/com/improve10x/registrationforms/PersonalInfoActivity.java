package com.improve10x.registrationforms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PersonalInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personalinfo);
        Intent intent = getIntent();
        String emailAddress = intent.getStringExtra("emailAddress");
        Toast.makeText(this, emailAddress, Toast.LENGTH_SHORT).show();


        EditText userNameTxt = findViewById(R.id.username_txt);
        userNameTxt.setText("Siva Kumar");
        EditText firstNameText = findViewById(R.id.firstname_txt);
        firstNameText.setText("Siva");
        EditText lastNameText = findViewById(R.id.lastname_text);
        lastNameText.setText("Kumar");
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> {

            finish();
        });
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(v -> {
            String userName = userNameTxt.getText().toString();
            String firstName = firstNameText.getText().toString();
            String lastName = lastNameText.getText().toString();
            Intent addressIntent = new Intent(this, AddressActivity.class);
            addressIntent.putExtra("emailAddress",emailAddress);
            addressIntent.putExtra("UserName",userName);
            addressIntent.putExtra("FirstName",firstName);
            addressIntent.putExtra("lastName",lastName);
            startActivity(addressIntent);

        });
    }
}