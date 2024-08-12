/*
 * 1. Crea un array de 10 posiciones de n�meros con valores pedidos por teclado.
	Muestra por consola el �ndice y el valor al que corresponde.
 */

package com.arrays;

import java.util.Scanner;

public class Arrays1_HIMG {

	public static void main(String[] args) {
		// Declaraci�n del array y su tama�o.
		int [] array = new int[10];
		// Creaci�n del objeto entrada de la clase Scanner.
		Scanner entrada = new Scanner(System.in);
		
		
		// Inicializaci�n de ciclo for para que cada numero ingresado por consola ocupe un indice.
		for (int i = 0; i < array.length; i++) {
			System.out.println("Ingresa un numero: "); // Solicitud al usuario para que ingrese numeros para llenar el array.
			array [i] = entrada.nextInt();	
		}
		
		// Inicializaci�n de otro ciclo for para mostrar el contenido del array.
		for (int i = 0; i < array.length; i++) {
			System.out.println("Indice " + i + ":" + array[i]);
		}
		

	}

}
