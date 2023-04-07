package com.example.AppGG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import com.example.act3.R;

public class Activity_Registration extends AppCompatActivity {

    Button btnSubmit, btnClear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        EditText textViewFirst = (EditText) findViewById(R.id.textViewFirst);
        EditText textViewLast = (EditText) findViewById(R.id.textViewLast);
        RadioButton radMale = (RadioButton) findViewById(R.id.radMale);
        RadioButton radFemale = (RadioButton) findViewById(R.id.radFemale);
        EditText editTextbdate = (EditText) findViewById(R.id.editTextbdate);
        EditText editTextphone = (EditText) findViewById(R.id.editTextphone);
        EditText editTextemail = (EditText) findViewById(R.id.editTextemail);
        Button btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fname = textViewFirst.getText().toString();
                String lname = textViewLast.getText().toString();
                String name = fname.concat(" ").concat(lname);
                String gender;
                if(radFemale.isChecked()){
                    gender = "Female";
                }
                else{
                    gender = "Male";
                }
                String bdate = editTextbdate.getText().toString();
                String phone = editTextphone.getText().toString();
                String email = editTextemail.getText().toString();

                Intent intent = new Intent(getApplicationContext(), Activity_Display.class);
                intent.putExtra("name_key", name);
                intent.putExtra("gender_key", gender);
                intent.putExtra("bdate_key", bdate);
                intent.putExtra("phone_key", phone);
                intent.putExtra("email_key", email);
                startActivity(intent);
                }
            });
        }
    }
