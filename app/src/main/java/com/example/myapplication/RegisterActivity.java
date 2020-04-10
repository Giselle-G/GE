package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    Button btn_register;
    Button to_login;
    EditText user_name,psw1,psw2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        init();
    }
    private void init() {
        btn_register=findViewById(R.id.btn_register);
        to_login=findViewById(R.id.to_login);

        user_name=findViewById(R.id.userName);
        psw1=findViewById(R.id.passwd);
        psw2=findViewById(R.id.passwd2);
        to_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(RegisterActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RegisterActivity.this,MainActivity.class);
                intent.putExtra("username",user_name.getText().toString());
                intent.putExtra("psw",psw1.getText().toString());
                startActivity(intent);
            }
        });
    }

}