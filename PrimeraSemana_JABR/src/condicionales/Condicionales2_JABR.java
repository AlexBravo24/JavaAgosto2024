package condicionales;

import java.util.Scanner;

public class Condicionales2_JABR {

	public static void main(String[] args) {
		// 2.- Realiza un programa que pida un n�mero por teclado
		// y nos indique si es par o impar.

		// Declaramos una variable donde guardar el numero ingresado por teclado
		int numero;
		// Creamos un objeto Scanner para poder introducir un valor por teclado
		Scanner entrada = new Scanner(System.in);
		// Mandamos la instrucci�n a consola para introducir un valor
		System.out.println("Introduce un n�mero");
		// Asignamos el valor de lo introducido a la variable numero
		numero = entrada.nextInt();
		entrada.close();

		// Evaluamos mediante el operador de modulo la divisi�n del n�mero entre 2.
		// Si esta operaci�n no deja residuo, es decir, es igual a 0 el residuo
		// Entonces el n�mero es par
		// Si no, es impar

		if (numero % 2 == 0) {
			System.out.println("El n�mero es par");
		} else {
			System.out.println("El n�mero es impar");
		}

	}

}
