package com.globitos.empresa;

public class OrdenDeCompra {
    private Pedido pedido;

    // Constructor
    public OrdenDeCompra(Pedido pedido) {
        this.pedido = pedido;
    }

    // Método para procesar la orden
    public void procesarOrden() {
        System.out.println("Procesando la orden de compra para el cliente: " + pedido.getCliente().getNombre());
        System.out.println("Total a pagar: " + pedido.calcularTotal());
    }

    // Getters y Setters
    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}