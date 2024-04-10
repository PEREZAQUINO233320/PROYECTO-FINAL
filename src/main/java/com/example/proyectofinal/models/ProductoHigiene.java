package com.example.proyectofinal.models;

import java.time.LocalDate;

public class ProductoHigiene extends Producto{
    private String tipo;

    public ProductoHigiene(){

    }

    public ProductoHigiene(String nombre, LocalDate caducidad, float precio, long id, String marca, String contenidoNeto, String tipo) {
        super(nombre, caducidad, precio, id, marca, contenidoNeto);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
