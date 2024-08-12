package com.condicionales;

import java.util.Scanner;

public class Condicionales5_PSFI {

	public static void main(String[] args) {
//		Realiza un programa que calcule la aceptación de una solicitud en base a 
//		los siguientes parámetros: edad, nota y sexo. 
//		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE 
//		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA 
//		* Otros casos -> NO ACEPTADA
		Scanner entrada = new Scanner(System.in);

        // Solicitamos al usuario que ingrese la nota
        System.out.println("Ingresa la nota: ");
        int nota = entrada.nextInt();

        // Solicitar al usuario que ingrese la edad
        System.out.println("Ingresa la edad: ");
        int edad = entrada.nextInt();

        // Solicitar al usuario que ingrese el sexo (M/F)
        System.out.println("Ingresa el sexo (M/F): ");
        char sexo = entrada.next().charAt(0);

        // Convertir el sexo a mayúscula por si el usuario ingresa en minúscula
        sexo = Character.toUpperCase(sexo);

        // Evaluar las condiciones para determinar la aceptación
        if (nota >= 5 && edad >= 18) {
            if (sexo == 'M') {
                System.out.println("Resultado: POSIBLE");
            } else if (sexo == 'F') {
                System.out.println("Resultado: ACEPTADA");
            } else {
                System.out.println("Resultado: NO ACEPTADA");
            }
        } else {
            System.out.println("Resultado: NO ACEPTADA");
        }
    }
}