package com.arrays;

public class Arrays2_AGPR {

	public static void main(String[] args) {
		//Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del
		//1 al 100. Obt�n la suma de todos ellos y la media.
		
		int[] numero=new int[100];
		int suma=0;
		double media=0;
		
		for (int i = 0; i <= numero.length; i++) {
			suma += i;
			media= (double)suma/100;
		}
		System.out.println("La suma es: "+suma);
		System.out.println("La media es: "+media);
	}

}
