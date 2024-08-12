package ciclos;

import java.util.Scanner;

public class Ciclos3_FIPS {

	public static void main(String[] args) {
		// Realiza un programa para determinar si un String es palíndromo

		 Scanner entrada = new Scanner(System.in);

	        // Solicitar al usuario que ingrese una cadena
	        System.out.println("Ingresa una cadena de texto: ");
	        String cadena = entrada.nextLine();

	        // Llamar al método que verifica si la cadena es un palíndromo
	        if (esPalindromo(cadena)) {
	            System.out.println("La cadena es un palíndromo.");
	        } else {
	            System.out.println("La cadena no es un palíndromo.");
	        }
	    }

	    // Método para verificar si una cadena es un palíndromo
	    public static boolean esPalindromo(String cadena) {
	        // Convertir la cadena a minúsculas para evitar problemas con mayúsculas
	        cadena = cadena.toLowerCase();
	        
	        // Eliminar espacios y caracteres no alfabéticos (opcional, según el caso de uso)
	        cadena = cadena.replaceAll("[^a-zA-Z]", "");
	        
	        // Crear una cadena invertida
	        String cadenaInvertida = new StringBuilder(cadena).reverse().toString();
	        
	        // Comparar la cadena original con la cadena invertida
	        return cadena.equals(cadenaInvertida);
	    }
	}