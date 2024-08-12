package com.arrays;

import java.util.Scanner;

public class Arrays3_RES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char [] cadena= new char [10];
        String str="";
        Scanner lectura= new Scanner(System.in);
        System.out.println("Escribe una frase: ");
        str=lectura.nextLine();
        for (int i = 0; i < str.length(); i++) {
			cadena[i]=str.charAt(i);
		}
        lectura.close();
        System.out.println("La cadena introducida es: ");
        System.out.println(cadena);
	}

}
