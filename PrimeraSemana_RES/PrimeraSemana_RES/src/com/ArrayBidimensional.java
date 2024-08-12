package com;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// Array bidimensional
		// Nos permite almacenar datos de forma tabular
		//Pasando a un concepto de "tabla
		//Permitiéndonos tener datos en filas y columnas
		//Declarar un array de dos dimensiones
		//con su tamaño inicial
		int [][] matriz = new int [3][3];
		
		// Con esa forma de crear el array no sabemos que
		// valores tiene al declararse
		//[0,0][0,1][1,2] Array unidimensional o primera fila de un array bidimensional
		//[1,0][1,1][1,2]Segunda fila del array bidimensional
		//[2,0][2,1][2,2 Tercera fila del array bidimensional
		
		//Para inicializar el array bidimensional elemento por elemento se procede a lo siguiente:
		matriz [0][0]=1;
		matriz [0][1]=2;
		matriz [0][2]=3;//hasta aquí se llenó la primera fila
		
		matriz [1][0]=4;
		matriz [1][1]=5;
		matriz [1][2]=6;
		
		matriz [2][0]=7;
		matriz [2][1]=8;
		matriz [2][2]=9;
		
		//Declarando una matriz bidimensional con valores asignados
		//desde el inicio de una forma más rápida
		
		int [][] matriz2 = {{1,2,3},{4,5,6},{7,8,9}};
		//Para recorrer un array bibimensional necesitaremos dos ciclos for
		for (int i = 0; i < matriz2.length; i++) {
			
		for (int j = 0; j < matriz2.length; j++) {
		    System.out.print(matriz2[i][j]+" ");	
		}
		System.out.println("");
		}
		
		//También
		//puede haber arrays de diferentes tipos de datos
		
	     Object [] elementos = {1,"Alex", 'B',10000.5};
	     
	     for(Object i:elementos)
	     {
	    	 System.out.println(i);
	     }
	    	 
			
		}
		
		

	}

