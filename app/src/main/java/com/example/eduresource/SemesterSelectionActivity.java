package com.example.eduresource;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SemesterSelectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester_selection);

        Button semester1Button = findViewById(R.id.semester1_button);
        Button semester2Button = findViewById(R.id.semester2_button);
        Button semester3Button = findViewById(R.id.semester3_button);
        Button semester4Button = findViewById(R.id.semester4_button);
        Button semester5Button = findViewById(R.id.semester5_button);
        Button semester6Button = findViewById(R.id.semester6_button);
        Button semester7Button = findViewById(R.id.semester7_button);
        Button semester8Button = findViewById(R.id.semester8_button);

        // Set click listeners for each button
        semester1Button.setOnClickListener(v -> openSemesterMaterials(1));
        semester2Button.setOnClickListener(v -> openSemesterMaterials(2));
        semester3Button.setOnClickListener(v -> openSemesterMaterials(3));
        semester4Button.setOnClickListener(v -> openSemesterMaterials(4));
        semester5Button.setOnClickListener(v -> openSemesterMaterials(5));
        semester6Button.setOnClickListener(v -> openSemesterMaterials(6));
        semester7Button.setOnClickListener(v -> openSemesterMaterials(7));
        semester8Button.setOnClickListener(v -> openSemesterMaterials(8));
    }

    private void openSemesterMaterials(int semester) {
        Intent intent = new Intent(SemesterSelectionActivity.this, MaterialsActivity.class);
        intent.putExtra("SEMESTER", semester);
        startActivity(intent);
    }
}
