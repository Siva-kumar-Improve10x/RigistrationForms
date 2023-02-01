package com.improve10x.registrationforms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BirthdetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String emailAddress = intent.getStringExtra("emailAddress");
        String UserName = intent.getStringExtra("UserName");
        String FirstName = intent.getStringExtra("FirstName");
        String lastName = intent.getStringExtra("lastName");
        String HNo = intent.getStringExtra("hnoApartment");
        String Street = intent.getStringExtra("street");
        String City = intent.getStringExtra("city");
        String Country = intent.getStringExtra("countryName");

        Toast.makeText(this,  emailAddress + " "+ UserName + " " + FirstName+ " " + lastName + " " +HNo+" "+Street+" "+City+ " "+Country , Toast.LENGTH_SHORT).show();


        setContentView(R.layout.activity_birthdetails);
        EditText dateBrithText = findViewById(R.id.dob_txt);
        dateBrithText.setText("07-Nov-2000");
        EditText placeOfBirthText = findViewById(R.id.pob_txt);
        placeOfBirthText.setText("Nandyal");
        Button backBtn = findViewById(R.id.back_btn);
        backBtn.setOnClickListener(v -> {
            finish();
        });
        Button nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(v -> {
            String dateOfBrith =dateBrithText.getText().toString();
            String placeOfBrith = placeOfBirthText.getText().toString();

            Intent ProfessinalIntent = new Intent(this,ProfessionalActivity.class);
            ProfessinalIntent.putExtra("emailAddress",emailAddress);
            ProfessinalIntent.putExtra("UserName",UserName);
            ProfessinalIntent.putExtra("FirstName",FirstName);
            ProfessinalIntent.putExtra("lastName",lastName);
            ProfessinalIntent.putExtra("hnoApartment",HNo);
            ProfessinalIntent.putExtra("street",Street);
            ProfessinalIntent.putExtra("city",City);
            ProfessinalIntent.putExtra("countryName",Country);
            ProfessinalIntent.putExtra("birthPlace",dateOfBrith);
            ProfessinalIntent.putExtra("placeBirth",placeOfBrith);
            startActivity(ProfessinalIntent);
        });
    }
}