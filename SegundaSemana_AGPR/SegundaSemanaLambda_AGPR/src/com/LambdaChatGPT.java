/*Una expresión lambda en Java es una forma de definir una función 
	 * sin necesidad de usar una clase anónima o una implementación 
	 * completa de una interfaz funcional. Permite escribir código más 
	 * limpio y conciso, especialmente al trabajar con interfaces 
	 * funcionales.
	 */
	
	//SINTAXI BÁSICA
	
	/*La sintaxis básica de una expresión lambda es:
	 * (parameters) -> expression
	 * 
	 * 
	 * parameters: Los parámetros de la lambda, que son similares a los parámetros de un método.
	 * ->: El operador lambda que separa los parámetros de la expresión o el bloque de código
	 * expression: La expresión o el bloque de código que define el comportamiento de la lambda.
	 */
	
package com;
import java.util.function.Function;


public class LambdaChatGPT {
	
	public static void main(String[] args) {
		
		//1. DEFINIR UNA INTERFAZ FUNCIONAL
		/*Las interfaces funcionales son interfaces que tienen exactamente un método abstracto. 
		 * Aquí usamos Function<T, R> que representa una función que toma un parámetro de tipo
		 * T y devuelve un resultado de tipo R.
		 */

        // Crear una función lambda que convierte un String a su longitud
        Function<String, Integer> longitud = (str) -> str.length();
        
        // Usar la función lambda
        int longitudDeTexto = longitud.apply("Hola Mundo");
        System.out.println("La longitud del texto es: " + longitudDeTexto); // Imprime 11
        
        //2. IDENTIFICAR EL TIPO DE PARÁMETRO
        
	
	
	
	
	}
}
