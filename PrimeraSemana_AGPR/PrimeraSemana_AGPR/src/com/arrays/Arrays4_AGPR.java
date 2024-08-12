package com.arrays;

public class Arrays4_AGPR {

	public static void main(String[] args) {
		// Dado un array de números de 5 posiciones con los siguientes valores:
		//{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con
		//los valores invertidos, es decir, que el segundo array deberá tener los valores
		//{5,4,3,2,1}
		
		 int[] arrayOriginal = {1, 2, 3, 4, 5};

	        // Crear un nuevo array para almacenar los valores invertidos
	        int[] arrayInvertido = new int[arrayOriginal.length];

	        // Llenar el array invertido con los valores del array original en orden inverso
	        for (int i = 0; i < arrayOriginal.length; i++) {
	            arrayInvertido[i] = arrayOriginal[arrayOriginal.length - 1 - i];
	        }

	        // Imprimir el array invertido
	        System.out.println("Array original: ");
	        for (int num : arrayOriginal) {
	            System.out.print(num + " ");
	        }

	        System.out.println("\nArray invertido: ");
	        for (int num : arrayInvertido) {
	            System.out.print(num + " ");
	        }
	    }

	}

