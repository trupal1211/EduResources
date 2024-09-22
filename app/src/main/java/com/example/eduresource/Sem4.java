package com.example.eduresource;

import android.annotation.SuppressLint;
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

public class Sem4 extends AppCompatActivity {

    Button dbms,ccn,dm,uhv,daa,mpi;
    Intent intent;
    private String url;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sem4);

        dbms = findViewById(R.id.dbms);
        ccn = findViewById(R.id.ccn);
        dm = findViewById(R.id.dm);
        uhv = findViewById(R.id.uhv);
        daa = findViewById(R.id.daa);
        mpi = findViewById(R.id.mpi);



        dbms.setOnClickListener(view -> navigateTo("https://drive.google.com/drive/folders/18lDgEgFo6fnAddxz3Uh2wMU1oK8PzNQV"));
        ccn.setOnClickListener(view -> navigateTo("https://drive.google.com/drive/folders/1Y39AQb1BF6c37RVU54D6Ud2EPwmTN5C-"));
        dm.setOnClickListener(view -> navigateTo("https://drive.google.com/drive/folders/1dO_ikJYZnHqN_biFP97BkFif2cMxb-HK"));
        uhv.setOnClickListener(view -> navigateTo("https://drive.google.com/drive/folders/1nm_zi5tabgKotvdac7Lkmy6lVUUgPzag"));
        daa.setOnClickListener(view -> navigateTo("https://drive.google.com/drive/folders/1e8GW_MLU8cBVWE0KuWOnbEIoSRv79ggI"));
        mpi.setOnClickListener(view -> navigateTo("https://drive.google.com/drive/folders/1mjCfkFcUTt4B-3QbmnSrjWgwTJTq1TYL"));

    }

    private void navigateTo(String url) {
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent);
    }
    }