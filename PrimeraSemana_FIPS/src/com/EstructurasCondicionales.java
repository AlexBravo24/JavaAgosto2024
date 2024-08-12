package com;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		
		// Estructuras condicionales o de decision
		//If = Evaluan valores booleanos
		
		int x = (10); 
		
		if (x<10) { // si (esto es verdad) { ejecutara lo siguiente
			System.out.println("Si");
		}  else { // de otro modo, ejecuta lo siguiente
			System.out.println("No");
		}
		
		//Operadores logicos
		//AN, OR, NOT, DIFERENTE DE, IGUALDAD
		
		//CONDICIONAES COMPUESTAS
		//AND - && - Devuelve el valor true cuando se cumole todas las condicionaes
		System.out.println("Resultado operador logico AND");
		if (x<11 && x>8 && x==9) {
			System.out.println("Si");
		}else { 
			System.out.println("No");
		}
		
		//Operador logico OR 
		//OR - || - Devolver el valor true cuando se cumpla al menos una de las condicionaes
		System.out.println("Resultado operador logico OR");
		if (x<10 || x>8 || x==9) {
			System.out.println("Si");
		}else { 
			System.out.println("No");
		}
		
		//OPERADOR DIFERENTE DE
		//!= - Compara valores y devuelve true  si estos valores son diferentes 
		System.out.println("Resultado operador logico DIFERENTE DE");
		if (x != 20) {
			System.out.println("Si");
		}else { 
			System.out.println("No");
		}
		
		//Operador de igualdad o comparacion 
		//== Compara si los valores son igualeds y devuelve true cuando esto se cumple
		
		//Un solo = significa ASIGNACION
		//Es decir int = 10; Aqui asigno y guardo el valor 10 en mi variable entera

        System.out.println("Resultado operador logico IGUALDAD A");
		if (x == 10) {
			System.out.println("Si");
		}else { 
			System.out.println("No");
		}
		
		//Comparador NOT
		//! - Niega una condicion o mas buen, cambia el valor de true
		//a false  y viceversa
		System.out.println("Resultado operador logico NOT");
		if (! (x == 10)) {
			System.out.println("Si");
		}else { 
			System.out.println("No");
		}
		
		
		//Estructura if-else anidado o concatenado
		System.out.println("ESTRUCTURA IF-ELSE ANIDADO");
		
		int dia = 5;
		
		if(dia == 1) {
			System.out.println("Lunes");
		}else if (dia == 2) {
			System.out.println("Martes");
		}else if (dia == 3) {
		System.out.println("Miercole");
		}else if (dia == 4) {
			System.out.println("Jueves");
		}else if (dia == 5) {
			System.out.println("Viernes");
		}else {
			System.out.println("Error de dia");
		}
		
		
		
		//Estructura de decicion SWITCH-CASE
		
		System.out.println("Estructura SWITCH-CASE");
		
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
			System.out.println("Juevess");
			break;
		case 5:
			System.out.println("Viernes");
			break;
			
		default:
			System.out.println("Error de dia ");
		}
		
		
	} //Cierre el main

} //Cierre de la clase 
