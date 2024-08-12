package com;

public class Principal {

	public static void main(String[] args) {
		// Vamos a usar expresioens Lambda
		
		//Son conocidas como funciones anónimas que implementan
		//un método de una interface funcional. 
		
		//Estas expresioens nos permiten escribir o sobreescribir
		//un método "al vuelo" para poder realizar algo con los parámetros
		//de ese método
		
		//Su operador es "->"
		//y su sintaxis es la siguiente
		//(parametros) -> {cuerpo de lambda (qué se quiere hacer)}
		
		//La parte de "Anónima" de estas funciones proviene de que
		//se necesita un objeto para implementar la interface, pero ese
		//objeto proviene de una clase que no existe, es decir, es una clase
		//anónima
		
		IMetodo suma= (a,b) -> System.out.println("La suma es: "+(a+b));
		
		//El tener método a través de expresioens Lambda me permite cambiar
		//o reescribir su lógica de acuerdo a lo que necesite
		
		IMetodo resta =(x,y) -> System.out.println("La resta es: "+(x-y));
		
		//Vamos a ver cómo funcionan estos métodos a través de los objetos creados
		
		suma.operacion(12, 4);
		resta.operacion(15, 8);

	}

}
