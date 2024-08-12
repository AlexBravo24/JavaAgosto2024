package Condicionales;

import java.util.Scanner;

public class Condicionales5_RES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad,nota;
		String cadena;
		char sexo;
		Scanner lectura= new Scanner(System.in);
		System.out.println("Programa que decide si una persona es aceptada");
		System.out.println("Ingresa tu edad: ");
		edad=lectura.nextInt();
		System.out.println("Ingresa tu nota: ");
		nota=lectura.nextInt();
		System.out.println("Ingresa tu sexo: ");
		cadena=lectura.next();
		sexo=cadena.charAt(0);
		lectura.close();
		if(nota>=5&&edad>=18&&(sexo=='M'||sexo=='m'))
		{
		System.out.println("¡Es POSIBLE que seas admitid@ :)!");	
		}
		else
		{
		if(nota>=5&&edad>=18&&(sexo=='F'||sexo=='f'))
		{	
		 System.out.println("¡Has sido admitid@ :)!");
		}
		else
		{
	     System.out.println("¡No has sido admitid@ :(!");		
		}
		}
		

	}

}
