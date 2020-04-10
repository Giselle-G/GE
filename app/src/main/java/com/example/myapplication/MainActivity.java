package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView userName=findViewById(R.id.userName);
        TextView Password=findViewById(R.id.passwd);
        Button btn_register = findViewById(R.id.btn_register);
        Button btn_login=findViewById(R.id.btnLogin);

        String username = getIntent().getStringExtra("username");
        String password = getIntent().getStringExtra("psw");
        userName.setText(username);
        Password.setText(password);

        btn_register.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });}}