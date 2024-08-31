package com.globitos.empresa;

public class Importación {

    // Método para importar productos
    public void importarProducto(ProductoImportado producto) {
        System.out.println("Importando producto desde " + producto.getPaisOrigen() + ": " + producto.getNombre());
    }
}