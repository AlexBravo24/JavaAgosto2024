package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// Introducir los valores por teclado 
		// para almacenarlos en una variable
		
		//Declaramos una variable de tipo entero para almacenar nuestra edad
		
		int edad;
		
		//Necesitamos una clase llamada Scanner que nos permite 
		//captar valores, en este caso, a través del teclado
		
		Scanner entrada = new Scanner(System.in);
		
		//Podemos mandar un mensaje en consola. 
		System.out.println("Introduce tu edad");
		edad=entrada.nextInt(); //Solo lee hasta encontrar un espacio
		
		System.out.println("Introduce tu nombre");
		entrada.nextLine(); //Consumimos el espacio del salto de linea
		String nombre=entrada.nextLine(); 
		
		// Si despues queremos que el Scanner ya no se siga utilizando
		//para recibir valores, lo cerramos
		entrada.
		close();
		
		//una vez guardados los valores mando un msj en consola para
		//ustilizarlos
		
		System.out.println("Hola "+ nombre +", tu edad es: "+ edad);
		
		

	}

}
