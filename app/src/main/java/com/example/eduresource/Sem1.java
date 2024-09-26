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

public class Sem1 extends AppCompatActivity {
    Button pps,beee,m1,egd;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sem1);
        pps = findViewById(R.id.pps1);
        beee = findViewById(R.id.beee);
        m1 = findViewById(R.id.maths1);
        egd = findViewById(R.id.egd);


        pps.setOnClickListener(v->navigateTo("https://drive.google.com/drive/folders/1zDv_X6-8oEEgis5XzwZA87aIUOzMkTRj"));
        beee.setOnClickListener(v->navigateTo("https://drive.google.com/drive/folders/1sJSzi4NLzm6PJo086RKX9e_VIc5nOtQE"));
        m1.setOnClickListener(v->navigateTo("https://drive.google.com/drive/folders/14TXMlV68ZKpiWS4bnjFQ_7NlfBbw2d3P"));
        egd.setOnClickListener(v->navigateTo("https://drive.google.com/drive/folders/1QZGiFR-Birg0XYrVrqpMJ3i2P1vw4mCZ"));

    }
    private void navigateTo(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}