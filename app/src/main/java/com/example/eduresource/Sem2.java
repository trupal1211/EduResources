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

public class Sem2 extends AppCompatActivity {
    Button pps,ph,eng,mat;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sem2);

        pps = findViewById(R.id.pps2);
        ph = findViewById(R.id.Ph);
        mat= findViewById(R.id.maths2);
        eng = findViewById(R.id.eng);


        pps.setOnClickListener(v->navigateTo("https://drive.google.com/drive/folders/1cfFCNuVtCjT2nZTNiH1tZKUma9YpKPlX"));
        ph.setOnClickListener(v->navigateTo("https://drive.google.com/drive/folders/1j1qWtfA5H0HWQ_Vj9e8YeXzrf86WwWYW"));
        mat.setOnClickListener(v->navigateTo("https://drive.google.com/drive/folders/1NBUeaCg7urZz_cBrKiuqBSQdVlbCK4bQ"));
        eng.setOnClickListener(v->navigateTo("https://drive.google.com/drive/folders/1HYv4Uh0_yYRYQEuYYpFJPrVnoNhXdx4b"));

    }
    private void navigateTo(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}