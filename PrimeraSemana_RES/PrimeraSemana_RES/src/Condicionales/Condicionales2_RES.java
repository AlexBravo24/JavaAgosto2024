package Condicionales;

import java.util.Scanner;

public class Condicionales2_RES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lectura = new Scanner(System.in);
		int numero;
		System.out.println("Escribe un número por favor :) : ");
		numero = lectura.nextInt();
		lectura.close();
		if(numero%2==0)
		{
		 System.out.println("¡El número "+numero+" es par!");	
		}
		else
			System.out.println("¡El número"+" es impar!");

	}

}
