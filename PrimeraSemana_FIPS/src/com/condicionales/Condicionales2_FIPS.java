package com.condicionales;

import java.util.Scanner;

public class Condicionales2_FIPS {

	public static void main(String[] args) {
		// Realiza un programa que pida un n�mero por teclado y nos indique si es par 
		//o impar
		
		Scanner entrada = new Scanner(System.in);

        // Solicitar un n�mero al usuario
        System.out.println("Ingresa un n�mero: ");
        int numero = entrada.nextInt();

        // Comprobar si el n�mero es par o impar
        if (numero % 2 == 0) {
            System.out.println("El n�mero " + numero + " es par.");
        } else {
            System.out.println("El n�mero " + numero + " es impar.");
        }
    }
}