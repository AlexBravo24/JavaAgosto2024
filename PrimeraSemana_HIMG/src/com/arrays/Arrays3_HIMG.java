/*
 * 3. Pide al usuario por teclado una frase y pasa sus caracteres a un array de
	caracteres.
 */

package com.arrays;

import java.util.Scanner;

public class Arrays3_HIMG {

	public static void main(String[] args) {
		// Creación de una variable de tipo String para almacenar la frase ingresada por el usuario.
		String frase;
		
		// Creación del array.
		char [] caracteres; 
		
		// Creación del objeto input derivado de la clase Scanner para leer la frase ingresada por el usuario.
		Scanner entrada = new Scanner(System.in);
		
		// Solicitamos al usuario que ingrese por teclado una frase.
		System.out.println("Ingresa una frase: ");
		frase = entrada.nextLine();
		entrada.close();
		
		// Conversión de la frase ingresada como un String a un array de caracteres.
		caracteres = frase.toCharArray(); // El metodo ".toCharArray" convierte la frase a un array de caracteres.
		
		// Mostrar el contenido del array.
		System.out.println("-----Este es un array de caracteres-----\n");
		for (int i = 0; i < caracteres.length; i++) {
			System.out.println(caracteres[i] + " ");
		}
		
			
		
		
		 
	}

}
