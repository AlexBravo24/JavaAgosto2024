/*
 * 7. Realiza un programa que pida por teclado el resultado (dato entero)
	obtenido al lanzar un dado de seis caras y muestre por pantalla el n�mero en
	letras (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las
	caras opuestas de un dado de seis caras est�n los n�meros: 1-6, 2-5 y 3-4.
	Nota 2: Si el n�mero del dado introducido es menor que 1 o mayor que 6, se
	mostrar� el mensaje: �ERROR: n�mero incorrecto�.
 */

package com.condicionales;

import java.util.Scanner;

public class Condicionales7_HIMG {

	public static void main(String[] args) {
		// Creaci�n de la variable que almacenara el numero ingresado por consola.
		int num;
		// Creaci�n del objeto input de la clase Scanner.
		Scanner input = new Scanner(System.in);
		// Solicitar al usuario ingrese un numero entero.
		System.out.println("Ingresa el numero que obtuviste al lanzar el dado: ");
		num = input.nextInt();
		
		// Mostrar por pantalla el numero en letras de la cara opuesta al resultado obtenido.
		if (num == 1) {
			System.out.println("La cara contraria es seis");
		}else if (num == 6) {
			System.out.println("La cara contraria es uno");
		}else if (num == 2) {
			System.out.println("La cara contraria es cinco");
		}else if (num == 5) {
			System.out.println("La cara comntraria es dos");
		}else if (num == 3) {
			System.out.println("La cara contraria es cuatro");
		}else if (num == 4) {
			System.out.println("La cara contararia es tres");
		}else if (num < 1 || num >= 7) {
			System.out.println("ERROR: n�mero incorrecto");
		}
		

	}

}
