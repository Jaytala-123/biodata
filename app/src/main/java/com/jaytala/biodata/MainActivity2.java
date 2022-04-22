package com.jaytala.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    TextView name_a, surname_a,hobby_a, gender_a,number_a, email_a, birthdata_a, address_a, city_a, country_a, qualification_a, socialmedia_a;
    Button back, call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name_a = findViewById(R.id.name_a);
        surname_a = findViewById(R.id.surname_a);
        hobby_a = findViewById(R.id.hobby_a);
        number_a = findViewById(R.id.numbre_a);
        email_a = findViewById(R.id.email_a);
        birthdata_a = findViewById(R.id.birthdata_a);
        address_a = findViewById(R.id.address_a);
        city_a = findViewById(R.id.city_a);
        country_a = findViewById(R.id.country_a);
        qualification_a = findViewById(R.id.qualification_a);
        socialmedia_a = findViewById(R.id.socialmedia_a);
        back = findViewById(R.id.back);
        call = findViewById(R.id.call);
        gender_a = findViewById(R.id.gender_a);


        String name = getIntent().getStringExtra("name");
        String surname = getIntent().getStringExtra("surname");
        String hobby = getIntent().getStringExtra("hobby");
        String number = getIntent().getStringExtra("number");
        String email = getIntent().getStringExtra("email");
        String birthdata = getIntent().getStringExtra("birthdata");
        String address = getIntent().getStringExtra("address");
        String city = getIntent().getStringExtra("city");
        String country = getIntent().getStringExtra("country");
        String qualification = getIntent().getStringExtra("qualification");
        String socialmedia = getIntent().getStringExtra("socialmedia");
        String gender = getIntent().getStringExtra("gender");

        name_a.setText("name :-" + name);
        surname_a.setText("surname :-" + surname);
        hobby_a.setText("hooby :-" + hobby);
        number_a.setText("number :-" + number);
        email_a.setText("email :-" + email);
        birthdata_a.setText("birthdata :-" + birthdata);
        address_a.setText("address :-" + address);
        city_a.setText("city :-" + city);
        country_a.setText("country :-" + country);
        qualification_a.setText("qualification :-" + qualification);
        socialmedia_a.setText("socialmedia :-" + socialmedia);
        gender_a.setText(" :- " + gender);
        Toast.makeText(this, "Gender : "+gender, Toast.LENGTH_SHORT).show();

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_CALL);
                intent1.setData(Uri.parse("tel:" + number));
                startActivity(intent1);
                Log.e(TAG,"onclick : Call");
            }
        });
        Intent intent = new Intent(MainActivity2.this, MainActivity.class);


    }

}