package condicionales;

import java.util.Scanner;

public class Condicionales3_JABR {

	public static void main(String[] args) {
		// Ejercicio 3 - Crea un programa que pida al usuario dos números
		// y muestre el resultado de su división.
		// Si el segundo número es 0, debe mostrar un mensaje de error.

		// Declaramos las variables donde se van a guardar los valores introducidos
		int num1;
		int num2;

		// Solicitamos ingresar los valores por teclado
		Scanner entrada = new Scanner(System.in);
		// Mandamos la instrucción en pantalla para el número 1
		System.out.println("Introduce el primer número");
		// Asignamos el valor
		num1 = entrada.nextInt();
		// Mandamos la instrucción en pantalla para el número 2
		System.out.println("Introduce el segundo número");
		// Asignamos el valor
		num2 = entrada.nextInt();
		entrada.close();

		// Evaluamos
		// Si el segundo número es 0, mandar un mensaje de error
		// Si no, ejecutar una división y mostrar el resultado

		if (num2 == 0) {
			System.out.println("Error de división");
		} else {
			System.out.println("El resultado de la división del primer número entre el segundo es: " + num1 / num2);
		}

	}

}
