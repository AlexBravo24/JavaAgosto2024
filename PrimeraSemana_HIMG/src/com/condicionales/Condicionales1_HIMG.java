/*1.Realiza un programa que reciba dos números por teclado e indique cuál es
 * mayor o si son iguales.
*/
package com.condicionales;

import java.util.Scanner;

public class Condicionales1_HIMG {

	public static void main(String[] args) {
		int num1, num2; // Creacion de variable.
		Scanner entrada = new Scanner(System.in); // Creación del objeto entrada de la clase Scanner
		System.out.println("Ingresa el primer numero: "); // Solicitud al usuario del primer numero.
		num1 = entrada.nextInt(); // num1 guarda lo que el usuario ingresa a traves de la consola.
		System.out.println("Ingresa el segundo numero: "); // Solicitud al usuario del segundo numero.
		num2 = entrada.nextInt(); // num1 guarda lo que el usuario ingresa a traves de la consola.
		
		
		// Indicamos cual de los dos numeros ingresados es mayor o igual.
		if (num1>num2) {
			System.out.println("El numero, " + num1 + " es mayor que " + num2);
		}else if (num1<num2) {
			System.out.println("El numero " + num1 + " es menor que " + num2);
		}else {
			System.out.println("Ambos numeros son iguales");
		}

	}

}
