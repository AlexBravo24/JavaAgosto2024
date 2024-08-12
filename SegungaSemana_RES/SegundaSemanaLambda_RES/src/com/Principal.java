package com;

public class Principal {

	public static void main(String[] args) {
		// Las expresiones lamba son conocidad como funciones anónimas
		
		//que implementan un método de una interface funcional
		
		//Estas expresionses permiten escribir o sobreescribir
		//un método "al vuelo" para poder realizar algo con ese
		//método
		
		//Su operador es ->
		//y su sintaxis es la siguiente:
		//(parámetros)->{Cuerpo de lambda(que se quiere hacer)}
		//La parte de "anónima" de estas funciones  proviene de  que
		//se necesita un objeto para implementar la interface, pero el
		//objeto proviene de una clase que no existe, es decir,
		//es anónima
		IMetodo suma=(x,y)->System.out.println("La suma es: "+(x+y));
		
		//El tener métodos a través de expresiones lamda me permite cambiar
	    //o reescribir su lógica de acuerdo a lo que necesite.
		IMetodo resta = (x,y)->System.out.println("La resta es: "+(x-y));
		suma.operacion(12, 4);
		resta.operacion(15, 8);
	}

}
