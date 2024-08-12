package com;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// Arrays
		
		/*
		 * Los arrays o arreglos también conocidos como vectores
		 * son una estructura de datos que nos permiten almnacenar
		 * un tipo de datos en común.
		 * Son una especie de colección de datos. 
		 */
		
		// Una vez declarado su tamaño o longitud este no puede crecer.
		// en tiempo de ejecución.
		 
		// Formas de declarar un array.
		// Declarando un array de numeros enteros con su tamaño.
		int [] numeros = new int [5];
		
		// Guardar o asignar valores a cada posición del array.
		numeros [0] = 1;
		numeros [1] = 10;
		numeros [2] = 20;
		numeros [3] = 30;
		numeros [4] = 40;
		// numeros [5] = 15; // Si quiero agregar una posición más 
		// puedo "hacerlo", por que la sintaxis es correcta, sin embargo el indice no existe,
		// por que el array ya tiene un tamaño declarado.
		
		// Imprimir en consola determinada posición del array.
		System.out.println(numeros[4]);
		
		// Declarando un Scanner para solicitar los valores por teclado.
		Scanner entrada = new Scanner(System.in);
		int [] numeros2 = new int [5];
		
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println("Ingresa un numero en la posición " + i);
			numeros2[i] = entrada.nextInt();
		}
		//  Si ya no utilizo Scanner para introducir datos
		// lo correcto es cerrarlo para ahorrar recursos en memoria.
		entrada.close();
		
		// Vamos a imprimir un valor guardado una vez teniendo numeros en el array.
		System.out.println(numeros2[3]);
		
		// O para imprimirlos todos puedo hacer uso nuevamente de un ciclo.
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println(numeros2[i] + ",");
			System.out.println(" ");
			
		}
		
		// Otra manera de declarar un array
		// es con sus valores definidos desde un inicio.
		int [] numeros3 = {1, 2, 3, 4, 5};
		
		char [] nombre = {'A', 'B', 'C', 'D'};
		
		String [] nombres = {"Abraham", "Rafael", "Jafet", "Jareth", "Marcos"};
		
		// Otra forma de imprimir todos los valores de un array 
		// con un ciclo for each.
		for (String i:nombres) { // Para cada elemento del array.
			System.out.println(i); // Imprime cada uno en una nueva linea.
		}

	}

}
