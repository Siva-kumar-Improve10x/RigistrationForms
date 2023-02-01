package com.improve10x.registrationforms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreditcarddetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditcarddetails);
        Intent intent = getIntent();
        String emailAddress = intent.getStringExtra("emailAddress");
        String UserName = intent.getStringExtra("UserName");
        String FirstName = intent.getStringExtra("FirstName");
        String lastName = intent.getStringExtra("lastName");
        String HNo = intent.getStringExtra("hnoApartment");
        String Street = intent.getStringExtra("street");
        String City = intent.getStringExtra("city");
        String Country = intent.getStringExtra("countryName");
        String dateOfBirth = intent.getStringExtra("birthPlace");
        String placeOfBirth = intent.getStringExtra("placeBirth");
        String CurrentCompany = intent.getStringExtra("currentCompany");
        String TotalExperience = intent.getStringExtra("totalExperience");
        String Designation = intent.getStringExtra("degisnation");
        String bankName = intent.getStringExtra("bankName");
        String AccountHolderName = intent.getStringExtra("accountHolderName");
        String AccountNumber = intent.getStringExtra("accountNumber");
        String Ifsc = intent.getStringExtra("ifsc");

        Toast.makeText(this,  emailAddress + " "+ UserName+ " " + FirstName + " " + lastName + " " + HNo + " " + Street + " " + City + " " + Country + " " + dateOfBirth + " " + placeOfBirth + " "+ CurrentCompany+ " " +TotalExperience+" "+Designation+" " +bankName +" " +AccountHolderName+" "+AccountNumber+ " "+ Ifsc , Toast.LENGTH_SHORT).show();



        EditText cardNumberText = findViewById(R.id.cardnum_txt);
        cardNumberText.setText("2342 8764 7890");
        EditText cardholderText = findViewById(R.id.cardholder_txt);
        cardholderText.setText("Siva Kumar");
        EditText expiryText = findViewById(R.id.expiry_txt);
        expiryText.setText("07-11-2024");
        EditText cvvText = findViewById(R.id.cvv_txt);
        cvvText.setText("2312");
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> {
            finish();
        });
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(v -> {

            String CardNumber = cardNumberText.getText().toString();
            String CardHolder = cardholderText.getText().toString();
            String Expiry = expiryText.getText().toString();
            String CVV = cvvText.getText().toString();

            Intent identityIntent = new Intent(this, IdentityActivity.class);
            identityIntent.putExtra("emailAddress",emailAddress);
            identityIntent.putExtra("UserName",UserName);
            identityIntent.putExtra("FirstName",FirstName);
            identityIntent.putExtra("lastName",lastName);
            identityIntent.putExtra("hnoApartment",HNo);
            identityIntent.putExtra("street",Street);
            identityIntent.putExtra("city",City);
            identityIntent.putExtra("countryName",Country);
            identityIntent.putExtra("birthPlace",dateOfBirth);
            identityIntent.putExtra("placeBirth",placeOfBirth);
            identityIntent.putExtra("currentCompany",CurrentCompany);
            identityIntent.putExtra("totalExperience",TotalExperience);
            identityIntent.putExtra("degisnation",Designation);
            identityIntent.putExtra("bankName",bankName);
            identityIntent.putExtra("accountHolderName",AccountHolderName);
            identityIntent.putExtra("accountNumber",AccountNumber);
            identityIntent.putExtra("ifsc",Ifsc);
            identityIntent.putExtra("cardNumber",CardNumber);
            identityIntent.putExtra("cardHolder",CardHolder);
            identityIntent.putExtra("expriy",Expiry);
            identityIntent.putExtra("cvv",CVV);
            startActivity(identityIntent);
        });
    }
}