package com.globitos.empresa;

public class Pedido {
    private Cliente cliente;
    private Producto[] productos;
    private int cantidad;

    // Constructor
    public Pedido(Cliente cliente, Producto[] productos, int cantidad) {
        this.cliente = cliente;
        this.productos = productos;
        this.cantidad = cantidad;
    }

    // Método para calcular el total del pedido
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularCosto() * cantidad;
        }
        return total;
    }

    // Getters y Setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}