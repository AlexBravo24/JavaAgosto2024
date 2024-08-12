package com;
import java.util.ArrayList;
import java.util.List;

public class ApunteLISTAS_ChatGPT {
	public static void main (String[]args) {
	
/*Listas (List)
�Qu� es una Lista?
Definici�n: Una lista es una colecci�n ordenada de elementos en la que cada elemento tiene una posici�n (�ndice). 
Las listas permiten elementos duplicados.
Orden: Mantiene el orden en que los elementos fueron a�adidos.
Acceso: Puedes acceder a un elemento por su posici�n (�ndice).
*/
	
/* SINTAXIS DE LISTAS
 * Las listas en Java se implementan a trav�s de la interfaz List. 
 * Las dos implementaciones m�s comunes son ArrayList y LinkedList. 
 * Aqu� est� la sintaxis b�sica para crear y usar una lista:
 */

	//1. IMPORTAR LAS CLASES
//	import java.util.ArrayList;
//	import java.util.List;
	
	//2. CREAR UNA LISTA
	//Para crear una lista, debes especificar el tipo de elementos que almacenar�. 
	//Por ejemplo, una lista de String:
	List<String> lista = new ArrayList<>();
	
	//3. A�ADIR ELEMENTOS:
	lista.add("Elemento 1");
	lista.add("Elemento 2");

	//4. ACCEDER A ELEMENTOS
	String primerElemento = lista.get(0); // Accede al primer elemento

	//5. ITERAR SOBRE LA LISTA
	for (String elemento : lista) {
	    System.out.println(elemento);
	}
	 //6. OBTENER EL TAMA�O
	int tama�o = lista.size();

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
     
     System.out.println("Tama�o de la lista: " + lista2.size());

     System.out.println(" ");
     System.out.println("RESUMEN DE SINTAXIS");
     System.out.println("Crear: List<T> lista = new ArrayList<>();\r\n" + 
     		"A�adir: lista.add(elemento);\r\n" + 
     		"Acceder: T elemento = lista.get(indice);\r\n" + 
     		"Iterar: for (T elemento : lista) {...}\r\n" + 
     		"Tama�o: int tama�o = lista.size();");
	}
}
