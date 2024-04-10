package com.example.proyectofinal.models;

import java.time.LocalDate;

public class ProductoHigiene extends Producto{
    private String tipo;

    public ProductoHigiene(){

    }

    public ProductoHigiene(String nombre, LocalDate caducidad, float precio, int id, String marca, String contenidoNeto, int cantidad, String tipo) {
        super(nombre, caducidad, precio, id, marca, contenidoNeto, cantidad);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
