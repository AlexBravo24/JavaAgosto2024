package condicionales;

import java.util.Scanner;

public class Condicionales1_JABR {

	public static void main(String[] args) {
		
		//1. Realiza un programa que determine que solicite 2 n�meros
		//y que se evalue cual de los dos es mayor o si son iguales
		int x; // primer n�mero
		int y; // segundo n�mero

		// Solicitamos que se introduzcan por teclado
		Scanner entrada = new Scanner(System.in);
		// Mandamos la instrucci�n en pantalla para el primer n�mero
		System.out.println("Introduce el primer n�mero");
		// Asignamos el valor a x
		x = entrada.nextInt();
		// Mandamos instrucci�n para el segundo n�mero
		System.out.println("Introduce el segundo n�mero");
		// Asignamos el valor a y
		y = entrada.nextInt();
		entrada.close();

		// Evaluamos las condiciones, si el primero es mayor o si el segundo es mayor
		if (x > y) {
			System.out.println("El valor de " + x + " es mayor");
		} else if (x < y) {
			System.out.println("El valor de " + y + " es mayor");
		} else {
			System.out.println("Los valores son iguales");
		}
		

	}

}
