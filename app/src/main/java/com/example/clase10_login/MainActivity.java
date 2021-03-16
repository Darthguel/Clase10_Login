package com.example.clase10_login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnAcceder;
    private TextView txtMensaje1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Mostrar (View view){
        btnAcceder = (Button) findViewById(R.id.btnMostrar);
        txtMensaje1 = (TextView) findViewById(R.id.txtMensaje);
        txtMensaje1.setVisibility(1);
        btnAcceder.setText("Procesando...");
    }


}