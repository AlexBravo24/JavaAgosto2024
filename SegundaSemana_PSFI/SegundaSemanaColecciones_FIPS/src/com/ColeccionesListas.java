package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		// Listas-- Son una colecc
		//son de datos o elementos 
		// definida; como una sucesion de los mismos
		//esta coleccion se implementa a travez de la interface lista
		//y por medio de un array rendimensionable de la clase
		
		//ArrayList
		//Las listas si admiten valores duplicados, es de las colecciones 
		//mas utilizadas y con mejor rendimiento 
		//No podemos guardar tipos de datos primitivo
		//Pero si datos  de tipo objeto(String, Wrapper, etc)
		
		//Declarar una lista de elementos 
		List<String> lista = new ArrayList<String> ();
		
		//Agregar elementos a nuestra lista
		lista.add("Adriana"); //0
		lista.add("Carlos"); //1
		lista.add("Sarai");//3
		lista.add("Alberto");//4
		lista.add("Gabriela");//5
		lista.add("Alberto");
		
		//Imprimir una lista en consola
		
		System.out.println(lista); 
		
		//Imprimir o recupera un solo elemento de la lista 
		System.out.println(lista.get(2)); 
		
		//Devuelva un valor bolean si el elemento existe en la lista
		System.out.println(lista.contains("Gabriela"));
		
		//Devuelve la posicion donde se encuntra al elemento por
		//primera vez
		System.out.println(lista.indexOf("Alberto"));
		
		//Devuelkve la ultima nposicion donde encuentra al elemento
		System.out.println(lista.lastIndexOf("Alberto")); 
		
		//Eliminar un elemento de mi lista
		lista.remove(5);
		System.out.println(lista);
		
		//Añadir elemento a la lista, inidcando una determinada posicion
		lista.add(2, "Celsio"); //se agrega el elemento  y desplaza
		//Las posiciones. NO SE REMPLAZAN el elemento del indice indicado
		System.out.println(lista);
		
		//Remplazar el valor de una determinada posicion
		lista.set(3, "Sandy");
		System.out.println(lista);
		
		//Recorrer o recuperar todos los valores de mi lista 
		//e imprimir en una nueva linea
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		//Puedo almacenar varios elementos si parametriso mi lista con elemento objet
		//o si no la parametrizo
		List<Object> coleccion = new ArrayList<Object>();
		
		coleccion.add("Mombre");
		coleccion.add(23);
		coleccion.add(3.1416);
		coleccion.add(true);
		coleccion.add('$');
		
		System.out.println(coleccion.get(2));
		
;		

	}

}
