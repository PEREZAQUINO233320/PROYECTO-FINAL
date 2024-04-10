package com.example.proyectofinal.models;

import java.time.LocalDate;

public class ProductoMedicamento extends Producto {
    private String unidadGramo;
    private String laboratorio;

    public ProductoMedicamento() {
    }

    public ProductoMedicamento(String nombre, LocalDate caducidad, float precio, long id, String marca, String contenidoNeto, String unidadGramo, String laboratorio) {
        super(nombre, caducidad, precio, id, marca, contenidoNeto);
        this.unidadGramo = unidadGramo;
        this.laboratorio = laboratorio;
    }

    public String getUnidadGramo() {
        return unidadGramo;
    }

    public void setUnidadGramo(String unidadGramo) {
        this.unidadGramo = unidadGramo;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }
}