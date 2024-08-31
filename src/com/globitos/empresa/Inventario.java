package com.globitos.empresa;

public class Inventario {
    private Producto[] productos;

    // Constructor
    public Inventario(Producto[] productos) {
        this.productos = productos;
    }

    // Método para verificar el stock
    public boolean verificarStock(Producto producto, int cantidad) {
        for (Producto p : productos) {
            if (p.getNombre().equals(producto.getNombre()) && cantidad <= producto.getPrecio()) {
                return true;
            }
        }
        return false;
    }

    // Getters y Setters
    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }
}