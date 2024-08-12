package condicionales;
import java.util.Scanner;

public class condicionales4_IRF {
	
	public static void main(String[] args) {
		
		// este programa determina si una cadena de texto
		//contiene letras mayusculas 
		
		// created scan obj 
		Scanner Scan = new Scanner(System.in); 
		
		System.out.println("Ingresa un texto");
		String textLine = Scan.nextLine(); 
		
		System.out.println(textLine);
		boolean noUpper = true; 
		
		for (int i = 0; i < textLine.length(); i++) {
			
			char caracter = textLine.charAt(i); 

			System.out.println(caracter);
			
			if(Character.isUpperCase(caracter)) {
				
				System.out.println("contiene mayusculas");
				noUpper = false; 
				break; 
			}
			
		}
		
		if(noUpper) {
			
			System.out.println("no contiene mayusculas");
		}
		

		

		
		
	}

}
