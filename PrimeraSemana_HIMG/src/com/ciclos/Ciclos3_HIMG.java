/*
 * 3. Realiza un programa para determinar si un String es palíndromo
 */

package com.ciclos;

import java.util.Scanner;

public class Ciclos3_HIMG {

	public static void main(String[] args) {
		// Creación de las variables.
		String frase;
		String frase2;
		// Creación del objeto entrada derivado de la clase Scanner para recibir datos por consola/teclado.
		Scanner entrada = new Scanner(System.in);
		// Solicitud de la cadena (String) al usuario.
		System.out.println("Ingresa una cadena de texto: ");
		// La variable frase guardara la cadena de texto ingresada por el usuario.
		// entrada.nextLine();
		frase = entrada.nextLine(); // Consumimos el espacio del salto de linea.
		frase2 = new StringBuilder(frase).reverse().toString();// Invertimos la cadena con StringBuilder.
		entrada.close();
		
		// Inicio de ciclo for para determinar si la cadena de texto 
		// contiene las mismas letras de izquierda a derecha y viceversa.
		boolean palindromo = true; // Se crea una variable de tipo boolean para determinar si es o no es palindromo la cadena de texto. 
		int length = frase.length();
		// Inicialización del ciclo for.
		for (int i = 0; i < length; i++) {
			if (frase.charAt(i) != frase2.charAt(i)) {
				palindromo = false;
				break;
				
			}
			
		}
		// Mostrar en la pantalla si la cadena de texto ingresada es un palíndromo.
		if (palindromo == true) {
			System.out.println("La cadena de texto es un palíndromo.");
		}else {
			System.out.println("La cadena de texto no es un palíndromo");
		}
	}

}
