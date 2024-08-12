package com;

import java.util.HashMap;
import java.util.Map;

public class ColeccdonesMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//La interface Map asocia o almacena los datos 
		
		//en pares (clave-valor)
		//Las claves no pueden duplicarse
		
		//Es decir, la clave actua como un identificador único
		//Para cada elemento a almacenar
		
		//Declaración de un Map y la clase HashMap
		//para almacenar claves de tipo Integer y elementos de tipo
		//String
		Map <Integer,String> usuarios = new HashMap<Integer, String>();
		//Agregamos elementos a nuestro HashMap
		usuarios.put(1,"Angel");
		usuarios.put(3,"Karla");
		usuarios.put(2,"Pedro");
		//Visualiza mi HashMap en consola
		System.out.println(usuarios);
		//Imprimir en pantalla un solo valor almacenado en
		//una determinada clave
		System.out.println(usuarios.get(2));
		//Eliminar un elemento de nuestro HashMAp
		usuarios.remove(3);
		System.out.println(usuarios);
		//Visualizar en consola las llaves de mi HashMap
		System.out.println(usuarios.keySet());
		//Si quiero visualizar los valores en consola los valores
		
		//en mi HashMao
		System.out.println(usuarios.values());
		//Visualizar cada una de las llaves con un ciclo for eachh
		for(Integer i:usuarios.keySet())
			System.out.println(i);
		//Si quiero visualizar cada uno de los valores de tipo String
		//lo hago con un ciclo foreach
		for(String i:usuarios.values())
			System.out.println(i);
		//Visualizar llaves y valores
		for(Integer i:usuarios.keySet())
			System.out.println("Llave: "+i+ " Valor: "+usuarios.get(i));
		
	}

}
