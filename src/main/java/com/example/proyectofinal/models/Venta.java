package com.example.proyectofinal.models;

import java.util.ArrayList;

public class Venta {
    private ArrayList<Producto> listaVenta;
    private float totalVenta;

    public ArrayList<Producto> getListaVenta() {
        return listaVenta;
    }

    public void setListaVenta(ArrayList<Producto> listaVenta) {
        this.listaVenta = listaVenta;
    }

    public float getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(float totalVenta) {
        this.totalVenta = totalVenta;
    }

    public float calcularVenta(){
        float total=0;
        for (Producto i: listaVenta){
            total=i.getPrecio()+total;
        }
        return this.totalVenta=total;
    }

    public void cancelarVenta(){
        listaVenta.clear();
    }
}
