package com.example.proyectofinal.models;

import java.time.LocalDate;

public class ProductoConsumoOral extends Producto{
    private String categoria;
    private String sabor;

    public ProductoConsumoOral(){

    }

    public ProductoConsumoOral(String nombre, LocalDate caducidad, float precio, long id, String marca, String contenidoNeto, String categoria, String sabor) {
        super(nombre, caducidad, precio, id, marca, contenidoNeto);
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
