package com.condicionales;

import java.util.Scanner;

public class Condicionales8_PSFI {

	public static void main(String[] args) {
		// Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día 
		// correspondiente. Si introducimos otro número nos da un error

		Scanner entrada = new Scanner(System.in);

        // Solicitar el día de la semana
        System.out.println("Ingresa un número del 1 al 7 para el día de la semana:");
        int dia = entrada.nextInt();

        // Estructura SWITCH-CASE
        System.out.println("Estructura SWITCH-CASE");
        
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Error: número de día incorrecto.");
                break;
        }
    }
}