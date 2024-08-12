package com;

public class EstructuraCiclos {

	public static void main(String[] args) {
		// Ciclos - BUBLES - ESTRUCTURAS ITERACION
		//Son estructura que nos ayuda a eecutar N veces una accion tarea o bloque de codigo
		//De acuerdo al cumplimiento de una condicion
		
		//Casi siempre nos apoyanos en el cumplimiento de la condcion
		//de acuerdo al cambio fr una variable, ya sea numerica, booleana etc..
		
		//While- mientras 
		//mientrras algo se cumpla, se ejecuta un bloque de codigo
		
		/*
		 * Mientras(esto se cumpla 
		 * se ejecuta este codigo)
		 */
		
		int x = 1; 
		
//		while (x <= 5){
//			System.out.println(x + ".-Hola mundo");
//			//para que este codigo no se tienda al infinio, necesito agregarun conterol o incremento en x
//			
//			//x = x + 1; //Se detiene en while, X es igual a lo que vale ese momento mas +1
//			//otraforma de expresar el incremento de x
//			
//			x++;
//		}
		
		//DO - WHILE
		//Similira al cicl while, solo que este primero ejecutar la accion y despues evaluar si debe segui ejecutando
		//Propocito del cicloesque si existe una condicion imposible, noos aseguremosque el programa se ejecute por lo menos 1 vez
		
//		do { //Se ejecuta el siguiente blooque de codigo o accion
//			System.out.println("Hola mundo"); 
//		} while (x>2); 
		
		//CICLO FOR, ciclodeterminador, se usa cuando queremos ejecutar una tarea, un determinado de veces o conocemos a donde puede llegaer esa tarea
		/*Para estos argumentos {
		 * ejecutamos este codigo
		 * 
		 * para (una variable en un alor, mientras se cumplan esto, incrementto variable)
		 * se ejecuta esto
		 */
		for (int i = 1; i < 5; i++) {
			System.out.println(i + ".- Hola mundo");
			
		}
		
	}

}
