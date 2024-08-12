package com;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arrays
		
		/*Los array, arreglo, o también conocidos como "vectores" 
          son una estructura de datos en común
          son una especie de colección de datos
        */
		
		//una vez declarado su tamaño longitud no puede crecer
		//en tiempo de ejecución
		
		
		
		//Formas de declarar un array
		
		//Declarando un array
		
		int [] numeros = new int[5];
		
		//Guardar o asignar valores a cada posición del array
		numeros[0]=1;
		numeros[1]=10;
		numeros[2]=20;
		numeros[3]=30;
		numeros[4]=40;
//		numeros[5]=50; Si quiero agregar una posición más puedo hacerlo
		//porque la sintaxis es correcta, sin embargo
		//el indice no existe, porque el array ya tiene un tamañp declarado
		
		//imprimir en consola determinada posición del array
	/*	System.out.println(numeros[4]);
		Scanner input = new Scanner(System.in);*/
		int [] numeros2 = new int [5];
		/*for (int i = 0; i < numeros2.length; i++) {
			System.out.println("Ingresa un numero en la posición "+i+ " : ");
	        numeros2[i]=input.nextInt();
		}
		input.close();
		//Vamos a imprimir un valor guardado teniendo números en el array
		System.out.println(numeros2[3]);*/
		//O para visualizarlos todos puedo hacer uso nuevamente de un ciclo
		//for (int i = 0; i < numeros2.length; i++) {
			//System.out.print(numeros2[i]+" ");
		
		//}
		int [] numeros3 = {1,2,3,4,5};
		char [] nombre = {'A','l','e','x'};
		String [] nombres= {"Abraham","Rafael","Jareth","Marcos"};
		//Otra forma de desplegar todos los valores de un array
		//es con una estructura ciclica for each
		for(String i:nombres)//Para cada elemento del array
			System.out.println(i);//Despliega cada uno en una nueva línea
	}

}
