package com.globitos.empresa;

public class Producción {

    // Método para fabricar productos locales
    public void fabricarProducto(ProductoLocal producto) {
        System.out.println("Fabricando producto local: " + producto.getNombre());
        System.out.println("Tiempo estimado de fabricación: " + producto.getTiempoFabricacion() + " días.");
    }
}