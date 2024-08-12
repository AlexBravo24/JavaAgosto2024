/*Una expresi�n lambda en Java es una forma de definir una funci�n 
	 * sin necesidad de usar una clase an�nima o una implementaci�n 
	 * completa de una interfaz funcional. Permite escribir c�digo m�s 
	 * limpio y conciso, especialmente al trabajar con interfaces 
	 * funcionales.
	 */
	
	//SINTAXI B�SICA
	
	/*La sintaxis b�sica de una expresi�n lambda es:
	 * (parameters) -> expression
	 * 
	 * 
	 * parameters: Los par�metros de la lambda, que son similares a los par�metros de un m�todo.
	 * ->: El operador lambda que separa los par�metros de la expresi�n o el bloque de c�digo
	 * expression: La expresi�n o el bloque de c�digo que define el comportamiento de la lambda.
	 */
	
package com;
import java.util.function.Function;


public class LambdaChatGPT {
	
	public static void main(String[] args) {
		
		//1. DEFINIR UNA INTERFAZ FUNCIONAL
		/*Las interfaces funcionales son interfaces que tienen exactamente un m�todo abstracto. 
		 * Aqu� usamos Function<T, R> que representa una funci�n que toma un par�metro de tipo
		 * T y devuelve un resultado de tipo R.
		 */

        // Crear una funci�n lambda que convierte un String a su longitud
        Function<String, Integer> longitud = (str) -> str.length();
        
        // Usar la funci�n lambda
        int longitudDeTexto = longitud.apply("Hola Mundo");
        System.out.println("La longitud del texto es: " + longitudDeTexto); // Imprime 11
        
        //2. IDENTIFICAR EL TIPO DE PAR�METRO
        
	
	
	
	
	}
}
