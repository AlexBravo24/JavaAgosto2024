package com;

public class Arrays2 {
  public static void main(String[] args) {
	int [] a = new int[100];
	int suma;
	float media;
	suma=0;
	for (int i = 0; i < a.length; i++) {
		a[i]=i+1;
		suma=suma+a[i];
	}
	media=suma/a.length;
	System.out.println("La suma de los elementos del arreglo es: "+suma);
	System.out.println("La media de los elementos del arreglo es: "+media);
}
}
