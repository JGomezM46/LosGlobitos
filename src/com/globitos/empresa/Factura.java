package com.globitos.empresa;

public class Factura {
    private Pedido pedido;
    private double total;

    // Constructor
    public Factura(Pedido pedido) {
        this.pedido = pedido;
        this.total = pedido.calcularTotal();
    }

    // Método para generar la factura
    public void generarFactura() {
        System.out.println("Factura generada para el cliente: " + pedido.getCliente().getNombre());
        System.out.println("Total a pagar: " + total);
    }

    // Getters y Setters
    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}