package com.example.eduresource;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

//have_acc

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signup);
        TextInputEditText regName=findViewById(R.id.name);
        TextInputEditText regUsername=findViewById(R.id.username);
        TextInputEditText regEmail=findViewById(R.id.email);
        TextInputEditText regPhoneNo=findViewById(R.id.phoneNo);
        TextInputEditText regPassword=findViewById(R.id.password);
        Button signup=findViewById(R.id.GO);
        Button go_login = findViewById(R.id.have_acc);
        Dbhelper DB=new Dbhelper(this);

        Intent intent = new Intent(signup.this,login.class);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=regName.getText().toString();
                String username=regUsername.getText().toString();
                String email=regEmail.getText().toString();
                String PhoneNo=regPhoneNo.getText().toString();
                String password=regPassword.getText().toString();
                if(username.equals("")||name.equals("")||password.equals("")||email.equals("")||password.equals("")){
                    Toast.makeText(signup.this,"please enter all the details",Toast.LENGTH_SHORT).show();
                }
                else{
                    Boolean checkuser=DB.checkusername(name,password);
                    if(checkuser==false){
                        Boolean insert=DB.insertData(username,name,password,email,PhoneNo);
                        if(insert==true){
                            Toast.makeText(getApplicationContext(),"register successfully,please login now",Toast.LENGTH_SHORT).show();
                            startActivity(intent);
                        }
                        else{
                            Toast.makeText(signup.this,"register failed",Toast.LENGTH_SHORT).show();

                        }
                    }
                    else{
                        Toast.makeText(signup.this,"user already exist",Toast.LENGTH_SHORT).show();

                    }
                }
            }
        });

        go_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }

}