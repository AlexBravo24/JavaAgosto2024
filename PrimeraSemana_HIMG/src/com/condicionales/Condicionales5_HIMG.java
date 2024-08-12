/*
 * 5. Realiza un programa que calcule la aceptaci�n de una solicitud en base a
      los siguientes par�metros: edad, nota y sexo.
 *    M�nimo: Nota (5), edad (18), sexo M -> POSIBLE
 *    M�nimo: Nota (5), edad (18), sexo F -> ACEPTADA
 *    Otros casos -> NO ACEPTADA
 */

package com.condicionales;

import java.util.Scanner;

public class Condicionales5_HIMG {

	public static void main(String[] args) {
		int nota, edad;
		String sexo;
		// Creaci�n del objeto entrada derivado de la clase Scanner.
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa tu calificaci�n de nota:");
		nota = entrada.nextInt();
		System.out.println("Ingresa tu edad: ");
		edad = entrada.nextInt();
		System.out.println("Ingresa tu sexo: M | F ");
		entrada.nextLine();
		sexo = entrada.nextLine();
		
		// Definimos en base a los parametros ingresados si es aceptado 
		// si es mujer o posible aceptaci�n si es hombre o en otro caso distinto no aceptada.
		
		if (nota >=5 && edad >= 18 && sexo.equals("F")) {
			System.out.println("Aceptada");
		}else if (nota >=5 && edad >= 18 && sexo.equals("M")) {
			System.out.println("Posible");
		}else {
			System.out.println("No aceptada");
		}

	}

}
