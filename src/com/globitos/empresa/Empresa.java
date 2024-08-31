package com.globitos.empresa;

public class Empresa {
    private Inventario inventario;
    private Producción produccion;
    private Importación importacion;

    // Constructor
    public Empresa(Inventario inventario, Producción produccion, Importación importacion) {
        this.inventario = inventario;
        this.produccion = produccion;
        this.importacion = importacion;
    }

    // Método para realizar un pedido
    public void realizarPedido(Pedido pedido) {
        System.out.println("Realizando pedido para el cliente: " + pedido.getCliente().getNombre());
        for (Producto producto : pedido.getProductos()) {
            if (producto instanceof ProductoLocal) {
                produccion.fabricarProducto((ProductoLocal) producto);
            } else if (producto instanceof ProductoImportado) {
                importacion.importarProducto((ProductoImportado) producto);
            }
        }
    }

    // Método para facturar un pedido
    public void facturarPedido(Pedido pedido) {
        Factura factura = new Factura(pedido);
        factura.generarFactura();
    }
}