package com;

public class EstructurasCiclicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CICLOS-BUCLES-ITERACIONES
		//Son estructuras que nos ayudan a ejecutar "n" veces
		//una acci�n tarea o bloque de c�digo
		//de acuerdo al cumplimiento de una condici�n.
		
		//Casi siempre nos apoyamos en el cumplimiento de una condici�n
		//de acuerdo al cambio de una variable, ya sea num�rica, booleana, etc
		
		//Estructura c�clica while-mientras
		//Mientras algo se cumpla se ejecuta un bloque de c�digo.
		
		/*Sintaxis b�sica:
		 * mientras(algoSeCumpla)
		 *         {
		 *          Se ejecuta este c�digo
		 *         }
		 * 
		 */
		int x=1;
		//ejemplo de uso de while
/* while(x<5)
		{
		 //System.out.println("Hola mundo");
		 //Para que este c�digo no se ejecute infinitas veces
		 //necesitamos agregar un control incrementando a "x"
		 System.out.println("x = "+x);
		 //x=x+1; otra forma de incrementar a x es haciendo x++;
		 x++;
		}
		*/
        
		//Estructura c�clica do-while
		//Es una estructura c�clica parecida al ciclo do-while, s�lo que
		//ejecuta por al menos una ocasi�n y despu�s eval�a si debe seguir ejecut�ndose
		
		/*do
		  {
			System.out.println("�Hola mundo!");
		   }
		while(x>2);*/
		
		//El ciclo for es un ciclo determinado, es decir se utiliza
		//cuando queremos ejecutar una tarea un determinado n�mero de
		//veces o conocemos hasta donde puede llegar esa tarea
		
		//Estructura del ciclo for:
		//Para(estos argumentos)
        //    {
		//     Ejecutamos una o m�s l�neas de instrucci�n
		//     }
		//Para(unaVariableInicializadaEnUnValor;hastaQueSeCumplaEstaCondicion;ModificarLaVariableInicializada)
		//    {
		//     ejecutamosElC�digo
		//     }
		//Una forma de acortar la escritura de la estructura for es escribiendo
		//for y enseguida presionando ctrl+espacio y luego enter
		for (x =1; x <=5; x++) {
			System.out.println("x="+x);
		}
		//Otra manera de declarar un array
		//Es con sus valores definidos desde el inicio
		
	}

}
