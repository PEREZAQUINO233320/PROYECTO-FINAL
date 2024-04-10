package com.example.proyectofinal.models;

import java.time.LocalDate;
import java.util.ArrayList;

public class CatalogoProveedor {
    String nombre;
    LocalDate caducidad;
    ArrayList<Proveedor> listaProveedores = new ArrayList<>();

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

    public ArrayList<Proveedor> getListaProveedores() {
        return listaProveedores;
    }

    public void setListaProveedores(ArrayList<Proveedor> listaProveedores) {
        this.listaProveedores = listaProveedores;
    }
    public void altaProveedor(String nombre, String fechaDeLlegada){

    }
    public void bajaProveedores(String nombre){

    }
    public void editarProveedor(){

    }
    public void mostrarProveedores(){

    }
}
