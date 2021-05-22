package com.example.barbosa;

import android.content.Intent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class listaAdaptador extends RecyclerView.Adapter<listaAdaptador.viewHolder> {

    ArrayList<Celda> listaDatos;

    public listaAdaptador(ArrayList<Celda> listaDatos) {
        this.listaDatos = listaDatos;
    }

    @NonNull
    @Override
    public listaAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vistaLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista,parent,false);
        return new viewHolder(vistaLista);
    }

    @Override
    public void onBindViewHolder(@NonNull listaAdaptador.viewHolder holder, int position) {
        holder.actualizarDatos(listaDatos.get(position));
    }

    @Override
    public int getItemCount() {
        return listaDatos.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView text;
        ImageView img;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.text);
            img = itemView.findViewById(R.id.img);
        }

        public void actualizarDatos(Celda celda) {
            text.setText(celda.getText());
            img.setImageResource(celda.getImg());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent next = new Intent(itemView.getContext(),MainActivity2.class);
                    next.putExtra("datosCelda", celda);
                    itemView.getContext().startActivity(next);
                }
            });
        }
    }
}
