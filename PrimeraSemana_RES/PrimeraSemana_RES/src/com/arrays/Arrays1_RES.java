package com.arrays;

import java.util.Scanner;

public class Arrays1_RES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int [] a= new int[10];
		Scanner lectura= new Scanner(System.in);
		System.out.println("Programa que pide 10 elementos de un arreglo y los despliega");
	    for (i = 0; i < a.length; i++) {
			System.out.println("Escriba a["+i+"]: ");
			a[i]=lectura.nextInt();
		}
	    lectura.close();
	    System.out.println("El arreglo ingresado es: ");
	    for (i = 0; i < a.length; i++) {
			System.out.print("a["+i+"]= "+a[i]+" ");
		}
 
	}

}
