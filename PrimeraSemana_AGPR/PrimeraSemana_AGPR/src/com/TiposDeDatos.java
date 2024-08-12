package com;

public class TiposDeDatos {
	public static void main(String[] args) {
		
		//Ejemplo de valor de una variable sin valor asignado
		byte numero;
		numero = 127; //valor asignado a la variable
		
		//Ejemplo de declaracion de variables, con valores asignados desde el inicio
		byte b=-128; //byte solo admite valores de -128 a 127. Pesa 1 byte de memoria.
		
		short s=32767; //ocupa 2 bytes
		int i=2147483647; //ocupa 4 bytes
		long l=2147483648L; //Pesa 8 bytes y requiere ponerse al final "L" o "l"
		
		//La variable mas utilizada para manejar valores enteros es int
		
		
		//Booleanos
		boolean evalua=true;
		boolean evealua2=false;
		//Evaluan expresiones o condicioens
		
		//Caracter
		char caracter = 'a';
		
		
		//Datos estructurado
		//Dato wrapper
		
		Byte by=-128;
		
		System.out.println("Hola mundo");
		
		System.out.println();
		System.out.println();
		
		
		//ejemplo suma de dos numeros
		System.out.println(11+20);
		
		//Ejemplo declarar un valor x y uno y para realizar una operacion
		
		int x=11;
		int y=20;
		
		System.out.println(x+y);
		
		System.out.println("La suma es: "+ (x+y)); //importante poner paréntesis.
		
		
		
		
	}

}
