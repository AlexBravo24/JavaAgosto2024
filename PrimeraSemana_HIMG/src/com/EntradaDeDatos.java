package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// Vamos a aprender a introducir valores por teclado para almacenarlos en una variable.
		
		// Declracación de una variable de tipo entero para almacenar nuestra edad.
		int edad;
		
		// Necesitamos de una clase llamda Scanner que permitira captar valores en ete caso a traves del teclado.
		Scanner entrada = new Scanner(System.in);
		// Podemos enviar un mensaje que nos indique que el Scanner esta en espera de que introduzcamos un valor.
		System.out.println("Introduce tu edad:");
		edad = entrada.nextInt();
		
		// Podemos utilizar el mismo Scanner para introducir un nombre.
		System.out.println("Introduce tu nombre:");
		entrada.nextLine(); // Consumimos el espacio del salto de linea.
		String nombre = entrada.nextLine();
		// Si despues ya no queremos que se siga utilizando el Scanner para recibir valores lo cerramos.
		entrada.close();
		
		// Una vez guardados los valores mando un mensaje en consola para utilizarlos.
		System.out.println("Hola " + nombre + " tienes " + edad + " años");

	}

}
