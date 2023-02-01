package com.improve10x.registrationforms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ProfessionalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professional);
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
        Toast.makeText(this,  emailAddress+" "+ UserName + " " + FirstName+ " "+ lastName + " " + HNo + " " + Street + " "+ City + " " + Country + " " +   dateOfBirth +" "+placeOfBirth+" ", Toast.LENGTH_SHORT).show();

        EditText currentCompanyText = findViewById(R.id.currentcampany_txt);
        currentCompanyText.setText("Improve10X");
        EditText totalExperienceText = findViewById(R.id.totalexperience_txt);
        totalExperienceText.setText("Fresher");
        EditText degisnationText = findViewById(R.id.designation_txt);
        degisnationText.setText("SoftWare");

        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> {
           finish();
        });
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(v -> {
            String Currentcompany = currentCompanyText.getText().toString();
            String Totalexperience = totalExperienceText.getText().toString();
            String Degisnation = degisnationText.getText().toString();
            Intent bankIntent = new Intent(this, BankaccountActivity.class);
            bankIntent.putExtra("emailAddress",emailAddress);
            bankIntent.putExtra("UserName",UserName);
            bankIntent.putExtra("FirstName",FirstName);
            bankIntent.putExtra("lastName",lastName);
            bankIntent.putExtra("hnoApartment",HNo);
            bankIntent.putExtra("street",Street);
            bankIntent.putExtra("city",City);
            bankIntent.putExtra("countryName",Country);
            bankIntent.putExtra("birthPlace",dateOfBirth);
            bankIntent.putExtra("placeBirth",placeOfBirth);
            bankIntent.putExtra("currentCompany",Currentcompany);
            bankIntent.putExtra("totalExperience",Totalexperience);
            bankIntent.putExtra("degisnation",Degisnation);
            startActivity(bankIntent);
        });
    }
}