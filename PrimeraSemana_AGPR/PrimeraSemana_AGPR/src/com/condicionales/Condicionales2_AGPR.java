package com.condicionales;

import java.util.Scanner;

public class Condicionales2_AGPR {

	public static void main(String[] args) {
		//2. Realiza un programa que pida un numero por teclado y nos indique si es par o impar
		
		Scanner entrada=new Scanner (System.in);
		System.out.println("EJERCICIO 2");
		int a;
		System.out.println("Digite un numero:");
		a=entrada.nextInt();
		
		if (a%2==0) {
			System.out.println("El numero "+a+" es par");
		}
		else {
			System.out.println("El numero "+a+" es impar");
		}
		

	}

}
