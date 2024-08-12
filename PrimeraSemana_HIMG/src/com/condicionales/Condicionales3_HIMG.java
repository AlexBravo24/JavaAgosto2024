/*
 * 3.Crea un programa que pida al usuario dos n�meros y muestre el resultado
 * de su divisi�n. Si el segundo n�mero es 0, debe mostrar un mensaje de error.
 */

package com.condicionales;

import java.util.Scanner;

public class Condicionales3_HIMG {

	public static void main(String[] args) {
		// Creaci�n de variables para almacenar dos numeros para realizar la divisi�n.
		double num1;
		double num2;
		double resultado;
		Scanner entrada = new Scanner(System.in); // Creaci�n del objeto entrada de la clase Scanner para ingresar datos por consola.
		System.out.println("Ingresa un numero: "); // Solicitud del primer numero.
		num1 = entrada.nextInt(); // num1 guarda el valor ingresado por consola.
		System.out.println("Ingresa otro numero: "); // Solicitud del segundo numero.
		num2 = entrada.nextInt(); // num2 guarda el valor ingresado por consola.
		
		// Realizaci�n de la divisi�n y mostrar resultado.
		// En caso de que el segundo numero sea 0 mostrar mensaje de error.
		if (num2 != 0) {
			resultado = num1 / num2;
			System.out.println("El resultado de la operaci�n realizada es: " + resultado);
		}else {
			System.out.println("Error, no se puede dividir entre 0!!!!....");
		}
		
	}

}
