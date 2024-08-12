package com;

public class MetodosString {

	public static void main(String[] args) {
		// Metodo o funcionalidades de la clase String 
		
		//Cadena de ejemplos
		String cadena = "Hoy es 30 de Julio de 2024";
		
		//metodo .length ( ) = Nos devulve en valor numerico
		//la longitud de una cadena de texto
		
		System.out.println(cadena.length());  
		
		//con el metodo .length() yo puedo almacenar ese valoren una variable 
		//si lo necesitara utilizar posteriormente
		
		int longitud = cadena.length(); 
		
		//metodo .CharAT() = Nos devuelve el caracter solicitado de determinado indice o posición 
		// indice o posición 
		
		System.out.println(cadena.charAt(2));
		System.out.println(cadena.charAt(25));
		
		System.out.println(cadena.charAt(cadena.length()-1));
		
		//metodo .toloWerCase - .toUpperCase()
		//Convierte a minusculas - convertirce amayuscuas 
		
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		
		//metodo .substring() - Nos devuelve una subcadena de la cadena orginal 
		System.out.println(cadena.substring(4));
		System.out.println(cadena.substring(4,  20+1));
		
		//metodo .equals() -. compara y devuelve un valor booleano ai lA Cdenas de texto u objetos son iguales
		
		System.out.println(cadena.equals("hoy es 30 de julio de 2024"));
		
		//.euqualsIgnoreCase - comparar dos cadenas de texto no importando el uso de mayusculas y minusculas
		
		System.out.println(cadena.equalsIgnoreCase("Hoy es 30 de Julio de 2024"));
		
		//metodo .replace() remplazar la aparicion de un caracer o secuenca de caracteres  con otros que necesitamos remplazar
		System.out.println(cadena.replace("2024", "2025"));
		
		System.out.println(cadena.replace("o", "0"));
		
		System.out.println(cadena.replace("", ""));

	}

}
