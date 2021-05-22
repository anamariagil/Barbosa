package com.example.barbosa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Celda> listaDatos = new ArrayList<>();
    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv=findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        crearLista();
        listaAdaptador adaptador= new listaAdaptador(listaDatos);
        rv.setAdapter(adaptador);
    }

    private void crearLista(){
        listaDatos.add(new Celda(getString(R.string.c), R.drawable.cinicio, getString(R.string.cd)));
        listaDatos.add(new Celda(getString(R.string.m), R.drawable.minicio, getString(R.string.md)));
        listaDatos.add(new Celda(getString(R.string.h), R.drawable.hinicio, getString(R.string.hd)));
        listaDatos.add(new Celda(getString(R.string.p), R.drawable.pdainicio, getString(R.string.pd)));
    }
}