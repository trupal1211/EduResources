package com.example.eduresource;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Sem3 extends AppCompatActivity {

    Button dsa,ddc,cs,pts,etc,java;
    Intent intent;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sem3);

        java = findViewById(R.id.java);
        cs = findViewById(R.id.cs);
        ddc = findViewById(R.id.ddc);
        dsa = findViewById(R.id.dsa);
        etc = findViewById(R.id.etc);
        pts = findViewById(R.id.pts);

        java.setOnClickListener(v->navigateTo("https://drive.google.com/drive/u/0/folders/105atWRgWhQ454J04KyZ1ubYxgzAWawM6"));
        cs.setOnClickListener(v->navigateTo("https://drive.google.com/drive/u/0/folders/1CO8l7RNxitdPEhF8bQNXCQZT1IVem5yY"));
        ddc.setOnClickListener(v->navigateTo("https://drive.google.com/drive/u/0/folders/1dA9Gt4Mr0GkZOl8uTpVBbfqd3Auz_nfa"));
        dsa.setOnClickListener(v->navigateTo("https://drive.google.com/drive/u/0/folders/19U9UPUS_vFRDjXGehHPxhPY1Rmq4BM"));
        etc.setOnClickListener(v->navigateTo("https://drive.google.com/drive/u/0/folders/1_5p0-zN-e3eQ7u9wUSeyjXp8K2ygzpJg"));
        pts.setOnClickListener(v->navigateTo("https://drive.google.com/drive/u/0/folders/1ZErMGhuWX26E6N_kFkYOfecJxlFAohnF"));
    }

    private void navigateTo(String url) {
        intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}