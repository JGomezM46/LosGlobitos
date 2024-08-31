package com.globitos.empresa;

public class ProductoImportado extends Producto {
    private String paisOrigen;

    // Constructor
    public ProductoImportado(String nombre, double precio, String paisOrigen) {
        super(nombre, precio); // Llama al constructor de la clase padre (Producto)
        this.paisOrigen = paisOrigen;
    }

    @Override
    public double calcularCosto() {
        // Implementación de cálculo con costos de importación
        return this.precio * 1.30; // Ejemplo de aumento del 30% por importación
    }

    // Getters y Setters
    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
}