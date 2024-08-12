package com;

import java.util.Scanner;

public class ProblemarioIfElse {

	public static void main(String[] args) {
		//1. Realice un programa que recibe dos numeros por eclado e indique cual
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
		
		
		//2. Realiza un programa que pida un numero por teclado y nos indique si es par o impar
		
		int numero3;
		System.out.println("EJERCICIO 2");
		System.out.println("Digite un numero");
		numero3=entrada.nextInt();
		if (numero3%2==0) {
			System.out.println("El numero "+numero3+" es par");
		}
		else {
			System.out.println("El numero "+numero3+" es impar");
		}
		
		//Crea un programa que lea una cadena por teclado y compruebe si una letra
		//es mayuscula
		
		System.out.println("EJERCICIO 3");
		
		
	} // Fin main

}
