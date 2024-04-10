package com.example.proyectofinal.models;

public class Caja {
    private float totalVendido;

    public float getTotalVendido() {
        return totalVendido;
    }

    public void setTotalVendido(float totalVendido) {
        this.totalVendido = totalVendido;
    }

    public float sumarVentas(Venta venta){
        float total=0;
        total=venta.calcularVenta()+total;
        return this.totalVendido=total;
    }
}
