package com.example.proyectofinal.models;

import java.time.LocalDate;

public class Producto {
    private String nombre;
    private LocalDate caducidad;
    private float precio;
    private long id;
    private String marca;
    private String contenidoNeto;

    public Producto(){

    }

    public Producto(String nombre, LocalDate caducidad, float precio, long id, String marca, String contenidoNeto) {
        this.nombre = nombre;
        this.caducidad = caducidad;
        this.precio = precio;
        this.id = id;
        this.marca = marca;
        this.contenidoNeto = contenidoNeto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(LocalDate caducidad) {
        this.caducidad = caducidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getContenidoNeto() {
        return contenidoNeto;
    }

    public void setContenidoNeto(String contenidoNeto) {
        this.contenidoNeto = contenidoNeto;
    }
}
