package ciclos;

import java.util.Scanner;

public class Ciclos3_AGPR {

	public static void main(String[] args) {
		// 3. Realiza un programa para determinar si un String es pal�ndromo.
		 Scanner scanner = new Scanner(System.in);

	        // Pedir al usuario que ingrese un texto
	        System.out.println("Ingresa una cadena de texto para verificar si es un pal�ndromo:");
	        String texto = scanner.nextLine();
	        
	        // Cerrar el scanner
	        scanner.close();
	        
	        // Verificar si el texto ingresado es un pal�ndromo
	        if (esPalindromo(texto)) {
	            System.out.println("\"" + texto + "\" es un pal�ndromo.");
	        } else {
	            System.out.println("\"" + texto + "\" no es un pal�ndromo.");
	        }
	    }

	    // M�todo para determinar si una cadena es un pal�ndromo
	    public static boolean esPalindromo(String texto) {
	        // Limpiar la cadena: eliminar espacios, convertir a min�sculas y eliminar caracteres no alfab�ticos
	        String cadenaLimpia = "";
	        for (int i = 0; i < texto.length(); i++) {
	            char c = texto.charAt(i);
	            if (Character.isLetter(c)) {
	                cadenaLimpia += Character.toLowerCase(c);
	            }
	        }
	        
	        // Comprobar si la cadena limpia es un pal�ndromo
	        int longitud = cadenaLimpia.length();
	        for (int i = 0; i < longitud / 2; i++) {
	            if (cadenaLimpia.charAt(i) != cadenaLimpia.charAt(longitud - 1 - i)) {
	                return false; // No es un pal�ndromo
	            }
	        }
	        return true; // Es un pal�ndromo
	    }
	}