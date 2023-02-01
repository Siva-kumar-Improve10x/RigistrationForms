package com.improve10x.registrationforms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BankaccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bankaccount);
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
        Toast.makeText(this,  emailAddress + " "+ UserName+ " " + FirstName + " " + lastName + " " + HNo + " " + Street + " " + City + " " +Country + " " + dateOfBirth + " " + placeOfBirth + " "+ CurrentCompany+ " " +TotalExperience+" "+Designation, Toast.LENGTH_SHORT).show();


        EditText banknameText = findViewById(R.id.bankname_txt);
        banknameText.setText("State Bank of India");
        EditText accountHolderNameText = findViewById(R.id.acholdername);
        accountHolderNameText.setText("Ankala siva kumar");
        EditText accountNumberText = findViewById(R.id.accnumber_txt);
        accountNumberText.setText("91100088871");
        EditText ifsccodeText = findViewById(R.id.ifsc_txt);
        ifsccodeText.setText("sbiff2335");
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> {
           finish();
        });
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(v -> {

            String BankName = banknameText.getText().toString();
            String AccountHolderName = accountHolderNameText.getText().toString();
            String Accountnumber = accountNumberText.getText().toString();
            String IFSC = ifsccodeText.getText().toString();

            Intent creditCardDetailsIntent = new Intent(this, CreditcarddetailsActivity.class);
            creditCardDetailsIntent.putExtra("emailAddress",emailAddress);
            creditCardDetailsIntent.putExtra("UserName",UserName);
            creditCardDetailsIntent.putExtra("FirstName",FirstName);
            creditCardDetailsIntent.putExtra("lastName",lastName);
            creditCardDetailsIntent.putExtra("hnoApartment",HNo);
            creditCardDetailsIntent.putExtra("street",Street);
            creditCardDetailsIntent.putExtra("city",City);
            creditCardDetailsIntent.putExtra("countryName",Country);
            creditCardDetailsIntent.putExtra("birthPlace",dateOfBirth);
            creditCardDetailsIntent.putExtra("placeBirth",placeOfBirth);
            creditCardDetailsIntent.putExtra("currentCompany",CurrentCompany);
            creditCardDetailsIntent.putExtra("totalExperience",TotalExperience);
            creditCardDetailsIntent.putExtra("degisnation",Designation);
            creditCardDetailsIntent.putExtra("bankName",BankName);
            creditCardDetailsIntent.putExtra("accountHolderName",AccountHolderName);
            creditCardDetailsIntent.putExtra("accountNumber",Accountnumber);
            creditCardDetailsIntent.putExtra("ifsc",IFSC);
            startActivity(creditCardDetailsIntent);
        });
    }
}