package com;

public class MetodosString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Metodos o funcionalidad de la clase String
		
		//Cadena de ejemplo
		String cadena = "Hoy es 30 de julio de 2024";
		
		//.length()- nos devuelve el valor numérico entero
		//la longitud de una cadena de texto
		
		System.out.println(cadena.length());
		
		//con el método.length() podemos almacenar ese valor en una vriable
		// si lo necesitara ustilizar posteriormente
		int longitud = cadena.length();
		
		//.charAt()- nos devuelve el caracter solicitado de determinado
		//indica o posicion
		
		System.out.println(cadena.charAt(25)); //regresa la letra y que está en posicion 2
		// los espacios tambien cuentan como caracteres. La p
		
		System.out.println(cadena.toUpperCase());
		
		//.subString() -Nos devuelve una subcadena de la cadena
		System.out.println(cadena.substring(4));
		System.out.println(cadena.substring(4,20));
		
		
		//.equals()- Compara y devuelve un valor bolleano
		//si las cadenas de texo u objetos son iguales
		System.out.println(cadena.equals("hoy es 30 de julio de 2024"));
		
		//.equalsIgnoreCase- Comparar dos cadenas de texto
		//no importando el uso de mayusculas y minusculas
		System.out.println(cadena.equalsIgnoreCase("hoy es 30 de julio de 2024"));
		
		
		//.replace() - Reemplaza la aparicion de un caracter o secuencia de cadenas
		// con otros que necesitemos
		System.out.println(cadena.replace("2024", "2025"));
		System.out.println(cadena.replace(" ", "-"));
		System.out.println(cadena.replace(" ", ""));



	}

}
