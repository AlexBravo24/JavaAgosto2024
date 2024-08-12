package ciclos;

import java.util.Scanner;

public class Ciclos2_FIPS {

	public static void main(String[] args) {
		// - Programa un algoritmo que realice la tabla de multiplicar de un numero 
		//introducido desde teclado, hasta la iteración deseada por el usuario. 
		//Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		 Scanner entrada = new Scanner(System.in);

	        // Solicitar al usuario que ingrese el número para la tabla de multiplicar
	        System.out.println("Ingresa el número para la tabla de multiplicar: ");
	        int numero = entrada.nextInt();

	        // Solicitar al usuario que ingrese hasta qué iteración desea la tabla
	        System.out.println("Ingresa hasta qué número deseas la iteración: ");
	        int iteracion = entrada.nextInt();

	        // Validar que la iteración sea positiva
	        if (iteracion <= 0) {
	            System.out.println("ERROR: La iteración debe ser un número positivo.");
	        } else {
	            // Usar un bucle for para generar la tabla de multiplicar
	            for (int i = 1; i <= iteracion; i++) {
	                int resultado = numero * i;
	                System.out.println(numero + " x " + i + " = " + resultado);
	            }
	        }
	    }
	}