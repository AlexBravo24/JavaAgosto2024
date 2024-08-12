package com.condicionales;

import java.util.Scanner;

public class Condicionales4_AGPR {

	public static void main(String[] args) {
		// Realiza un programa que lea una cadena por teclado y
		//compruebe si es una letra mayúscula
		
		Scanner entrada=new Scanner (System.in);
		
		// Pedir al usuario que introduzca una cadena
        System.out.print("Introduce una cadena: ");
		String cadena = entrada.nextLine();
        
        // Verificar si la cadena tiene exactamente un carácter
        if (cadena.length() == 1) {
            char caracter = cadena.charAt(0);
            
            // Comprobar si el carácter es una letra mayúscula
            if (Character.isUpperCase(caracter)) {
                System.out.println("La letra es una mayúscula.");
            } else {
                System.out.println("La let"
                		+ "ra es una minúscula.");
            }
        } else {
            System.out.println("Por favor, introduce solo un carácter.");
        }

	}

}
