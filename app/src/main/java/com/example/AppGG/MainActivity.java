package com.example.AppGG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.act3.R;

public class MainActivity extends AppCompatActivity {

    Button btnActivity1, btnActivity2, btnActivity3, btnActivity4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnActivity1 = (Button) findViewById(R.id.btnActivity1);
        btnActivity2 = (Button) findViewById(R.id.btnActivity2);
        btnActivity3 = (Button) findViewById(R.id.btnActivity3);
        btnActivity4 = (Button) findViewById(R.id.btnActivity4);

//        btnActivity1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "This button is clicked", Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.btnActivity1:
                Toast.makeText(MainActivity.this, "Activity 1 button is clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnActivity2:
                Toast.makeText(MainActivity.this, "Activity 2 button is clicked", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(this, MainActivity2.class);
                startActivity(intent2);
                break;

            case R.id.btnActivity3:
                Toast.makeText(MainActivity.this, "Activity 3 button is clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnActivity4:
                Toast.makeText(MainActivity.this, "Activity 4 button is clicked", Toast.LENGTH_SHORT).show();
                break;
        }
    }

}