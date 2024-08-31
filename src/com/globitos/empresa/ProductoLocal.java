package com.globitos.empresa;

public class ProductoLocal extends Producto {
    private int tiempoFabricacion; // Días necesarios para fabricar

    // Constructor
    public ProductoLocal(String nombre, double precio, int tiempoFabricacion) {
        super(nombre, precio); // Llama al constructor de la clase padre (Producto)
        this.tiempoFabricacion = tiempoFabricacion;
    }

    @Override
    public double calcularCosto() {
        // Implementación de cálculo con costos de fabricación
        return this.precio * 1.10; // Ejemplo de aumento del 10% por costos de fabricación
    }

    // Getters y Setters
    public int getTiempoFabricacion() {
        return tiempoFabricacion;
    }

    public void setTiempoFabricacion(int tiempoFabricacion) {
        this.tiempoFabricacion = tiempoFabricacion;
    }
}