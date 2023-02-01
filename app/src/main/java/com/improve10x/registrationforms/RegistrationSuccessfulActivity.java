package com.improve10x.registrationforms;

import static com.improve10x.registrationforms.R.id.pannumber_txt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RegistrationSuccessfulActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_successful);
        Intent intent = getIntent();

        String emailAddress = intent.getStringExtra("emailAddress");
        TextView emailTxt = findViewById(R.id.email_txt);
        emailTxt.setText(emailAddress);

        String userName = intent.getStringExtra("userName");
        TextView userNameTxt = findViewById(R.id.username_txt);
        userNameTxt.setText(userName);

        String firstName = intent.getStringExtra("firstName");
        TextView firstNametxt = findViewById(R.id.firstName_txt);
        firstNametxt.setText(firstName);

        String lastName = intent.getStringExtra("lastName");
        TextView lastNametxt = findViewById(R.id.lastName_txt);
        lastNametxt.setText(lastName);

        String hno = intent.getStringExtra("hNo");
        TextView hnoTxt = findViewById(R.id.hno_txt);
        hnoTxt.setText(hno);

        String street = intent.getStringExtra("street");
        TextView streetTxt = findViewById(R.id.streetName_txt);
        streetTxt.setText(street);

        String city = intent.getStringExtra("city");
        TextView citytxt = findViewById(R.id.cityName_txt);
        citytxt.setText(city);

        String country = intent.getStringExtra("country");
        TextView countrytxt = findViewById(R.id.Country_txt);
        countrytxt.setText(country);

        String dateOfBirth = intent.getStringExtra("dateOfBirth");
        TextView dateOfBirthTxt = findViewById(R.id.dateOfBirth_txt);
        dateOfBirthTxt.setText(dateOfBirth);

        String placeOfBirth = intent.getStringExtra("placeOfBirth");
        TextView placeOfBithTxt = findViewById(R.id.placeOfBirth_txt);
        placeOfBithTxt.setText(placeOfBirth);

        String currentCompany = intent.getStringExtra("currentCompany");
        TextView currentCompanyTxt = findViewById(R.id.current_txt);
        currentCompanyTxt.setText(currentCompany);

        String totalExperience = intent.getStringExtra("totalExperience");
        TextView totalExperienceText = findViewById(R.id.experience_txt);
        totalExperienceText.setText(totalExperience);

        String designation = intent.getStringExtra("Designation");
        TextView DesignationTxt = findViewById(R.id.Designation_txt);
        DesignationTxt.setText(designation);

        String bankName = intent.getStringExtra("bankName");
        TextView bankNameTxt = findViewById(R.id.bank_txt);
        bankNameTxt.setText(bankName);

        String accountHolderName = intent.getStringExtra("accountHolderName");
        TextView accountHolderNameTxt = findViewById(R.id.accountHolder_txt);
        accountHolderNameTxt.setText(accountHolderName);

        String accountNumber = intent.getStringExtra("accountNumber");
        TextView accountNumberTxt = findViewById(R.id.accountNumber_txt);
        accountNumberTxt.setText(accountNumber);

        String Ifsc = intent.getStringExtra("ifsc");
        TextView ifscTxt = findViewById(R.id.ifsccode_txt);
        ifscTxt.setText(Ifsc);

        String cardNumber = intent.getStringExtra("cardNumber");
        TextView cardNumberTxt = findViewById(R.id.cardNumber_txt);
        cardNumberTxt.setText(cardNumber);

        String cardHolder = intent.getStringExtra("cardHolder");
        TextView cardHolderTxt = findViewById(R.id.cardholdername_txt);
        cardHolderTxt.setText(cardHolder);

        String expiry = intent.getStringExtra("expiry");
        TextView expiryTxt = findViewById(R.id.expirydate_txt);
        expiryTxt.setText(expiry);

        String cvv = intent.getStringExtra("cvv");
        TextView cvvTxt = findViewById(R.id.cvvname_txt);
        cvvTxt.setText(cvv);

        String panNumber = intent.getStringExtra("panNumber");
        TextView panNumberTxt = findViewById(R.id.pannumber_txt);
        panNumberTxt.setText(panNumber);

        String aadharNumber = intent.getStringExtra("aadharNumber");
        TextView aadharNumberTxt = findViewById(R.id.aadharNumber_txt);
        aadharNumberTxt.setText(aadharNumber);































    }
}