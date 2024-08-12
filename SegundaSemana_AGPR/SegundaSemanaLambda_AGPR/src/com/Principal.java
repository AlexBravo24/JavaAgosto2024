package com;

public class Principal {

	public static void main(String[] args) {
		// Vamos a usar expresioens Lambda
		
		//Son conocidas como funciones an�nimas que implementan
		//un m�todo de una interface funcional. 
		
		//Estas expresioens nos permiten escribir o sobreescribir
		//un m�todo "al vuelo" para poder realizar algo con los par�metros
		//de ese m�todo
		
		//Su operador es "->"
		//y su sintaxis es la siguiente
		//(parametros) -> {cuerpo de lambda (qu� se quiere hacer)}
		
		//La parte de "An�nima" de estas funciones proviene de que
		//se necesita un objeto para implementar la interface, pero ese
		//objeto proviene de una clase que no existe, es decir, es una clase
		//an�nima
		
		IMetodo suma= (a,b) -> System.out.println("La suma es: "+(a+b));
		
		//El tener m�todo a trav�s de expresioens Lambda me permite cambiar
		//o reescribir su l�gica de acuerdo a lo que necesite
		
		IMetodo resta =(x,y) -> System.out.println("La resta es: "+(x-y));
		
		//Vamos a ver c�mo funcionan estos m�todos a trav�s de los objetos creados
		
		suma.operacion(12, 4);
		resta.operacion(15, 8);

	}

}
