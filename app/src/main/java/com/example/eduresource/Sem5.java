package com.example.eduresource;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Sem5 extends AppCompatActivity {

    Button ajt,ad,tfel,co,eces,se;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sem5);

        ajt = findViewById(R.id.ajt);
        ad = findViewById(R.id.ad);
        tfel = findViewById(R.id.tfel);
        co=findViewById(R.id.co);
        eces=findViewById(R.id.eces);
        se=findViewById(R.id.se);

        ajt.setOnClickListener(v->navigateTo("https://drive.google.com/drive/u/0/folders/1eBACUkW2ImkSTfClXZq8mJZEbHhvf2oi"));
        ad.setOnClickListener(v->navigateTo("https://drive.google.com/drive/u/0/folders/1eBACUkW2ImkSTfClXZq8mJZEbHhvf2oi"));
        tfel.setOnClickListener(v->navigateTo("https://drive.google.com/drive/u/0/folders/1tGH5jTQjOL0H7CbxyG4W-XS0dNEa16qw"));
        co.setOnClickListener(v->navigateTo("https://drive.google.com/drive/u/0/folders/1Ued5y-rwW6skuDndMS_CIBcwZtQB6xMy"));
        se.setOnClickListener(v->navigateTo("https://drive.google.com/drive/u/0/folders/1d9-CCXxSPLnwjGXz62_0kZWir1qyMzzm"));
        eces.setOnClickListener(v->navigateTo("https://drive.google.com/drive/u/0/folders/1dt1nosZdvWET0GSjb7ul-3einjN5XtnX"));

    }

    private void navigateTo(String url) {
        intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

}