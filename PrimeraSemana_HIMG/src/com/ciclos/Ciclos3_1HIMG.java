package com.ciclos;

import java.util.Scanner;

public class Ciclos3_1HIMG {

	public static void main(String[] args) {
		//3. Realiza un programa para determinar si un String
		//es palindromo
		
		//Podemos ingresar los String por teclado
		//para ello podemos utilizar uno que se introduzca como
		//original y otro que se "arme" en reversa para compararse
		//contra el primero
		
		String original;
		String reversa = "";
		
		//Declaro mi Scanner para poder ingresar y asignar los datos
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa una palabra o frase");
		original = entrada.nextLine();
		entrada.close(); //cierro mi Scanner para no introducir más valores
		
		
		//Procedo a iterar al revés para armar mi String en reversa
		
		for (int i = original.length()-1; i >=0; i--) {
			reversa = reversa + original.charAt(i);
		}
		
		System.out.println("Original: " + original.replace(" ", ""));
		System.out.println("Reversa: " + reversa.replace(" ", ""));
		
		//Validamos
		if (original.replace(" ", "").equalsIgnoreCase(reversa.replace(" ", ""))) {
			System.out.println("La palabra/frase ingresada es un palíndromo");
		}else {
			System.out.println("La palabra/frase ingresada no es un palíndromo");
		}

	}

}