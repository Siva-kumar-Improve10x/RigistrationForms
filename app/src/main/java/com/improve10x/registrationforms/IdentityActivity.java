package com.improve10x.registrationforms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class IdentityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_identity);
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
        String CardNumber = intent.getStringExtra("cardNumber");
        String CardHolder = intent.getStringExtra("cardHolder");
        String Expiry = intent.getStringExtra("expriy");
        String Cvv = intent.getStringExtra("cvv");
        Toast.makeText(this,  emailAddress + " "+ UserName+ " " + FirstName + " " + lastName + " " + HNo + " " + Street + " " + City + " " +Country + " " + dateOfBirth + " " + placeOfBirth + " "+ CurrentCompany+ " " +TotalExperience+" "+Designation+" " +bankName +" " +AccountHolderName+" "+AccountNumber+ " "+ Ifsc + " " + CardNumber+" "+ CardHolder+" "+ Expiry + " " + Cvv , Toast.LENGTH_SHORT).show();


        EditText panNumberText = findViewById(R.id.pan_txt);
        panNumberText.setText("ABCTY1234D");
        EditText aadharText = findViewById(R.id.aadhar_txt);
        aadharText.setText("437858641012");
        String Pannumber = panNumberText.getText().toString();
        String AAdharNumber = aadharText.getText().toString();


        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> {
            finish();
        });
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(v -> {
            Intent successIntent = new Intent(this, RegistrationSuccessfulActivity.class);
            successIntent.putExtra("emailAddress", emailAddress);
            successIntent.putExtra("userName",UserName);
            successIntent.putExtra("firstName",FirstName);
            successIntent.putExtra("lastName",lastName);
            successIntent.putExtra("hNo",HNo);
            successIntent.putExtra("street",Street);
            successIntent.putExtra("city",City);
            successIntent.putExtra("country",Country);
            successIntent.putExtra("dateOfBirth",dateOfBirth);
            successIntent.putExtra("placeOfBirth",placeOfBirth);
            successIntent.putExtra("currentCompany",CurrentCompany);
            successIntent.putExtra("totalExperience",TotalExperience);
            successIntent.putExtra("Designation",Designation);
            successIntent.putExtra("bankName",bankName);
            successIntent.putExtra("accountHolderName",AccountHolderName);
            successIntent.putExtra("accountNumber",AccountNumber);
            successIntent.putExtra("ifsc",Ifsc);
            successIntent.putExtra("cardNumber",CardNumber);
            successIntent.putExtra("cardHolder",CardHolder);
            successIntent.putExtra("expiry",Expiry);
            successIntent.putExtra("cvv",Cvv);
            successIntent.putExtra("panNumber",Pannumber);
            successIntent.putExtra("aadharNumber",AAdharNumber);

            startActivity(successIntent);












        });

    }
}