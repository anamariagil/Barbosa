package com.example.barbosa;

import android.widget.Button;

import java.io.Serializable;

public class Celda implements Serializable{

    int img;
    String text, description;

    public Celda(String text, int img, String description){
        this.img = img;
        this.text = text;
        this.description = description;
    }

    public Celda(String string, int cinicio, String string1, int b) {
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
