/*
 * 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero
	introducido desde teclado, hasta la iteraci�n deseada por el usuario.
	Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
	 */

package com.ciclos;

import java.util.Scanner;

public class Ciclos2_HIMG {

	public static void main(String[] args) {
		// Creaci�n de variables.
		int num1;
		int num2;
		// Creaci�n del objeto entrada de la clase Scanner.
		Scanner entrada = new Scanner(System.in);
		// Solicitud de los numeros deseados por el usuario.
		System.out.println("Ingresa un numero: ");
		// El numero ingresado por la consola se guarda en la variable num1.
		num1 = entrada.nextInt();
		// Solicitud de los numeros deseados por el usuario.
		System.out.println("Ingresa un numero: ");
		// El numero ingresado por la consola se guarda en la variable num1.
		num2 = entrada.nextInt();

		/*
		 * La l�gica para realizar el programa que muestra la multiplicaci�n de los dos
		 * numeros ingresados.
		 */
		for (int i = 0; i < num2 + 1; i++) {
			System.out.println(num1 + " x " + i + " = " + num1 * i); // Impresi�n en consola del resultado.
					
				}

	}

}
