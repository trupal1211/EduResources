package com.example.eduresource;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SemList extends AppCompatActivity {

    Button semester1Button,semester2Button,semester3Button,semester4Button,semester5Button,semester6Button,semester7Button,semester8Button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem_list);

        semester1Button = findViewById(R.id.sem1btn);
        semester2Button = findViewById(R.id.semester2_button);
        semester3Button = findViewById(R.id.semester3_button);
        semester4Button = findViewById(R.id.semester4_button);
        semester5Button = findViewById(R.id.semester5_button);
        semester6Button = findViewById(R.id.semester6_button);
        semester7Button = findViewById(R.id.semester7_button);
        semester8Button = findViewById(R.id.semester8_button);

        // Set click listeners for each button
        semester1Button.setOnClickListener(v -> openSemesterMaterials(1));
        semester2Button.setOnClickListener(v -> openSemesterMaterials(2));
        semester3Button.setOnClickListener(v -> openSemesterMaterials(3));
        semester4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SemList.this, Sem4.class);
                startActivity(intent);
            }
        });
        semester5Button.setOnClickListener(v -> openSemesterMaterials(5));
        semester6Button.setOnClickListener(v -> openSemesterMaterials(6));
        semester7Button.setOnClickListener(v -> openSemesterMaterials(7));
        semester8Button.setOnClickListener(v -> openSemesterMaterials(8));
    }

    private void openSemesterMaterials(int semester) {
//        Intent intent = new Intent(SemList.this, MainActivity.class);
//        startActivity(intent);
    }
}
