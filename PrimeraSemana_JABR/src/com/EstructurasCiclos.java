package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		
		// CICLOS - BUCLES - ITERACION
		//Son estructuras que nos ayudan a ejecutar "n" veces
		//un acción, tarea o bloque de código
		//de acuerdo al cumplimiento de una condición
		
		
		//Casi siempre nos apoyamos en el cumplimiento de la condición
		//de acuerdo al cambio de una variable, ya sea numérica, booleana, etc
		
		
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
		//Similar al ciclo while, solo que este primero ejecuta la acción y después
		//evalua si debe seguir ejecutandose
		//El proposito de este ciclo es que si existe una condición imposible
		//nos aseguremos que el programa se ejecutar por lo menos 1 vez
		
		/*
		do { //Ejecuta el siguiente bloque de codigo o acción
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
