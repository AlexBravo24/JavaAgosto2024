/*
 * 4. Dado un array de números de 5 posiciones con los siguientes valores:
	{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con
	los valores invertidos, es decir, que el segundo array deberá tener los valores
	{5,4,3,2,1}.
 */

package com.arrays;

public class Arrays4_HIMG {

	public static void main(String[] args) {
		// Creación del array con 5 posciones.
		int [] array1 = {1, 2, 3, 4, 5}; 
		// Mostrar los numeros del primer array.
		for (int i : array1) {
			System.out.println(i);
		}
		
		// Impresión de un salto de linea para que se muestren separados el primer array del segundo.
		System.out.println(" ");
		
		// Creación del segundo array que contendra los valores del primer array pero invertidos.
		int [] array2 = new int [array1.length]; 
		
		// Invertir los valores del primer array y guardarlos en el segundo array.
		for (int i = 0; i < array1.length; i++) {
			array2[i] = array1[array1.length -1 -i];
		}
		
		// Mostrar el resultado del segundo array.
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i] + " ");
		}

	}

}
