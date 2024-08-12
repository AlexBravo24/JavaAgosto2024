/*
 * 2. Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del
	1 al 100. Obt�n la suma de todos ellos y la media.
 */

package com.arrays;

public class Arrays2_HIMG {

	public static void main(String[] args) {
		// Creaci�n de variables.
		int suma = 0;
		// Creaci�n del array.
		int [] array = new int [100];
		// Inicializaci�n de ciclo for para llenar el array.
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;	
		}
		
		// Usamos un ciclo for para mostrar todos los numeros del array y realizar la suma.
		for(int num : array) {
			System.out.println(num);
			suma += num; // Esto seria lo mismo que expresarlo asi: << suma = suma + num >> .
		}
		
		
		// Calculamos la media y la almacenamos en una variable de tipo double.
		double media = (double) suma / array.length;
		
		// Mostramos el resultado de la suma y el resultado de la media.
		System.out.println("La suma de todos los numeros es: " + suma);
		System.out.println("La media de la suma de todos los numeros es: " + media);

	}

}
