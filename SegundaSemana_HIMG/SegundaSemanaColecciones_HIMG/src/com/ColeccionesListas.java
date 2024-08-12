package com;

import java.util.ArrayList;
import java.util.List;

public class ColeccionesListas {

	public static void main(String[] args) {
		// Listas - Son una coleccion de datos o elementos 
		// definida como una sucesion de los mismos
		// Esta coleccion se implementa a tráves de la interface List 
		// y por medio de un array redimensionable de la clase 
		// ArrayList.
		
		// Las listas si admiten valores duplicados, es de las colecciones más 
		// utilizadas y con mejor rendimiento
		// No podemos guardar tipos de dato primitivo
		// Pero si datos de tipo Objeto (String, Wrapper, ect)
		
		// Declarar una lista de elementos de tipo String
		List<String> lista = new ArrayList<String>();
		
		// Agregar elemnetos a nuestra lista
		lista.add("Adriana");
		lista.add("Carlos");
		lista.add("Sarahi");
		lista.add("Alberto");
		lista.add("Gabriela");
		lista.add("Alberto");
		
		// Imprimir una lista en consola.
		System.out.println(lista);
		
		// Imprimir o recuperar el valor de un solo elemento de la lista.
		System.out.println(lista.get(2));
		
		// Devuelva un valor booleano si el elemento existe en la lista.
		System.out.println(lista.contains("Gabriela"));
		
		// Devuelve la posción donde se encuentra a el elemento por primera vez.
		System.out.println(lista.indexOf("Alberto"));
		
		// Devuelve la ultima posición donde encuentra al elemento
		System.out.println(lista.lastIndexOf("Alberto"));
		
		// Eliminar un elemento de mi lista
		lista.remove(5);
		System.out.println(lista);
		
		// Podemos añadir elementos a la lista indicando una determinada posición.
		lista.add(2, "Celso"); // Se agrega el elemento y desplaza
		// las posiciones. No reemplaza el elmento del indice indicado.
		System.out.println(lista);
		
		// Reemplazar el valor de una determinada posicion
		lista.set(3, "Sandy");
		System.out.println(lista);
		
		// Recorrer o recuperar todos los valores de mi lista
		// e imprimir en una nueva linea
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		// Puedo almacenar varios elemnetos si parametrizo mi lista
		// con elementos Object o si no la parametrizo.
		List<Object> coleccion = new ArrayList<Object>();
		coleccion.add("Nombre");
		coleccion.add(23);
		coleccion.add(3.1416);
		coleccion.add(true);
		coleccion.add('$');
		
		System.out.println(coleccion.get(2));
		
		
		
		
	}

}
