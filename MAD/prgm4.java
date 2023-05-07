package com.example.lab1prgm;

import com.example.lab1prgm.R;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button cse;
    Button ece;
    Button mech;
    Button eee;
    Button cnit;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cse = findViewById(R.id.cse);
        ece = findViewById(R.id.ece);
        cnit = findViewById(R.id.cnit);
        mech = findViewById(R.id.mech);
        eee = findViewById(R.id.eee);
        cse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "welcome to cse",
                        Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.reva.edu.in/course/btech-in-computer-science-and-engineering"));
                startActivity(i);
            }
        });
        ece.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "welcome to ECE",
                        Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.reva.edu.in/course/btech-in-electronics-and-communication-engineering"));
                startActivity(i);
            }
        });
        mech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "welcome to Mech", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.reva.edu.in/course/btech-in-mechanical-engineering"));
                startActivity(i);
            }
        });
        eee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "welcome to EEE",
                        Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.reva.edu.in/course/btech-in-electrical-and-electronics-engineering"));
                startActivity(i);
            }
        });
        cnit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "welcome to CNIT",
                        Toast.LENGTH_SHORT).show();
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.reva.edu.in/course-list/school-of-computing-and-information-technology"));
                startActivity(i);
            }
        });
    }
}
