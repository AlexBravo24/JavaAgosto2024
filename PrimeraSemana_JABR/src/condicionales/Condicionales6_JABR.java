package condicionales;

import java.util.Scanner;

public class Condicionales6_JABR {

	public static void main(String[] args) {
		/*
		 * 6. El director de una escuela está organizando un viaje de estudios y
		 * requiere determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la
		 * compañía de viajes por el servicio. La forma de cobrar es la siguiente: Si
		 * son 100 alumnos o más, el costo por cada alumno es de 65 euros. De 50 a 99
		 * alumnos, el costo es de 70 euros. De 30 a 49 alumnos, el costo es de 95
		 * euros. Menos de 30 alumnos, el costo de la renta del autobús es de 4000
		 * euros, sin importar el número de alumnos. Realiza un algoritmo que permita
		 * determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno
		 * por el viaje.
		 */

		int alumnos;

		Scanner lector = new Scanner(System.in);
		System.out.println("Ingresa el número de alumnos");
		alumnos = lector.nextInt();
		lector.close();
		if (alumnos >= 100) {
			System.out.println("El costo del viaje es de 65 euros por alumno y el total es de " + (alumnos * 65));
		} else if (alumnos >= 50 && alumnos < 100) {
			System.out.println("El costo del viaje es de 70 euros por alumno y el total es de " + (alumnos * 70));
		} else if (alumnos >= 30 && alumnos < 50) {
			System.out.println("El costo del viaje es de 95 euros por alumno y el total es de " + (alumnos * 95));
		} else if (alumnos < 30) {
			System.out.println(
					"El costo del viaje es de 4000 euros y el pago por alumno es de " + (4000 / alumnos) + " euros");
		} else {
			System.out.println("No existe la cotización");
		}
	}

}
