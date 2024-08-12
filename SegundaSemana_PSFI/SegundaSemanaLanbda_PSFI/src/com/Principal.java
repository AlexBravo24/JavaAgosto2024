package com;

public class Principal {

	public static void main(String[] args) {
		// Expresiones Lambda
		
		//Son conocidas como funciones anonimas
		//que implementa un metodo de una interface funcional
		
		//Estas expresiones nos permite escribir o sobreescribir
		//un metodo "al vuelo" para poder realizar algo con los parametros
		//de ese metodo
		
		//se operador es->
		//y su sintaxis es la siguiente
		//(parametro) -> (cuerpo de lambda(que se quiere hacer))
		
		//La parte de "anonima" d estas funciones proviene de que 
		//se necesita un objeto para implementar la interface. pero ese 
		//objeto proviene de una clase que no existe, es decir es una clase
		//anonima
		
		IMetodo suma = (x,y) -> System.out.println("La suma es:  " +(x+y));

		
		//Tener metodos a traves de expreciones Lambda me permite cambiar
		//o reescribir su logica de acuerdo a lo que necesite
		
		IMetodo resta = (x,y) -> System.out.println("La suma es:  " +(x-y));
		
		//Vamos a ver como funcionan estos metodos a traves de los objetos creadores
		
	suma.operacion(12, 4);
	resta.operacion(15, 8);
		
	}

}
