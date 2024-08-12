package com;

public class EstructurasCiclicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CICLOS-BUCLES-ITERACIONES
		//Son estructuras que nos ayudan a ejecutar "n" veces
		//una acción tarea o bloque de código
		//de acuerdo al cumplimiento de una condición.
		
		//Casi siempre nos apoyamos en el cumplimiento de una condición
		//de acuerdo al cambio de una variable, ya sea numérica, booleana, etc
		
		//Estructura cíclica while-mientras
		//Mientras algo se cumpla se ejecuta un bloque de código.
		
		/*Sintaxis básica:
		 * mientras(algoSeCumpla)
		 *         {
		 *          Se ejecuta este código
		 *         }
		 * 
		 */
		int x=1;
		//ejemplo de uso de while
/* while(x<5)
		{
		 //System.out.println("Hola mundo");
		 //Para que este código no se ejecute infinitas veces
		 //necesitamos agregar un control incrementando a "x"
		 System.out.println("x = "+x);
		 //x=x+1; otra forma de incrementar a x es haciendo x++;
		 x++;
		}
		*/
        
		//Estructura cíclica do-while
		//Es una estructura cíclica parecida al ciclo do-while, sólo que
		//ejecuta por al menos una ocasión y después evalúa si debe seguir ejecutándose
		
		/*do
		  {
			System.out.println("¡Hola mundo!");
		   }
		while(x>2);*/
		
		//El ciclo for es un ciclo determinado, es decir se utiliza
		//cuando queremos ejecutar una tarea un determinado número de
		//veces o conocemos hasta donde puede llegar esa tarea
		
		//Estructura del ciclo for:
		//Para(estos argumentos)
        //    {
		//     Ejecutamos una o más líneas de instrucción
		//     }
		//Para(unaVariableInicializadaEnUnValor;hastaQueSeCumplaEstaCondicion;ModificarLaVariableInicializada)
		//    {
		//     ejecutamosElCódigo
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
