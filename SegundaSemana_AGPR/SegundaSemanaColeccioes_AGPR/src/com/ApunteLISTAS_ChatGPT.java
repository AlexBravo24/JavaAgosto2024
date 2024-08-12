package com;
import java.util.ArrayList;
import java.util.List;

public class ApunteLISTAS_ChatGPT {
	public static void main (String[]args) {
	
/*Listas (List)
¿Qué es una Lista?
Definición: Una lista es una colección ordenada de elementos en la que cada elemento tiene una posición (índice). 
Las listas permiten elementos duplicados.
Orden: Mantiene el orden en que los elementos fueron añadidos.
Acceso: Puedes acceder a un elemento por su posición (índice).
*/
	
/* SINTAXIS DE LISTAS
 * Las listas en Java se implementan a través de la interfaz List. 
 * Las dos implementaciones más comunes son ArrayList y LinkedList. 
 * Aquí está la sintaxis básica para crear y usar una lista:
 */

	//1. IMPORTAR LAS CLASES
//	import java.util.ArrayList;
//	import java.util.List;
	
	//2. CREAR UNA LISTA
	//Para crear una lista, debes especificar el tipo de elementos que almacenará. 
	//Por ejemplo, una lista de String:
	List<String> lista = new ArrayList<>();
	
	//3. AÑADIR ELEMENTOS:
	lista.add("Elemento 1");
	lista.add("Elemento 2");

	//4. ACCEDER A ELEMENTOS
	String primerElemento = lista.get(0); // Accede al primer elemento

	//5. ITERAR SOBRE LA LISTA
	for (String elemento : lista) {
	    System.out.println(elemento);
	}
	 //6. OBTENER EL TAMAÑO
	int tamaño = lista.size();

	//EJEMPLO COMPLETO
	System.out.println(" ");
	System.out.println("EJEMPLO COMPLETO");
	
	 List<String> lista2 = new ArrayList<>();
     lista2.add("Manzana");
     lista2.add("Banana");
     lista2.add("Cereza");
     
     System.out.println("Primer elemento: " + lista2.get(0)); // Imprime "Manzana"
     
     for (String fruta : lista2) {
         System.out.println(fruta);
     }
     
     System.out.println("Tamaño de la lista: " + lista2.size());

     System.out.println(" ");
     System.out.println("RESUMEN DE SINTAXIS");
     System.out.println("Crear: List<T> lista = new ArrayList<>();\r\n" + 
     		"Añadir: lista.add(elemento);\r\n" + 
     		"Acceder: T elemento = lista.get(indice);\r\n" + 
     		"Iterar: for (T elemento : lista) {...}\r\n" + 
     		"Tamaño: int tamaño = lista.size();");
	}
}
