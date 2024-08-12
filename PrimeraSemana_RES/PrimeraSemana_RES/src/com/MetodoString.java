package com;

public class MetodoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String cadena= "Hoy es 30 de Julio de 2024";
        /*El m�todo .length nos devuelve en valor num�rico entero
          la longitud de una cadena de texto*/
        System.out.println(cadena.length());
        /*
         Con el m�todo .chartAt() podemos acceder al caracter solicitado en el 
         �ndice o posici�n*/
        System.out.println(cadena.charAt(2));
        System.out.println(cadena.charAt(25));
        System.out.println(cadena.charAt(cadena.length()-1));
        /*El m�todo .toLowerCase convierte a min�sculas una cadena de texto
         *El m�todo .toUpperCase convierte a may�sculas convierte una cadena de texto
         */
        System.out.println(cadena.toLowerCase());
        System.out.println(cadena.toUpperCase());
        /*El m�todo subString nos devuelve una subcadena de la cadena original 
         */
        System.out.println(cadena.substring(4));
        //El m�todo substring tiene polimorfismo y admite dos par�metros (inicio, fin)
        System.out.println(cadena.substring(4, 20+1));
        //El m�todo .equals devuelve un valor boleano
        //indicando si las cadenas son iguales o diferentes.
        System.out.println(cadena.contentEquals("hoy es 30 de julio de 2024"));
        //El m�todo .equalsIgnoreCase compara dos cadenas de texto
        //sin importar el uso de may�sculas y min�sculas.
        System.out.println(cadena.equalsIgnoreCase("hoy es 30 de julio de 2024"));
        // El m�todo .replace reemplaza la aparici�n de un caracter o caracteres
        //con otros que necesitemos reemplazar
        System.out.println(cadena.replace("2024", "2025"));
        System.out.println(cadena.replace("o","$"));
        System.out.println(cadena.replace(" ", ""));
	    }
	}

