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

public class Sem7 extends AppCompatActivity {
Button ai,ml,do1,wt,dc;
Intent intent;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sem7);

        ai = findViewById(R.id.ai);
        ml = findViewById(R.id.ml);
        do1 = findViewById(R.id.do1);
        wt = findViewById(R.id.wt);
        dc = findViewById(R.id.dc);


        ai.setOnClickListener(v->navigateTo("https://drive.google.com/drive/folders/1O-_Lz7jCVdiCTUnodtNpkxAESKgUnjcG"));
        ml.setOnClickListener(v->navigateTo("https://drive.google.com/drive/folders/1rJLkJFenAIPwBAsl8o4jPyEkRTvAPiQf"));
        do1.setOnClickListener(v->navigateTo("https://drive.google.com/drive/folders/1zYoONI2mIZOZ_jAnKnRhS0gms3kyBaZH"));
        wt.setOnClickListener(v->navigateTo("https://drive.google.com/drive/folders/1qAF8ofZwj6EIFNv0Qwh2SfWIIXPtVtnA"));
        dc.setOnClickListener(v->navigateTo("https://drive.google.com/drive/folders/11yeEdFI-KVSVQLetH-cmwyYetiEjJ4kq"));


    }
    private void navigateTo(String url) {
        intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}