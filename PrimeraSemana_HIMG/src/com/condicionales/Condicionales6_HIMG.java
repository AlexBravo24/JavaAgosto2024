/*
 * 6. El director de una escuela está organizando un viaje de estudios y requiere
      determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la
      compañía de viajes por el servicio. La forma de cobrar es la siguiente: * Si son
      100 alumnos o más, el costo por cada alumno es de 65 euros. * De 50 a 99
      alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95
      euros. * Menos de 30 alumnos, el costo de la renta del autobús es de 4000
      euros, sin importar el número de alumnos. Realiza un algoritmo que permita
      determinar el pago a la compañía de autobuses y lo que debe pagar cada
      alumno por el viaje.

 */

package com.condicionales;

import java.util.Scanner;

public class Condicionales6_HIMG {

	public static void main(String[] args) {
		// Creación de variables.
		int numAlum;
		double costoAlum, costoTotal;
		// Creación del objeto entrada de la clase Scanner
		Scanner entrada = new Scanner(System.in);
		// Solicitud de cantidad de alumnos van a ir al viaje.
		System.out.println("Ingresa cuantos alumnos realizarán el viaje: ");
		numAlum = entrada.nextInt();
		
		if (numAlum >= 100) { // Inicio de if
			costoAlum = 65;
			costoTotal = numAlum * 65;
			System.out.println("El costo por alumno es de: " + costoAlum + " euros.");
			System.out.println("El costo total a pagar es: " + costoTotal + " euros.");
		} // Cierre de if. 
		else if (numAlum >=50 && numAlum <= 99){ // Inicio de if
			costoAlum = 70;
			costoTotal = numAlum * 70;
			System.out.println("El costo por alumno es de: " + costoAlum + " euros.");
			System.out.println("El costo total a pagar es: " + costoTotal + " euros.");
		}// Cierre de if. 
		else if (numAlum >=30 && numAlum <= 49){ // Inicio de if
			costoAlum = 95;
			costoTotal = numAlum * 95;
			System.out.println("El costo por alumno es de: " + costoAlum + " euros.");
			System.out.println("El costo total a pagar es: " + costoTotal + " euros.");
		}// Cierre de if. 
		else if (numAlum < 30){ // Inicio de if
			costoTotal = 4000;
			costoAlum = costoTotal / numAlum;
			System.out.println("El costo por alumno es de: " + costoAlum + " euros.");
			System.out.println("El costo total a pagar es: " + costoTotal + " euros.");
		}// Cierre de if. 
	}

}
