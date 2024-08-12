package com.arrays;

import java.util.Scanner;

public class Arrays3_AGPR {
	
	public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese una frase
        Syspublic static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese una frase
        System.out.println("Introduce una frase:");

        // Leer la frase completa del usuario
        String frase = scanner.nextLine();

        // Convertir la frase en un array de caracteres
        char[] caracteres = frase.toCharArray();

        // Imprimir cada carácter con su índice
        for (int i = 0; i < caracteres.length; i++) {
            System.out.println("Caracter " + (i + 1) + " es: " + caracteres[i]);
        }

        // Cerrar el scanner
        scanner.close();
    }
}tem.out.println("Introduce una frase:");

        // Leer la frase completa del usuario
        String frase = scanner.nextLine();

        // Convertir la frase en un array de caracteres
        char[] caracteres = frase.toCharArray();

        // Imprimir cada carácter con su índice
        for (int i = 0; i < caracteres.length; i++) {
            System.out.println("Caracter " + i + " es: " + caracteres[i]);
        }

        // Cerrar el scanner
        scanner.close();
    }
}