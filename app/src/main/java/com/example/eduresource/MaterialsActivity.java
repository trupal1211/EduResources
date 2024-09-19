package com.example.eduresource;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MaterialsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materials);

        LinearLayout layout = findViewById(R.id.materials_layout);
        int semester = getIntent().getIntExtra("SEMESTER", 1);

        // Dynamically add buttons for each material in the selected semester
        addMaterialButtons(layout, semester);
    }

    private void addMaterialButtons(LinearLayout layout, int semester) {
        // Create buttons for each material in the selected semester
        String[] materialFiles = getMaterialFilesForSemester(semester);
        for (String fileName : materialFiles) {
            Button button = new Button(this);
            button.setText(fileName);
            button.setOnClickListener(v -> openMaterial(fileName));
            layout.addView(button);
        }
    }

    private String[] getMaterialFilesForSemester(int semester) {
        // Return file names based on the semester
        switch (semester) {
            case 3:
                return new String[]{"file1", "file2 "}; // Ensure files are in res/raw/
            case 2:
                return new String[]{"semester2_material1.pdf", "semester2_material2.pdf"};
            // Add more cases for other semesters
            default:
                return new String[]{};
        }
    }

    private void openMaterial(String fileName) {
        // Remove file extension to match resource ID naming convention
        String fileNameWithoutExtension = fileName.replace(".pdf", "");
        int resourceId = getResources().getIdentifier(fileNameWithoutExtension, "raw", getPackageName());
        if (resourceId != 0) {
            Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + resourceId);
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setDataAndType(uri, "application/pdf");
            startActivity(intent);
        } else {
            // Handle case where file does not exist
            Toast.makeText(this, "Material not found", Toast.LENGTH_SHORT).show();
        }
    }
}
