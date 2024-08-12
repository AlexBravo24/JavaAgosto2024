package condicionales;

import java.util.Scanner;

public class Condicionales4_JABR {

	public static void main(String[] args) {
		// Ejercicio 4 - Realiza un programa que lea una cadena por teclado
		// y compruebe si es una letra mayúscula.

		// Declaramos 2 variables String, una va a ser la original, y la otra nos va a
		// servir
		// para convertirla a mayúsculas o minúsculas

		String cadena;
		String cadena2;

		// Declaro un Scanner para introducir por teclado la cadena de texto
		Scanner entrada = new Scanner(System.in);

		// Mando el msj a consola para introducir la cadena de texto y guardarla
		System.out.println("Introduce una cadena de texto");

		cadena = entrada.next();
		cadena2 = cadena.toLowerCase();
		entrada.close();

		// Evaluamos si la cadena original es igual a la cadena convertida en minusculas
		// Si la cadena original es igual a la segunda, entonces, contiene minusculas
		// De lo contrario, contiene mayúsculas

		if (cadena.equals(cadena2)) {
			System.out.println("El texto esta en minusculas");
		} else {
			System.out.println("El texto tiene maýusculas");
		}
	}

}
