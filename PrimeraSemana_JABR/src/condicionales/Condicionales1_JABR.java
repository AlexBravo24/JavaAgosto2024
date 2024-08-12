package condicionales;

import java.util.Scanner;

public class Condicionales1_JABR {

	public static void main(String[] args) {
		
		//1. Realiza un programa que determine que solicite 2 números
		//y que se evalue cual de los dos es mayor o si son iguales
		int x; // primer número
		int y; // segundo número

		// Solicitamos que se introduzcan por teclado
		Scanner entrada = new Scanner(System.in);
		// Mandamos la instrucción en pantalla para el primer número
		System.out.println("Introduce el primer número");
		// Asignamos el valor a x
		x = entrada.nextInt();
		// Mandamos instrucción para el segundo número
		System.out.println("Introduce el segundo número");
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
