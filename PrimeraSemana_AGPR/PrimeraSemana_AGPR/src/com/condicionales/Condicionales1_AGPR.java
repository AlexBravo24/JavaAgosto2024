package com.condicionales;

import java.util.Scanner;

public class Condicionales1_AGPR {

	public static void main(String[] args) {
		//1. Realice un programa que recibe dos numeros por teclado e indique cual
		// es mayor o si son iguales
		
		Scanner entrada = new Scanner (System.in);
				
		System.out.println("EJERCICIO 1");
		int numero1, numero2;
				
		System.out.println("Digite un numero: ");
		numero1= entrada.nextInt();
		System.out.println("Digite otro numero: ");
		numero2= entrada.nextInt();

		if (numero1>numero2) {
		System.out.println("El numero "+numero1+" es mayor que el numero "+numero2);
		}
		else if (numero1<numero2) {
		System.out.println("El numero "+numero2+" es mayor que el numero "+numero1);
		}
		else {
		System.out.println("Los numeros son iguales");
		}
	}
}
