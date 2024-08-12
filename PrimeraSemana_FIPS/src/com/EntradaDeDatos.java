package com;

import java.util.Scanner;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// Vamos aprender a introducir valores por teclado para alamacenar en una variable
		
		//Declaramos una variable de tipo entero para alamacenar nuestra edad 
		int edad; 
		
		//Necesitamos de una clase llamada scanner que nos permitira
		//Captar valores enbeste caso a travez  del teclado 
		Scanner entrada = new Scanner(System.in); 
		
		//Podemos mandar un mensaje en consola qye nos indique que el scanner estaen espera de que introduscamos un valor
		
		System.out.println("Introduce tu edad:  "); //Solo es una instruccion 
		edad=entrada.nextInt();  //Hasta aqui solo teclamos la edad dandole un valor al scanner sin hacer mas 
		
		//Podemos ocupar el mismo scanner  para introducir un nombre 
		
		System.out.println("Introduce tu nombre:  ");  //Solo es una instruccion 
		entrada.nextLine(); //Consumimos el espacio del salto de linea 
		String nombre = entrada.nextLine();  //Con .nextLine consume miespacio 
		//Si queremos que el scanner ya no siga funcionando para que ya no resiva valores ko cerramos
		entrada.close(); 
		
		
		//Una vez guardados los valores mando un mnj en la consola para utilizarlo
		System.out.println("Hola  " + nombre + " Tienes " + edad); 
	}

}
