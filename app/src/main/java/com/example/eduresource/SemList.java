package com.example.eduresource;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SemList extends AppCompatActivity {

    Button semester1Button,semester2Button,semester3Button,semester4Button,semester5Button,semester6Button,semester7Button,semester8Button;
    Intent intent;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem_list);

        semester1Button = findViewById(R.id.sem1btn);
        semester2Button = findViewById(R.id.sem2btn);
        semester3Button = findViewById(R.id.sem3btn);
        semester4Button = findViewById(R.id.sem4btn);
        semester5Button = findViewById(R.id.sem5btn);
        semester6Button = findViewById(R.id.sem6btn);
        semester7Button = findViewById(R.id.sem7btn);


       // semester1Button.setOnClickListener(v -> redirectTo(1));
        //semester2Button.setOnClickListener(v -> redirectTo(2));
        semester1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(SemList.this, Sem1.class);
                startActivity(intent);

            }
        });
        semester2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(SemList.this, Sem2.class);
                startActivity(intent);

            }
        });
        semester3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(SemList.this, Sem3.class);
                startActivity(intent);

            }
        });

        semester4Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(SemList.this, Sem4.class);
                startActivity(intent);
            }
        });
        semester5Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(SemList.this, Sem5.class);
                startActivity(intent);

            }
        });
        semester6Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(SemList.this, Sem6.class);
                startActivity(intent);

            }
        });
        semester7Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(SemList.this, Sem7.class);
                startActivity(intent);

            }
        });

    }


}
