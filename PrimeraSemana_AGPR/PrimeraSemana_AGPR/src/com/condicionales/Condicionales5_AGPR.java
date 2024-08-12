package com.condicionales;

import java.util.Scanner;

public class Condicionales5_AGPR {

	public static void main(String[] args) {
		// Realiza un programa que calcule la aceptacion de una solicitud
		//con base en los siguientes parámetros: edad, nota y sexo
		// Mínimo: Nota(5), edad(18), sexo M -> POSIBLE
		// Mínimo: Nota(5), edad(18), sexo F -> ACEPTADA
		// Otros casos -> NO ACEPTADA
		
		Scanner entrada = new Scanner (System.in);
		
		int nota, edad;
		char sexo;
		
		System.out.println("Ingrese su nota");
		nota= entrada.nextInt();
		System.out.println("Ingrese su edad");
		edad= entrada.nextInt();
		
		//Limpiar el buffer del scanner
		// Para evitar que el siguiente nextLine() lea este salto 
		//de línea en lugar de la entrada esperada
		entrada.nextLine();
		
		
		if (nota>=5 && edad>=18) {
			
			System.out.println("Ingrese su sexo (M o F)");
			sexo=entrada.nextLine().charAt(0);
			
			switch (sexo) {
			case 'm':
			case 'M':
				System.out.println("POSIBLE");
				break;
			
			case 'f':
			case 'F':
				System.out.println("ACEPTADA");
				break;
			default:
				System.out.println("Sexo invalido");
			}
			
		}
		else {
			System.out.println("NO ACEPTADA");
		}
		
	}

}
