package com.example.semana3gustavo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RecibirDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibir_datos);

        EditText tMostrar = findViewById(R.id.etRecibirDato);
        Button bVolver = findViewById(R.id.btVolver);
        Bundle recibido = this.getIntent().getExtras();
        String datoRecibido = recibido.getString("dNombre");
        tMostrar.setText(datoRecibido);
        bVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Volver = new Intent(RecibirDatos.this,MainActivity.class);
                startActivity(Volver);
            }
        });
    }
}