package com.example.instagram2;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    //Variabel komponen
    EditText txtUsername;
    EditText txtPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsername = findViewById(R.id.txtUsername);
        txtPassword = findViewById(R.id.txtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View View) {
                String usernameInput = txtUsername.getText().toString().toLowerCase();
                String passwordInput = txtPassword.getText().toString().toLowerCase();
                if ("pajri".equals(usernameInput) && "pajri".equals(passwordInput)) {
                    Toast.makeText(MainActivity.this, "Login Berhasil", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this, com.example.instagram2.kalkulator.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Login Gagal", Toast.LENGTH_LONG).show();
                }


            }
        });
    }}