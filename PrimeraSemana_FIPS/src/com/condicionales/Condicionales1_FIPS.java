package com.condicionales;

import java.util.Scanner;

public class Condicionales1_FIPS {

	public static void main(String[] args) {
		
		// .Realiza un programa que reciba dos números por teclado e indique cuál es 
       //mayor o si son iguales.
		
		Scanner entrada = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.println("Ingresa el primer numero: ");
		a = entrada.nextInt();
		
		System.out.println("Ingresa el segundo numero: ");
		b = entrada.nextInt();
		
		if (a<b) { // si (esto es verdad) { ejecutara lo siguiente
			System.out.println("Si es mayor que: " + a);
		}  else { // de otro modo, ejecuta lo siguiente
			System.out.println("No es mayor que: "+ b);
		}
		
		if (a == b) {
			System.out.println("Los nuumero si son iguales");
		}else { 
			System.out.println("No son iguales");
		}
		

	}

}
