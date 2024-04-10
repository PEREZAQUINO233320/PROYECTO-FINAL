package com.example.proyectofinal.models;

import java.util.ArrayList;

public class Corte {
    private ArrayList<Venta> listaVentas;

    public ArrayList<Venta> getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(ArrayList<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }

    public void agregarCorte(Venta venta){
        listaVentas.add(venta);
    }
}
