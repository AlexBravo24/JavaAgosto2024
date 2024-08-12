package com;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// Arrays
		/*
		 * Los arrays o arreglos, o tambien conocidos como vectores 
		 * son estructuras de datos que nos permiten almacenar
		 * un tipode datos en comun
		 * sea una especie de coleccion de datos
		 */
		
		//Una vez declarado su tamaño o longitud, este no puede crecer 
		//en tiempo de ejecucion
		
		//Formas de declaras un array
		
		//Declarando un array de numeros enteros con su tamaño
		
		int [] numeros = new int[5];
		
		//Guardar o asignar valores a cada posicion del array
		
		numeros[0]=1;
		numeros[1]=10;
		numeros[2]=20;
		numeros[3]=30;
		numeros[4]=40;
		
		//numeros[5]=15; //Si quierp agregar una posicin mas, puedo
		//"hacerlo", porque la sintaxis es correcta sin embargo 
		// El indice no existe, porque el array ya tiene un tamaño declarao
		
		//Imprimir en consola determinara posicion del array
//		System.out.println(numeros[4]);
		
		//Declarando un Scanner para solicitar los valores por teclado
		Scanner input = new Scanner (System.in); 
		
		int [] numeros2 = new int [5];
		
//		for(int i = 0; i < numeros2.length; i++) {
//			System.out.println("Ingresa un numero en la posicion " +i);
//			numeros2[i]=input.nextInt();
//			
//		}
		
		//Si ya no utilizo Scanner para introducir datos, 
		//Lo correcto seria utilizar cerrarlo para ahorrar recursos en memoria
		input.close();
		
		//Vamos a imprimir un valor guardado una vez teniendo numeros en array
		
//		System.out.println(numeros2[3]);
		
		//o para imprimirlos todos puedo hacer uso nuevamente de un ciclo
//		for(int i = 0; i < numeros2.length; i++) {
//			System.out.println(numeros2[i] + ", ");
//		}
//		
		//otra manera de declarar un array
		//es con sus valores definidos desde un inicio
		
		int [] numeros3 = {1,2,3,4,5}; 
		
		char [] nombre = {'A', '1', 'e','x'};
		
		String [] nombres = {"Abraham", "Rafael", "Jafeth", "Marcos"};
		
		//Otra forma de imprimir todos los valores de un array 
		//es con un ciclo for each
		
		for(String i:nombres) { //para cada elemento del array
			System.out.println(i); //imprimelo cada uno en una nuevalinea
		}
		

	}

}
