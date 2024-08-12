package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccioensListas {

	public static void main(String[] args) {
		// LISTAS
		//Son una colecci�n de datos o elementos
		//definida como una sucesi�n de los mismos
		//Esta colecci�n se implementa a trav�s de la interfase list
		//y pot medio de un array redimensionable de la clase
		//ArrayLista
		//Las listas s� admiten valores duplicados, es de las coleccioens
		//m�s utilizadas y con mejor rendimiento
		//No podemos guardar tipos de dato primitivo
		//Pero si datos de tijo Objeto (String, Wrapper, etc)
		
		//Delcarar una lista de elementos tipo String
		
		List<String> lista = new ArrayList<String> ();
		//importamos java.until.List y java.until.ArrayList
		//ArrayList es una clase mientras que List es la interfase 
		
		//Agregar elementos a nuestra lista
		lista.add("Adriana"); //en posicion 0
		lista.add("Carlos");
		lista.add("Sarai");
		lista.add("Alberto");
		lista.add("Gabriela");
		lista.add("Alberto");
		
		//Imprimir una lista en consola
		System.out.println(lista); 
		
		//imprimir o recuperar el valor de un solo elemento de la lista
		System.out.println(lista.get(2));
		
		//Devolver un valor booleano si el elemento existe en la lista
		System.out.println(lista.contains("Gabriela"));
		//da un valor true porque Gabriela s� est�
		
		//devolver la posici�n donde se encuentra el elemento por primera vez
		System.out.println(lista.indexOf("Alberto"));
		
		//devolver la �tlima posici�n donde encuentra el elemento
		System.out.println(lista.lastIndexOf("Alberto"));
		
		//Eliminar un elemento de la lista por OBJETO
		lista.remove("Alberto");
		System.out.println(lista);//solo elimina el primer elemento 
		
		//Eliminar un elemento de la lista por �NDICE
		lista.remove(4);
		System.out.println(lista);
		
		//A�adir elementos a la lista, indicando una determinada posici�n
		lista.add(2,"Celso");
		System.out.println(lista);
		//NO reemplaza los valores, sino que recorre lo que estaba en esa posici�n
		
		//Reemplazar el valor de una determinada posici�n
		lista.set(2, "Sandy");
		System.out.println(lista);
		
		//Recorrer o recuperar todos los valores de mi lista 
		//e imprimirlos en una nueva l�nea	
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		//Puedo almacenar varios elementos si parametrizo mi lista
		//con elementos Object o si no la prametrizo
		List<Object>coleccion= new ArrayList<Object>();
		coleccion.add("Nombre");
		coleccion.add(23);
		coleccion.add(3.1416);
		coleccion.add(true);
		coleccion.add('$');
		System.out.println(coleccion.get(2));
		
				
			


	}

}
