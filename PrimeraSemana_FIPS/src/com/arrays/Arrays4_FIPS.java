package com.arrays;

public class Arrays4_FIPS {

	public static void main(String[] args) {
		// Dado un array de números de 5 posiciones con los siguientes valores:
		//{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
		//los valores invertidos, es decir, que el segundo array deberá tener los valores 
		//{5,4,3,2,1}
        int[] arrayOriginal = {1, 2, 3, 4, 5};

        // Crear un array nuevo para almacenar los valores invertidos
        int[] arrayInvertido = new int[arrayOriginal.length];

        // Invertir los valores del arrayOriginal y guardarlos en arrayInvertido
        for (int i = 0; i < arrayOriginal.length; i++) {
            arrayInvertido[i] = arrayOriginal[arrayOriginal.length - 1 - i];
        }

        // Mostrar el contenido del array invertido
        System.out.println("Array invertido:");
        for (int i = 0; i < arrayInvertido.length; i++) {
            System.out.print(arrayInvertido[i] + " ");
        }
    }
}