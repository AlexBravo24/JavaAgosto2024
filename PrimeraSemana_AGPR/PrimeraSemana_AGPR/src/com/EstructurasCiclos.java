package com;

public class EstructurasCiclos {

	public static void main(String[] args) {
		// CICLOS-BUCLES-ITERACION
		//Son estructuras que nos ayudan a ejecutra "n" veces
		//una accion, tarea o bloque de codigo
		//de acuerdo al cumplimiento de una condicion

		//Casi siempre nos apoyamos en el cumplimiento de la condicion
		//de acuerdo al cambio de una variable, ya sea numerica, booleana, etc
		
		//WHILE- mientras algo se cumpla, se ejecuta un bloque de codigo
		
		/* while (esto se cumpla){
		 * 		se ejecuta este codigo
		 * }
		 */
		
		/*
		int x=0;
		while (x<5) {
			System.out.println("Hola mundo");
			
			//para que este codigo no tienda al infinito, necesitamos agregar 
			//un control o incremento en x
			x++; //lo mismo que x=x+1
		}
		*/
		
		// DO WHILE
		//Similar el ciclo while, solo que este primero ejecuta la accion, y 
		//despues evalua si debe seguir ejecutandose
		//El proposito es que, si existe una condicion imposible, nos aseguremos de que el
		//programa ejecuta por lo menos una vez
		/*int x=1;
		do {
			System.out.println("Hola mundo");
		} while (x>2);
		
		
		//FOR-ciclo determinado- es decir, se utiliza cuando queremos ejecutar
		//una tarea un determinado numero de veces o conocemos hasta donde puede llegar
		
		/* for (estos argumentos){
		 * 		ejecutamos este codigo
		 * }
		 * 
		 * for (una variable iniciada en un valor; mientras se cumpla esto; incremento variable){
		 * 		se ejecuta esto
		 * }
		 */
		
		for (int i = 1; i < 5; i++) {
			System.out.println(i+ " hola mundo");
			
		}
		
	}

}
