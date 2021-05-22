package com.example.barbosa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    Celda celda;
    ImageView img;
    TextView text;
    TextView description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        img = findViewById(R.id.img);
        text = findViewById(R.id.text);
        description = findViewById(R.id.description);

        celda = (Celda) getIntent().getSerializableExtra("datosCelda");

        img.setImageResource(celda.getImg());
        text.setText(celda.getText());
        description.setText(celda.getDescription());

    }
}