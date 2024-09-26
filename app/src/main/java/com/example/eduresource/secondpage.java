package com.example.eduresource;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class secondpage extends AppCompatActivity {
    Button cur,gate,ielts,cat,pla;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_secondpage);

        cur = findViewById(R.id.cur);
        pla = findViewById(R.id.pla);
        cat = findViewById(R.id.cat);
        ielts = findViewById(R.id.ielts);
        gate = findViewById(R.id.gate);



        // Handle view materials button click
        cur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent to navigate to MaterialsActivity
                Intent intent = new Intent(secondpage.this, SemList.class);
                startActivity(intent);
            }
        });
        pla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent to navigate to MaterialsActivity
                Intent intent = new Intent(secondpage.this, placementsubject.class);
                startActivity(intent);
            }
        });


    }
}