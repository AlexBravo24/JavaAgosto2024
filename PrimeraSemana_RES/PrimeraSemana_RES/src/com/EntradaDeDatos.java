package com;
import java.util.*;

public class EntradaDeDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vamos aprender a introducir valores por teclaco
		//para almacenarlos en una variable.
		//Declaramos una variable de tipo entero para almacenar nuestra edad
		int edad;
		//Necesitaremos de una clase llamada Scanner para captar
		//valores, en este caso del teclado
		Scanner entrada = new Scanner(System.in);
		//Podemos mandar un mensaje en consola
		//en espera que introduzcas un valor
		System.out.println("Introduce tu edad: ");
		edad = entrada.nextInt();
		String nombre="";
		//Podemos ocupar el mismo scanner para introducir un nombre
		System.out.println("Introduce tu nombre: ");
		nombre= entrada.next();
		entrada.close();
		System.out.println("Hola " + nombre + " tienes " + edad);
		
		
		
		
	}

}
