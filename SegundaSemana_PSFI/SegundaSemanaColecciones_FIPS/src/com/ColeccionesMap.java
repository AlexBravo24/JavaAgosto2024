package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccionesMap {

	public static void main(String[] args) {
		// La interfaz Map asocia o almacena los datos 
		//en pares (clave - valor a almacenar)
		//Las claves no pueden duplicarse
		
		//Es decir, la clave actua como un identificador unico
		//para cada ejemplo am almacenar (ID)
		
		//Declaramos de un Map y la clase HashMap
		//para almacenar claves de tipo Integer y elementos de tipo
		//String
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		//Agregamos elementos a nuestro HashMap
		usuarios.put(1, "Angel");
		usuarios.put(3, "Karla");
		usuarios.put(2, "Pedro");
		
		//Mando a impirmir mi HashMap en consola
		System.out.println(usuarios);
		
		//imprimir en pantalla un solo valor almacenado en
		//una determinada clave
		System.out.println(usuarios.get(2));
		
		//Eliminar ubn elemento de nuestro HaspMap
		usuarios.remove(3);
		
		System.out.println(usuarios);
		
		//Imprimir en consola las llaves de mi HashMap
		System.out.println(usuarios.keySet());
		
		//Imprimir en consola los valores contenidos en mi HashMap
		System.out.println(usuarios.values());
		
		//Imprimir cada una de las llaves con un ciclo 
		//for each
		for (String i: usuarios.values()) {
			System.out.println(i);
		}
		
		//Imprimir llaves y valores individualmente
		for(Integer i: usuarios.keySet()) {
			System.out.println("Llaves: " + i + " " + "Valor: " + usuarios.get(i));
		}
		
	}

}
