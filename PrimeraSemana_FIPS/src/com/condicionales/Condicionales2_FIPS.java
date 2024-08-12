package com.condicionales;

import java.util.Scanner;

public class Condicionales2_FIPS {

	public static void main(String[] args) {
		// Realiza un programa que pida un número por teclado y nos indique si es par 
		//o impar
		
		Scanner entrada = new Scanner(System.in);

        // Solicitar un número al usuario
        System.out.println("Ingresa un número: ");
        int numero = entrada.nextInt();

        // Comprobar si el número es par o impar
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es par.");
        } else {
            System.out.println("El número " + numero + " es impar.");
        }
    }
}