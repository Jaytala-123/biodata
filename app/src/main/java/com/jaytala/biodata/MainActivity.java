package com.jaytala.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name, surname, number, email, birthdata, address, city, country, qualification, socialmedia;
    Button submit, reset;
    CheckBox coding, cricket, writing;
    RadioGroup gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        surname = findViewById(R.id.surname);
        number = findViewById(R.id.number);
        email = findViewById(R.id.email);
        birthdata = findViewById(R.id.birthdata);
        address = findViewById(R.id.address);
        city = findViewById(R.id.city);
        country = findViewById(R.id.country);
        qualification = findViewById(R.id.qualification);
        socialmedia = findViewById(R.id.socialmedia);
        coding = findViewById(R.id.coding);
        cricket = findViewById(R.id.cricket);
        writing = findViewById(R.id.writing);
        submit = findViewById(R.id.submit);
        reset = findViewById(R.id.reset);
        gender = findViewById(R.id.gender);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String n = name.getText().toString();
                String s = surname.getText().toString();
                String m = number.getText().toString();
                String e = email.getText().toString();
                String b = birthdata.getText().toString();
                String a = address.getText().toString();
                String c = city.getText().toString();
                String C = country.getText().toString();
                String q = qualification.getText().toString();
                String s1 = socialmedia.getText().toString();
                String g = coding.getText().toString();
                String r = cricket.getText().toString();
                String w = writing.getText().toString();
                int id = gender.getCheckedRadioButtonId();
                RadioButton button = findViewById(id);
                String hobby = "";

                hobby +="";

                if(cricket.isChecked()){

                    hobby += "cricket";
                }
                if(coding.isChecked()){

                    hobby +="coding";
                }
                if(writing.isChecked()){

                    hobby +="writing";
                }

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                intent.putExtra("name", n);
                intent.putExtra("surname", s);
                intent.putExtra("hobby", hobby);
                intent.putExtra("number", m);
                intent.putExtra("email", e);
                intent.putExtra("birthdata", b);
                intent.putExtra("address", a);
                intent.putExtra("city", c);
                intent.putExtra("country", C);
                intent.putExtra("qualification", q);
                intent.putExtra("socialmedia", s1);
                intent.putExtra("coding", s1);
                intent.putExtra("cricket", s1);
                intent.putExtra("writing", s1);
                intent.putExtra("gender",button.getText().toString());
                startActivity(intent);
                Toast.makeText(MainActivity.this, "android"+s1, Toast.LENGTH_SHORT).show();
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name.setText("");
                surname.setText("");
                number.setText("");
                email.setText("");
                birthdata.setText("");
                address.setText("");
                city.setText("");
                country.setText("");
                qualification.setText("");
                socialmedia.setText("");
            }
        });


    }
}