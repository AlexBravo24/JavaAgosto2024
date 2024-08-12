package condicionales;

import java.util.Scanner;

public class Condicionales3_JABR {

	public static void main(String[] args) {
		// Ejercicio 3 - Crea un programa que pida al usuario dos n�meros
		// y muestre el resultado de su divisi�n.
		// Si el segundo n�mero es 0, debe mostrar un mensaje de error.

		// Declaramos las variables donde se van a guardar los valores introducidos
		int num1;
		int num2;

		// Solicitamos ingresar los valores por teclado
		Scanner entrada = new Scanner(System.in);
		// Mandamos la instrucci�n en pantalla para el n�mero 1
		System.out.println("Introduce el primer n�mero");
		// Asignamos el valor
		num1 = entrada.nextInt();
		// Mandamos la instrucci�n en pantalla para el n�mero 2
		System.out.println("Introduce el segundo n�mero");
		// Asignamos el valor
		num2 = entrada.nextInt();
		entrada.close();

		// Evaluamos
		// Si el segundo n�mero es 0, mandar un mensaje de error
		// Si no, ejecutar una divisi�n y mostrar el resultado

		if (num2 == 0) {
			System.out.println("Error de divisi�n");
		} else {
			System.out.println("El resultado de la divisi�n del primer n�mero entre el segundo es: " + num1 / num2);
		}

	}

}
