package com;

public class Principal {

	public static void main(String[] args) {
		// Las expresiones lamba son conocidad como funciones an�nimas
		
		//que implementan un m�todo de una interface funcional
		
		//Estas expresionses permiten escribir o sobreescribir
		//un m�todo "al vuelo" para poder realizar algo con ese
		//m�todo
		
		//Su operador es ->
		//y su sintaxis es la siguiente:
		//(par�metros)->{Cuerpo de lambda(que se quiere hacer)}
		//La parte de "an�nima" de estas funciones  proviene de  que
		//se necesita un objeto para implementar la interface, pero el
		//objeto proviene de una clase que no existe, es decir,
		//es an�nima
		IMetodo suma=(x,y)->System.out.println("La suma es: "+(x+y));
		
		//El tener m�todos a trav�s de expresiones lamda me permite cambiar
	    //o reescribir su l�gica de acuerdo a lo que necesite.
		IMetodo resta = (x,y)->System.out.println("La resta es: "+(x-y));
		suma.operacion(12, 4);
		resta.operacion(15, 8);
	}

}
