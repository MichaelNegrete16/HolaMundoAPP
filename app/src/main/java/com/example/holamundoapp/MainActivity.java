package com.example.holamundoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Login(View v){
        EditText user = findViewById(R.id.user);
        String tag;
        Log.d( tag= "Usuario O Correo:", user.getText().toString());
        EditText pass = findViewById(R.id.pass);
        Log.d( tag= "Contraseña:", pass.getText().toString());

    }

    public void Register(View v){

    }

    public void Register2(View v){

    }

    public void PruebaClick(View v){

    }
}
