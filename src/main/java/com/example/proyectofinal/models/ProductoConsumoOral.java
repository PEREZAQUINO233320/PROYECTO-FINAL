package com.example.proyectofinal.models;

import java.time.LocalDate;

public class ProductoConsumoOral extends Producto{
    private String categoria;
    private String sabor;



    public ProductoConsumoOral(String nombre, LocalDate caducidad, float precio, int id, String marca, String contenidoNeto, int cantidad, String categoria, String sabor) {
        super(nombre, caducidad, precio, id, marca, contenidoNeto, cantidad);
        this.categoria = categoria;
        this.sabor = sabor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
}
