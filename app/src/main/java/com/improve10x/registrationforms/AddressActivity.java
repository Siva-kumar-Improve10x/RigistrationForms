package com.improve10x.registrationforms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddressActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        Intent intent = getIntent();
        String emailAddress = intent.getStringExtra("emailAddress");
        String userName = intent.getStringExtra("UserName");
        String firstName = intent.getStringExtra("FirstName");
        String lastName = intent.getStringExtra("lastName");
        Toast.makeText(this,  emailAddress + " " + userName+" "+ firstName+ " "+lastName , Toast.LENGTH_SHORT).show();
        EditText hNoTxt = findViewById(R.id.hno_txt);
        hNoTxt.setText("4-12b");
        EditText streetText = findViewById(R.id.street_txt);
        streetText.setText("Kranthi Nagar");
        EditText cityText = findViewById(R.id.city_txt);
        cityText.setText("Nandyal");
        EditText countryNameText = findViewById(R.id.country_txt);
        countryNameText.setText("India");
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> {
            finish();
        });
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(v -> {

            String HNoApartment = hNoTxt.getText().toString();
            String Street = streetText.getText().toString();
            String City = cityText.getText().toString();
            String Countryname = countryNameText.getText().toString();


            Intent birthDeatailsIntent = new Intent(this, BirthdetailsActivity.class);
            birthDeatailsIntent.putExtra("emailAddress",emailAddress);
            birthDeatailsIntent.putExtra("UserName",userName);
            birthDeatailsIntent.putExtra("FirstName",firstName);
            birthDeatailsIntent.putExtra("lastName",lastName);
            birthDeatailsIntent.putExtra("hnoApartment",HNoApartment);
            birthDeatailsIntent.putExtra("street",Street);
            birthDeatailsIntent.putExtra("city",City);
            birthDeatailsIntent.putExtra("countryName",Countryname);
            startActivity(birthDeatailsIntent);
        });

    }
}