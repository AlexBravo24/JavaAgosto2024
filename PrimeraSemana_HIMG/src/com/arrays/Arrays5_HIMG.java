/*
 * 
 */

package com.arrays;

public class Arrays5_HIMG {

	public static void main(String[] args) {
		// Array de productos
        String[] productos = {"Manzana", "Plátano", "Naranja", "Pera", "Mango"};

        // Array de precios
        double[] precios = {50, 30, 60, 40, 20};

        // Verificar que ambos arrays tengan la misma longitud
        if (productos.length != precios.length) {
            System.out.println("Error: Los arrays de productos y precios deben tener la misma longitud.");
            return;
        }

        // Mostrar la lista de productos y sus precios
        System.out.println("----Lista de productos y sus precios:----");
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + ": $" + precios[i]);
        }
    }
}
	


