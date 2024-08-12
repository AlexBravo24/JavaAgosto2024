package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		//Vamos a aprender a introducir valores por teclado para
		//almacenarlos en una variable
		
		//Declaramos una variable de tipo entero para almacenar nuestra edad
		int edad;
		
		//Necesitaremos de una clase llamada Scanner que nos permitira
		//captar valores en este caso a través del teclado
		Scanner entrada = new Scanner(System.in);
		
		//Podemos mandar un msj en consola que nos indique que el Scanner esta en
		//espera de que introduzcamos un valor
		System.out.println("Introduce tu edad");
		edad=entrada.nextInt();
		
		//Podemos ocupar el mismo Scanner para introducir
		//un nombre
		System.out.println("Introduce tu nombre");
		entrada.nextLine(); //Consumimos el espacio del salto de linea
		String nombre = entrada.nextLine();
		//Si después queremos que el Scanner ya no se siga utilizando
		//para recibir valores, lo cerramos
		entrada.close();
		
		//Una vez guardados los valores mando un msj en consola para
		//utilizarlos
		System.out.println("Hola " + nombre + " tienes " + edad);
		
		

	}

}
