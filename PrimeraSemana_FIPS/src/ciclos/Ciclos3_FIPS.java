package ciclos;

import java.util.Scanner;

public class Ciclos3_FIPS {

	public static void main(String[] args) {
		// Realiza un programa para determinar si un String es pal�ndromo

		 Scanner entrada = new Scanner(System.in);

	        // Solicitar al usuario que ingrese una cadena
	        System.out.println("Ingresa una cadena de texto: ");
	        String cadena = entrada.nextLine();

	        // Llamar al m�todo que verifica si la cadena es un pal�ndromo
	        if (esPalindromo(cadena)) {
	            System.out.println("La cadena es un pal�ndromo.");
	        } else {
	            System.out.println("La cadena no es un pal�ndromo.");
	        }
	    }

	    // M�todo para verificar si una cadena es un pal�ndromo
	    public static boolean esPalindromo(String cadena) {
	        // Convertir la cadena a min�sculas para evitar problemas con may�sculas
	        cadena = cadena.toLowerCase();
	        
	        // Eliminar espacios y caracteres no alfab�ticos (opcional, seg�n el caso de uso)
	        cadena = cadena.replaceAll("[^a-zA-Z]", "");
	        
	        // Crear una cadena invertida
	        String cadenaInvertida = new StringBuilder(cadena).reverse().toString();
	        
	        // Comparar la cadena original con la cadena invertida
	        return cadena.equals(cadenaInvertida);
	    }
	}