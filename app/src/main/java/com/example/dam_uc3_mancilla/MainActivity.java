package com.example.dam_uc3_mancilla;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Asocia el botón a un OnClickListener
        Button btnSearchFlights = findViewById(R.id.btnSearchFlights);
        btnSearchFlights.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Muestra un mensaje cuando el botón es presionado
                Toast.makeText(MainActivity.this, "Se envió su solicitud de vuelo", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
