package com.example.instrukciopedijaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class RegisterKorisnikActivity extends AppCompatActivity {

    Button back_btn_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_korisnik);

        back_btn_2 = findViewById(R.id.back_btn_2);
        back_btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterKorisnikActivity.this, LoginActivity.class));
            }
        });
    }

}