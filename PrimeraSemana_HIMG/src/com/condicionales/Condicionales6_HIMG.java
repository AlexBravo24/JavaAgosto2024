/*
 * 6. El director de una escuela est� organizando un viaje de estudios y requiere
      determinar cu�nto debe cobrar a cada alumno y cu�nto debe pagar a la
      compa��a de viajes por el servicio. La forma de cobrar es la siguiente: * Si son
      100 alumnos o m�s, el costo por cada alumno es de 65 euros. * De 50 a 99
      alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95
      euros. * Menos de 30 alumnos, el costo de la renta del autob�s es de 4000
      euros, sin importar el n�mero de alumnos. Realiza un algoritmo que permita
      determinar el pago a la compa��a de autobuses y lo que debe pagar cada
      alumno por el viaje.

 */

package com.condicionales;

import java.util.Scanner;

public class Condicionales6_HIMG {

	public static void main(String[] args) {
		// Creaci�n de variables.
		int numAlum;
		double costoAlum, costoTotal;
		// Creaci�n del objeto entrada de la clase Scanner
		Scanner entrada = new Scanner(System.in);
		// Solicitud de cantidad de alumnos van a ir al viaje.
		System.out.println("Ingresa cuantos alumnos realizar�n el viaje: ");
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
