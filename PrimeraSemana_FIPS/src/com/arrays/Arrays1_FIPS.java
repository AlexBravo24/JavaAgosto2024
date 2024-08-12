package com.arrays;

import java.util.Scanner;

public class Arrays1_FIPS {

	public static void main(String[] args) {
		// Crea un array de 10 posiciones de n�meros con valores pedidos por teclado.
		//Muestra por consola el �ndice y el valor al que corresponde.
	      // Crear un array de 10 posiciones
        int[] numeros = new int[10];

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner entrada = new Scanner(System.in);

        // Leer valores desde el teclado
        System.out.println("Ingresa 10 n�meros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("N�mero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        // Mostrar los �ndices y los valores
        System.out.println("�ndice y valor de cada posici�n del array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("�ndice " + i + ": " + numeros[i]);
        }

        // Cerrar el objeto Scanner
        entrada.close();
    }
}