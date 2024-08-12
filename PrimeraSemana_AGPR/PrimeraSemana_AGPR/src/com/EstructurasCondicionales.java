package com;

import java.util.Scanner;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		//Estructuras Condicionales o de decisión
		//If-Evaluan valores booleanos
		
		Scanner entrada = new Scanner(System.in);
		
		int x;
		
		System.out.println("Introduce un numero");
		x=entrada.nextInt(); //Solo lee hasta encontrar un espacio
		
		
		if(x<11) {//Si (esto es verdad) {ejecuta lo siguiente}
			System.out.println("El numero "+x+" es menor a 11");
		}
		else {
			System.out.println("El numero "+x+" no es menor a 11");
		}
		
		//OPERADORES LOGICOS
		// AND, OR, NOT, DIFERENTE DE, IGUALDAD
		
		//Condiciones compuestas
		//AND - %%- Devuelve el valor true cuando se cumplen las condiciones
		
		System.out.println("AND <11 && >8");
		if (x<11 && x>8) {
			System.out.println("El numero "+x+" es menor a 11 y mayor a 8");
		}
		else {
			System.out.println("El numero "+x+" no es menor a 11 y mayor a 8");
		}
		
		//IGUALDAD
		System.out.println("IGUALDAD =4");
		if (x==4) {
			System.out.println("Si, el numero es 4");
		}
		else {
			System.out.println("El numero no es 4");
		}
		
		//OR - Se representa con ||. Devuelve el valor true cuando al menos una condicion se cumple
		System.out.println("OR <10 OR >20");
		if (x<10 || x>20) {
			System.out.println("Si");
		}
		else {
			System.out.println("No");
		}
		
		//Diferente de - != - Compara los valores y devuelve true
		//Si estos valores son diferentes
		System.out.println("DIFERENTE DE");
		if (x!=20) {
			System.out.println("El numero es diferente de 20");
		}
		else {
			System.out.println("El numero es 20");
		}
		
		//NOT -!- Niega una condicion
		System.out.println("NOT");
		if (!(x==20)) {
			System.out.println("Si");
		}
		else {
			System.out.println("No");
		}
		
		
		
		//ESTRUCUTA IF-ELSE ANIDADO O CONCATENADO
		System.out.println("IF ANIDADO");
		int dia = 5;
		if (dia==1) {
			System.out.println("lunes");
		}
		else if (dia== 2) {
			System.out.println("martes");
		}
		else if (dia==3) {
			System.out.println("miercoles");
		}
		else if (dia ==4) {
			System.out.println("jueves");
		}
		else if (dia==5) {
			System.out.println("viernes");
		}
		
		
		//Estructura de decision switch case
		switch (dia) {
		case 1: 
			System.out.println("Lunes");
			break;
		case 2: 
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5: 
			System.out.println("Viernes");
			break;
		default: 
			System.out.println("Error de dia");
			
		}
	} //cierre main
	

}
