package com.example.instrukciopedijaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {


    Button reg_kao_kori;
    Button btn_register_instruktor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Button btn_register_instruktor;
        btn_register_instruktor = (Button) findViewById(R.id.button_regInstruktor);
        btn_register_instruktor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegisterActivity();
            }
        });



    }
    public void openRegisterActivity() {
        Intent register_intent;
        register_intent = new Intent(this, RegisterUserActivity.class);
        startActivity(register_intent);
    }






}