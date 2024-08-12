package com;

public class metodosString {

	public static void main(String[] args) {
		// Metodos o funcionalidades de la clase String.
		
		// Cadena de ejemplo.
		String cadena = "Hoy es 30 de julio de 2024";
		
		// .length - Nos devuelve en valor numerico entero la longitud de una cadena de texto.
		System.out.println(cadena.length());
		
		// Con el metodo .length() puedo almacenar ese valor en en una variable si lo necesitara 
		// utilizar posteriormente.
		
		int longitud = cadena.length();
		
		// .charAt() - Nos devuelve el caracter solicitado de determinado indice o posición.
		System.out.println(cadena.charAt(2));
		System.out.println(cadena.charAt(25));
		
		System.out.println(cadena.charAt(cadena.length()-1));
		
		// .toLowerCase - .toUpperCase
		// Convierte a minusculas - Convierte a mayusculas.
		
		System.out.println(cadena.toLowerCase());
		System.out.println(cadena.toUpperCase());
		
		// .toString - Nos devuelve una subcadena de la cadena original.
		System.out.println(cadena.substring(4));
		System.out.println(cadena.substring(4, 20 + 1));
		
		// .equals() - Compara y devuelve un valor booleano, si las cadenas de texto u objetos son iguales.
		System.out.println(cadena.contentEquals("hoy es 30 de julio de 2024"));
		
		// .equalsIgnoreCase() -Comparar dos cadenas de texto no importando el uso de mayusculas o minusculas.
		System.out.println(cadena.equalsIgnoreCase("hoy es 30 de julio de 2024"));
		
		// .replace() - Remplaza la aparicion de un caracter con otros que necesitemos remplazar.
		System.out.println(cadena.replace("2024", "2025"));
		System.out.println(cadena.replace("0", "$"));
		System.out.println(cadena.replace(" ", "-"));
		System.out.println(cadena.replace(" ", ""));
		
		
		
		
		
		

	}

}
