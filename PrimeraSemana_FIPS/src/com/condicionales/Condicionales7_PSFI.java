package com.condicionales;

import java.util.Scanner;

public class Condicionales7_PSFI {

	public static void main(String[] args) {
//		Realiza un programa que pida por teclado el resultado (dato entero) 
//		obtenido al lanzar un dado de seis caras y muestre por pantalla el número en 
//		letras (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las 
//		caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4. 
//		Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se 
//		mostrará el mensaje: “ERROR: número incorrecto”.
//
        Scanner entrada = new Scanner(System.in);

        // Solicitar el número del dado
        System.out.println("Ingresa el resultado obtenido al lanzar el dado (1-6): ");
        int numeroDado = entrada.nextInt();

        // Variable para almacenar la cara opuesta en letras
        String caraOpuesta;

        // Usar switch-case para determinar la cara opuesta
        switch (numeroDado) {
            case 1:
                caraOpuesta = "Seis";
                break;
            case 2:
                caraOpuesta = "Cinco";
                break;
            case 3:
                caraOpuesta = "Cuatro";
                break;
            case 4:
                caraOpuesta = "Tres";
                break;
            case 5:
                caraOpuesta = "Dos";
                break;
            case 6:
                caraOpuesta = "Uno";
                break;
            default:
                caraOpuesta = "ERROR: número incorrecto";
                break;
        }

        // Mostrar el resultado
        System.out.println("La cara opuesta en letras es: " + caraOpuesta);
    }
}
