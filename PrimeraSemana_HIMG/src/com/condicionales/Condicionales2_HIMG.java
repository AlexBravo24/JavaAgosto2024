/*
 * 2.Realiza un programa que pida un n�mero por teclado y nos indique si es par
 * o impar.
 */

package com.condicionales;

import java.util.Scanner;

public class Condicionales2_HIMG {

	public static void main(String[] args) {
		int num; // Creaci�n de variable para almacenar el numero ingresado por consola.
		Scanner entrada = new Scanner(System.in); // Creaci�n del objeto entrada de la clase Scanner que ingresa datos por consola.
		System.out.println("Ingresa un numero: ");
		num = entrada.nextInt(); // num almacenar� lo que se ingrese por consola.
		
		// Determinar si el numero ingresado es par o impar.
		if (num % 2 == 0) { // Impresi�n de mensaje en caso de ser par.
			System.out.println("El numero " + num + " es par"); 
		}else { // Impresi�n de mensaje en caso de ser impar.
			System.out.println("El numero " + num + " es impar");
		}
		
	}

}
