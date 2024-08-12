package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// Se conocen como ciclos, bucles o estructuras de iteracion. Son estructuras que nos aayudan a ejecutar N veces 
		// una tarea o bloque de codigo de acuerdo al cumplimiento de una condición.
		
		// Casi siempre nos apoyamos en el cumplimiento de la condicion
		// de acuerdo al cambio de una variable, ya sea numerica, booleana, ect.
		
		// while (mientras)Mientras algo se cumpla se ejecuta un bloque de codigo.
		// mientras (esto se cumpla){
		// ejecutar este bloque de codigo.}
		
		int x = 1;
//		while (x<=5) {
//			System.out.println(x + " .-Hola mundo");
//			// Para que este codigo no tienda al infinito necesitamos implementar un control o incremento en x.
//			// x = x + 1;
//			// Otra forma de expresar el incremento en x.
//			x++;
//		}
		// do - while 
		// Similar al ciclo while, solo que este primero se ejecuta una accion 
		// y despues evalua si debe ejecutarse.
		// El proposito de este ciclo es que si existe una condición imposible 
		// nos aseguramos que el programa se ejecute por lo menos 1 vez.
		
//		do { // Ejecuta el siguiente bloque de codigo o acción.
//			System.out.println("Hola mundo");
//		}while (x>2);
		
		// for - Ciclo determinado - es decir se utiliza cuando queremos ejecutar una tarea.
		// un determinado numero de veces o conocemos hasta donde puede llegar esta tarea.
		
		/*
		 * para (estos argumenmtos){
		 * ejecutamos este codigo}
		 * 
		 * para (una variable iniciada en un valor; mientras se cumpla esto; incremento variable){
		 * se ejecuta esto.
		 * }
		 */
		
		for (int i = 0; i <= 5; i++) {
			System.out.println(i + " .- Hola Mundo");
			
		}
		

	}

}
