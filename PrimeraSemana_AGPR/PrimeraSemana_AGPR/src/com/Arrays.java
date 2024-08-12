package com;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// Arrays
		/*Los arrays o arreglos, tamnien conocidos como vectores
		 * son una estructura de datos que nos permiten almacenar
		 * un tipo de datos en comun.
		 * son una especie de coleccion de datos
		 */
		
		//Una vez declarado su tamaño o longitud, este no puede
		//crecer en tiempo de ejecucion
		
		//FORMAS DE DECLARAR UN ARRAY
		
		//Declarando un array de numero enteros con su tamaño
		int[] numeros=new int[5];
		
		//Guardar o asignar valores a cada posicion del array
		numeros[0]=1;
		numeros[1]=10;
		numeros[2]=20;
		numeros[3]=30;
		numeros[4]=40; //este es el quinto numero que se declaró en el array
		
		//Imprimir en consola determinada posicio del array
		System.out.println(numeros[4]);//en el corchete se pone la posicion que se quiere imprimir
		
		//Declarando un Scanner para oslicitar los valores por teclado
		Scanner input= new Scanner(System.in);
		int[] numeros2=new int[5];
		
		for (int i = 0; i < numeros2.length; i++) {
			System.out.println("Ingresa un numero en el array en la posicion: "+i);
			numeros2[i]=input.nextInt();	
		}
		//Si ya no utilizo mi Scanner para introducit datos,
		//lo correcto seria cerralo para ahorrar memoria
		input.close();
		
		//vamos a imprimir un valor guardado 
		System.out.println(numeros2[3]);
		
		//para imprimirlos todos podemos hacer uso de un ciclo
		for (int i = 0; i < numeros2.length; i++) {
			System.out.print(numeros2[i]+", ");
		}
		
		//Otra manera de declarar un array
		//es con sus valores definidos desde un inicio
		
		int[] numeros3 = {1,2,3,4,5};
		char [] nombre= {'A', 'L', 'E', 'X'};
		
		//String
		String[] nombres = {"Abraham", "Rafael", "Jafet"};
		//otra forma de imprimir todos los valores de un array
		//es con un ciclo FOR EACH
		
		for (String i:nombres) { //para cada elemento del array
			System.out.println(i); //imprimelo cada uno en una line
		}
	}

}
