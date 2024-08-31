package com.globitos.empresa;

public class Main {
    public static void main(String[] args) {
        // Creación de un cliente
        Cliente cliente = new Cliente("Juan Perez", "Calle Falsa 123", "123456789", "juan@example.com");

        // Creación de productos
        Producto producto1 = new ProductoLocal("Sombrilla", 50.0, 5);
        Producto producto2 = new ProductoImportado("Taza", 20.0, "China");

        // Creación del pedido
        Pedido pedido = new Pedido(cliente, new Producto[]{producto1, producto2}, 2);

        // Creación de la empresa y sus módulos
        Inventario inventario = new Inventario(new Producto[]{producto1, producto2});
        Producción produccion = new Producción();
        Importación importacion = new Importación();

        Empresa empresa = new Empresa(inventario, produccion, importacion);

        // Procesar pedido y facturación
        empresa.realizarPedido(pedido);
        empresa.facturarPedido(pedido);
    }
}