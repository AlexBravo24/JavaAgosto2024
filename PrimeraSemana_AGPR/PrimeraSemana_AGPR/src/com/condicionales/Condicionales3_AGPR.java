package com.condicionales;

import java.util.Scanner;

public class Condicionales3_AGPR {

	public static void main(String[] args) {
		// Crea un programa que pida al usuario dos numeros y muestre
		//el resultado de su division. Si el segundo numero es 0, debe mostrar
		// un mensaje de error
		
		Scanner entrada=new Scanner (System.in);
		
		float numerador, denominador;
		float div;
		System.out.println("Digite el numerador");
		numerador = entrada.nextInt();
		System.out.println("Digite el denominador");
		denominador = entrada.nextInt();
		
		if (denominador ==0) {
			System.out.println("Error, no se puede dividir entre 0");
		}
		else {
			div=numerador/denominador;
			System.out.println("La división es: "+div);
		}

	}

}
