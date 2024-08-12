package arrays;

import java.util.Scanner;

public class array3__IRF {

	public static void main(String[] args) {

		
		// obtiene un string desde consola 
		Scanner scan = new Scanner(System.in);
		System.out.println("ingresa una frase");
		String inputString = scan.nextLine();
		

		// created new arr 
		String[] arrString = new String[inputString.length()]; 
		
		for (int i = 0; i<inputString.length();i++) {
			

			char caracter = inputString.charAt(i); 
			arrString[i] = String.valueOf(caracter);; 
			System.out.println(arrString[i]);
			
		}
		
		System.out.println();

	}

}
