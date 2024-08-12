package com.arrays;

import java.util.Scanner;

public class Arrays1_FIPS {

	public static void main(String[] args) {
		// Crea un array de 10 posiciones de números con valores pedidos por teclado.
		//Muestra por consola el índice y el valor al que corresponde.
	      // Crear un array de 10 posiciones
        int[] numeros = new int[10];

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner entrada = new Scanner(System.in);

        // Leer valores desde el teclado
        System.out.println("Ingresa 10 números:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        // Mostrar los índices y los valores
        System.out.println("Índice y valor de cada posición del array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }

        // Cerrar el objeto Scanner
        entrada.close();
    }
}