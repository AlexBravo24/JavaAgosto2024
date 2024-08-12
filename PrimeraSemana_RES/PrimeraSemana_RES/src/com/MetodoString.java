package com;

public class MetodoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String cadena= "Hoy es 30 de Julio de 2024";
        /*El método .length nos devuelve en valor numérico entero
          la longitud de una cadena de texto*/
        System.out.println(cadena.length());
        /*
         Con el método .chartAt() podemos acceder al caracter solicitado en el 
         índice o posición*/
        System.out.println(cadena.charAt(2));
        System.out.println(cadena.charAt(25));
        System.out.println(cadena.charAt(cadena.length()-1));
        /*El método .toLowerCase convierte a minúsculas una cadena de texto
         *El método .toUpperCase convierte a mayúsculas convierte una cadena de texto
         */
        System.out.println(cadena.toLowerCase());
        System.out.println(cadena.toUpperCase());
        /*El método subString nos devuelve una subcadena de la cadena original 
         */
        System.out.println(cadena.substring(4));
        //El método substring tiene polimorfismo y admite dos parámetros (inicio, fin)
        System.out.println(cadena.substring(4, 20+1));
        //El método .equals devuelve un valor boleano
        //indicando si las cadenas son iguales o diferentes.
        System.out.println(cadena.contentEquals("hoy es 30 de julio de 2024"));
        //El método .equalsIgnoreCase compara dos cadenas de texto
        //sin importar el uso de mayúsculas y minúsculas.
        System.out.println(cadena.equalsIgnoreCase("hoy es 30 de julio de 2024"));
        // El método .replace reemplaza la aparición de un caracter o caracteres
        //con otros que necesitemos reemplazar
        System.out.println(cadena.replace("2024", "2025"));
        System.out.println(cadena.replace("o","$"));
        System.out.println(cadena.replace(" ", ""));
	    }
	}

