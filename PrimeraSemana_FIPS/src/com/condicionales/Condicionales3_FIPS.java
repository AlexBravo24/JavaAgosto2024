package com.condicionales;

import java.util.Scanner;

public class Condicionales3_FIPS {

	public static void main(String[] args) {
		// .Crea un programa que pida al usuario dos n�meros y muestre el resultado 
		//de su divisi�n. Si el segundo n�mero es 0, debe mostrar un mensaje de error
		
		Scanner entrada = new Scanner(System.in);

        // Solicitar el primer n�mero al usuario
        System.out.println("Ingresa el primer n�mero: ");
        int numero1 = entrada.nextInt();

        // Solicitar el segundo n�mero al usuario
        System.out.println("Ingresa el segundo n�mero: ");
        int numero2 = entrada.nextInt();

        // Usar switch-case para verificar el valor del segundo n�mero
        switch (numero2) {
            case 0:
                // Caso cuando el divisor es 0
                System.out.println(" Error ");
                break;

            default:
                // Caso por defecto cuando el divisor no es 0
                int resultado = numero1 / numero2;
                System.out.println("El resultado de la divisi�n es: " + resultado);
                break;
        }
    }
}