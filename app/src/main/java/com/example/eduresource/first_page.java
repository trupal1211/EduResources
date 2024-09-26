package com.example.eduresource;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class first_page extends AppCompatActivity {

    Button viewMaterialsButton,logoutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);

        // Find views
        viewMaterialsButton = findViewById(R.id.view_materials_button);
        logoutButton = findViewById(R.id.logout_button);

        // Handle view materials button click
        viewMaterialsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Intent to navigate to MaterialsActivity
                Intent intent = new Intent(first_page.this, secondpage.class);
                startActivity(intent);
            }
        });

        // Handle logout button click
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Logout logic here (e.g., clear session, etc.)
                // Redirect to LoginActivity
                Intent intent = new Intent(first_page.this, login.class);
                startActivity(intent);
                finish(); // Close the current activity
            }
        });
    }
}
