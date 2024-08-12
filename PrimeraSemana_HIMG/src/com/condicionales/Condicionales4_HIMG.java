/*
 * 4. Realiza un programa que lea una cadena por teclado y compruebe si
 *    contiene letras may�sculas.
 */

package com.condicionales;

import java.util.Scanner;

public class Condicionales4_HIMG {

	public static void main(String[] args) {
		String cadena;
		// Creaci�n del objeto entrada derivado de la clase Scanner.
		Scanner entrada = new Scanner(System.in);
		// Solicitud para que el usuario ingrese una cadena de palabras.
		System.out.println("Ingresa una cadena de palabras: ");
		// cadena almacena las palbras ingresadas por el usuario.
		cadena = entrada.nextLine();
		
		// Comprobaci�n de si hay letras mayusculas en la cadena de palabras.
		if (Character.isUpperCase(cadena.charAt(0))) { // Si algun caracter es mayuscula en la cadena en este caso en la posici�n 0 se ejecuta el siguiente c�digo.
			System.out.println("La cadena de palabras contiene letras mayuasculas..."); 
		}else {
			System.out.println("La cadena no contiene letras mayusculas..");
		}
		

	}

}
