package com;

public class Principal {

	public static void main(String[] args) {
		// Expresiones Lambda son conocidas como funciones anonimas
		// que implementan un metodo de una interface funcional
		
		// Estas expresiones nos permiten escribir o sobreescribir 
		// un método "al vuelo " para poder realizar algo con los parametros 
		// de ese método
		
		// Su operador es ->
		// Y su sintaxis es la siguiente 
		// (parametros) -> {cuerpo de lambda (que se quiere hacer)}
		
		// La parte de anonima de estas funciones proviene de  que 
		// se necesita un objeto para implementar la interface, pero ese
		// objeto proviene de una clase que no existe, es decir es una clase anonima.
		
		IMetodo suma = (a, b) -> System.out.println("La suma es: " +  (a + b));
		
		// El tener metodos a traves de expresiones lambda me permite cambiar 
		// o reeescribir su logica de acuerdo a lo que necesite.
		IMetodo resta = (x, y) -> System.out.println("La resta es: " + (x + y));
		
		// Vamos a ver como funcionan estos metodos a traves de los objetos creados 
		suma.operacion(12, 4);
		
		resta.operacion(15, 8);
		
		
		
		
		
		

	}

}
