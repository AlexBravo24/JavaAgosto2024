/*
 * 8.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día
	 correspondiente. Si introducimos otro número nos da un error.
 */

package com.condicionales;

import java.util.Scanner;

public class Condicionales8_HIMG {

	public static void main(String[] args) {
		// Declaración de la variable que almacenara el numero ingresado por consola.
		int numDia;
		// Creación del objeto entrada de la clase Scanner que recibira el numero ingresado.
		Scanner entrada = new Scanner(System.in);
		// Solicitamos al usuario ingrese un numero.
		System.out.println("Ingresa un numero del 1 al 7 para mostrar un dia de la semana: ");
		numDia = entrada.nextInt();
		
		// Definir de acuerdo al numero ingresado por consola a que dia de la semana corresponde y mostrarlo.
		switch (numDia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4: 
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
			default:
				System.out.println("Error de numero ingresado");
		}

	}

}
