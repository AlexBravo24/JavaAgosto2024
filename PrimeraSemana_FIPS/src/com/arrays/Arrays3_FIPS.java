package com.arrays;

import java.util.Scanner;

public class Arrays3_FIPS {

	public static void main(String[] args) {
		//  Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
		//caracteres.
        Scanner entrada = new Scanner(System.in);

        // Pedir al usuario que ingrese una frase
        System.out.println("Ingresa una frase: ");
        String frase = entrada.nextLine();

        // Convertir la frase a un array de caracteres
        char[] caracteres = frase.toCharArray();

        // Mostrar el contenido del array de caracteres
        System.out.println("Contenido del array de caracteres:");
        for (int i = 0; i < caracteres.length; i++) {
            System.out.println("Índice " + i + ": " + caracteres[i]);
        }

        // Cerrar el objeto Scanner
        entrada.close();
    }
}