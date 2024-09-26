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

public class Sem6 extends AppCompatActivity {

    Button fsd,daie,py,aos,lt;
    Intent intent;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sem6);

        fsd = findViewById(R.id.fsd);
        daie = findViewById(R.id.daie);
        py = findViewById(R.id.py);
        aos = findViewById(R.id.aos);
        lt = findViewById(R.id.lt);

        fsd.setOnClickListener(v->navigateTo("https://drive.google.com/drive/folders/14gnq9pWXgtvAcE3VFHLMjQzjVzwFlDBn"));
        daie.setOnClickListener(v->navigateTo("https://drive.google.com/drive/folders/1LXOv27MsYqYhfCCzcW3l1XyR_fWrQLM3"));
        py.setOnClickListener(v->navigateTo("https://drive.google.com/drive/folders/1COBm9OnVEgAZ9QU2iVWPAJhRmJ6kLa4H"));
        aos.setOnClickListener(v->navigateTo("https://drive.google.com/drive/folders/1NXFhby8Vn6MPDjs7mo2hOq_VCyeITW5C"));
        lt.setOnClickListener(v->navigateTo("https://drive.google.com/drive/folders/1flsIzE0j-j_ndk8tw0-UrqL_MJxBanAB"));

    }
    private void navigateTo(String url) {
        intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}