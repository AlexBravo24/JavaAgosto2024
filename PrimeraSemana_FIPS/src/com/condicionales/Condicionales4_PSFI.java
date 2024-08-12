package com.condicionales;

import java.util.Scanner;

public class Condicionales4_PSFI {

	public static void main(String[] args) {
		// Realiza un programa que lea una cadena por teclado y compruebe si 
		//contiene letras mayúsculas.

		Scanner entrada = new Scanner(System.in);

        // Solicitar al usuario que ingrese una cadena
        System.out.println("Ingresa una cadena de texto: ");
        String cadena = entrada.nextLine();

        // Variable para indicar si se encontraron mayúsculas
        boolean tieneMayusculas = false;

        // Recorrer la cadena para verificar si hay letras mayúsculas
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isUpperCase(cadena.charAt(i))) {
                tieneMayusculas = true;
                break;  // Salir del bucle si se encuentra una mayúscula
            }
        }

        // Mostrar el resultado
        if (tieneMayusculas) {
            System.out.println("La cadena contiene letras mayúsculaS ");
        } else {
            System.out.println("La cadena no contiene letras mayúsculas ");
        }
    }
}