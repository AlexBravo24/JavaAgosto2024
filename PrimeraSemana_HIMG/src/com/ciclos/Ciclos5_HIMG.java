/*
 * 5. Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2%
	de interés mensual. ¿Cuál será la cantidad de dinero que esta persona
	tendrá al cabo de un año si todo el dinero lo reinvierte?
 */

package com.ciclos;

public class Ciclos5_HIMG {

	public static void main(String[] args) {
		// Creación de variables.
		int capital = 1000;
		double interes = 0.02;
		
		// Inicialización del ciclo for.
		for (int mes = 1; mes < 12; mes++) {
			capital += capital * interes;
			System.out.println("El capital al final del año es: " + capital);
		}
	}

}
