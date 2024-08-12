package condicionales;

import java.util.Scanner;

public class Condicionales5_JABR {

	public static void main(String[] args) {
		/*
		 * 5. Realiza un programa que calcule la aceptación de una solicitud en base a
		 * los siguientes parámetros: edad, nota y sexo. * Mínimo: Nota (5), edad (18),
		 * sexo M -> POSIBLE * Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA * Otros
		 * casos -> NO ACEPTADA
		 */

		// Declaramos una variable para guardar el valor de la nota
		int nota;
		// Declaranmos otra variable para guardar el valor de la edad
		int edad;
		// Declaramos una variable más para guardar el sexo
		String sexo;
		// Traemos a un scanner para introducir los datos por teclado
		Scanner entrada = new Scanner(System.in);
		// Enviamos los mensajes en pantalla para introducir cada
		// uno de los datos
		System.out.println("Introduce una nota");
		// Guardamos la nota, edad y sexo en las variable
		nota = entrada.nextInt();
		System.out.println("Introduce una edad");
		edad = entrada.nextInt();
		System.out.println("Introduce el sexo (M/F)");
		sexo = entrada.next();
		entrada.close();

		// Evaluamos las condiciones que nos solicita el problema
		if (nota >= 5 && edad >= 18 && sexo.equals("M")) {
			System.out.println("Posible");
		} else if (nota >= 5 && edad >= 18 && sexo.equals("F")) {
			System.out.println("Aceptada");
		} else {
			System.out.println("No Aceptada");
		}
	}

}
