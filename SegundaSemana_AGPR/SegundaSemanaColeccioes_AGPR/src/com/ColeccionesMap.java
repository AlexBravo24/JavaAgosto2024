package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesMap {

	public static void main(String[] args) {
		// La interfaz MAP asocia o almacena los datos
		//en pares (clave-valor de almacenar)
		//Las claves no pueden duplicarse
		
		//Es decir, la clave actúa como un identificador único
		//para cada elemento o almacenar (ID)
		
		//Declaración de un MAP y la clase HashMap
		//para almacenar claves de tipo Integer y elementos de tipo
		//String
		
		Map<Integer,String> usuarios=new HashMap <Integer, String>();

		//Agregamos elementos a nuestro HashMap
		
		usuarios.put(1, "Angel");
		usuarios.put(3, "Karla");
		usuarios.put(2, "Pedro");
		
		//Imprimir mi HashMap en  consola
		System.out.println(usuarios);
		
		//Imprimir en pantalla un solo valor almacenado en una determinada clave
		System.out.println(usuarios.get(2));
		
		//Eliminar un elemento de nuestro HashMap
		usuarios.remove(3);
		System.out.println(usuarios);
		
		//Imprimir en consola las llaves del HashMMap
		System.out.println(usuarios.keySet());
		
		//Imprmir en consola los valores contenidos en mi HashMap
		System.out.println(usuarios.values());
		
		//Mandar a imprimir cada una de las llaves con un ciclo for each
		for (Integer i: usuarios.keySet()) {
			System.out.println(i);
		}
		
		//Mandar a imprimir cada uno de los valores
		for (String i: usuarios.values()) {
			System.out.println(i);
		}
		
		//Imprimir llaves y valores
		for (Integer i: usuarios.keySet()) {
			System.out.println("LLave: "+i+ ". Valor: "+ usuarios.get(i));
		}
	}

}
