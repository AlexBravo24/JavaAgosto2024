package com;

public class MetodosString {

	public static void main(String[] args) {
		
		//Métodos o funcionalidades de la clase String
		
		//Cadena de ejemplo
		String cadena = "Hoy es 30 de Julio de 2024";
		
		//.length() - Nos devuelve en valor numérico entero
		//la longitud de una cadena de texto
		System.out.println(cadena.length());
		
		//Con el método .length() yo puedo almacenar ese valor en una variable
		//si lo necesitara utilizar posteriormente
		int longitud = cadena.length();
		
		//.charAt() - Nos devuelve el caracter solicitado de determinado
		//indice o posicion
		
		System.out.println(cadena.charAt(2));
		System.out.println(cadena.charAt(25));
		
		System.out.println(cadena.charAt(cadena.length()-1));
		
		//.toLowerCase - .toUpperCase()
		//Convierte a minusculas - Convierte a mayusculas
		
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		
		//.subString() - Nos devuelve una subcadena de la cadena original
		System.out.println(cadena.substring(4));
		System.out.println(cadena.substring(4, 20+1));
		
		//.equals() - Compara y devuelve un valor booleano
		//si las cadenas de texto u objetos son iguales
		System.out.println(cadena.equals("hoy es 30 de julio de 2024"));
		
		//.equalsIgnoreCase - Comparar dos cadenas de texto
		//no importando el uso de mayusculas y minusculas
		System.out.println(cadena.equalsIgnoreCase("hoy es 30 de julio de 2024"));
		
		//.replace() - Reemplaza la aparición de un caracter o secuencia de caracteres
		//con otros que necesitemos reemplazar
		System.out.println(cadena.replace("2024", "2025"));
		
		System.out.println(cadena.replace("o", "$"));
		
		System.out.println(cadena.replace(" ", ""));
		
		
		

	}

}
