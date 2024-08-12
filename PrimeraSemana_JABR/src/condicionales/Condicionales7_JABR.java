package condicionales;

import java.util.Scanner;

public class Condicionales7_JABR {

	public static void main(String[] args) {
		/*
		 * 7. Realiza un programa que pida por teclado el resultado (dato entero)
		 * obtenido al lanzar un dado de seis caras y muestre por pantalla el número en
		 * letras (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las
		 * caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
		 * Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se
		 * mostrará el mensaje: “ERROR: número incorrecto”.
		 */

		// Declaramos una variable donde guardar el valor de la cara del dado
		// que introduciremos por teclado
		int cara;
		// Llamamos al scanner para introducir el valor de la cara
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el número que muestra la cara del dado");
		cara = entrada.nextInt();
		entrada.close();

		// Podemos resolver este ejercicio con un switch, ya que existen solo
		// 6 resultados en el dado
		switch (cara) {
		case 1:
			System.out.println("La cara opuesta es Seis");
			break;
		case 2:
			System.out.println("La cara opuesta es Cinco");
			break;
		case 3:
			System.out.println("La cara opuesta es Cuatro");
			break;
		case 4:
			System.out.println("La cara opuesta es Tres");
			break;
		case 5:
			System.out.println("La cara opuesta es Dos");
			break;
		case 6:
			System.out.println("La cara opuesta es Uno");
			break;
		default:
			System.out.println("Error: número incorrecto");
			break;
		}
	}

}
