package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		// CICLOS - BUCLES - ITERACION
		//Son estructuras que nos ayudan a ejecutar "n" veces
		//un acci�n, tarea o bloque de c�digo
		//de acuerdo al cumplimiento de una condici�n
		
		
		//Casi siempre nos apoyamos en el cumplimiento de la condici�n
		//de acuerdo al cambio de una variable, ya sea num�rica, booleana, etc
		
		
		//while - mientras
		//meintras algo se cumpla, se ejecuta un bloque de codigo
		
		/*
		 * mientras (esto se cumpla){
		 * 			se ejecuta este codigo
		 * }
		 */
		
		int x = 1;
		/*
		while (x<=5) {
			System.out.println(x + " .-Hola mundo");
			//para que este codigo no tienda al infinito, necesitamos agregar un control
			//o incremento en x
			//x = x + 1;
			//otra forma de expresar el incremento de x
			x++;
		}
	*/
		
		//do - while
		//Similar al ciclo while, solo que este primero ejecuta la acci�n y despu�s
		//evalua si debe seguir ejecutandose
		//El proposito de este ciclo es que si existe una condici�n imposible
		//nos aseguremos que el programa se ejecutar por lo menos 1 vez
		
		/*
		do { //Ejecuta el siguiente bloque de codigo o acci�n
			System.out.println("Hola mundo");
		}while (x>2);
		*/
		
		//for - ciclo determinado - es decir, se utiliza cuando queremos ejecutar una tarea
		//un determinado numero de veces o conocemos hasta donde puede llegar esa tarea
		
		
		/*
		 * para (estos argumentos){
		 * 		ejecutamos este codigo
		 * }
		 * 
		 * para (una variable iniciada en un valor; mientras se cumpla esto; incremento variable){
		 * 		se ejecuta esto
		 * }
		 */
		
		for (int i = 0; i <= 5; i++) {
			System.out.println(i + ".-Hola Mundo");
		}
		
	}

}
