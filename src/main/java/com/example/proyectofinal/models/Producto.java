package com.example.proyectofinal.models;

import java.time.LocalDate;

public class Producto {
    private String nombre;
    private LocalDate caducidad;
    private float precio;
    private int id;
    private String marca;
    private String contenidoNeto;

    private int cantidad;

    public Producto(){

    }

    public Producto(String nombre, LocalDate caducidad, float precio, int id, String marca, String contenidoNeto, int cantidad) {
        this.nombre = nombre;
        this.caducidad = caducidad;
        this.precio = precio;
        this.id = id;
        this.marca = marca;
        this.contenidoNeto = contenidoNeto;
        this.cantidad=cantidad;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
