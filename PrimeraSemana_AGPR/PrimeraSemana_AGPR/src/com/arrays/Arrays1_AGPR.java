package com.arrays;

import java.util.Scanner;

public class Arrays1_AGPR {

	public static void main(String[] args) {
		// Crea un array de 10 posiciones de números con valores pedidos por teclado.
		//Muestra por consola el índice y el valor al que corresponde
		
		Scanner input=new Scanner (System.in);
		int[] numero= new int[10];
		for (int indice = 0; indice < numero.length; indice++) {
			System.out.println("Ingresa un numero en el array en la posicion: "+indice);
			numero[indice]=input.nextInt();
		}
		for (int j = 0; j < numero.length; j++) {
			System.out.println("Posicion: "+ j +" tiene valor: "+numero[j]);
			
		}

	}

}
