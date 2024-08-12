package com.arrays;

public class Arrays5_FIPS {

	public static void main(String[] args) {
		// Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
		//respectivos precios. Muestra en consola la lista de productos y sus precios. 
		//Por lo menos 5 productos o artículos
        String[] productos = {"Laptop", "Teléfono", "Cámara", "Auriculares", "Smartwatch"};
        
        // Crear un array para los precios de los productos
        double[] precios = {1200.00, 600.00, 300.00, 50.00, 200.00};
        
        // Mostrar la lista de productos y sus precios
        System.out.println("Lista de productos y sus precios:");
        for (int i = 0; i < productos.length; i++) {
            System.out.printf("Producto: %-15s Precio: $%.2f\n", productos[i], precios[i]);
        }
    }
}