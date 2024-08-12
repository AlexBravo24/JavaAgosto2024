package condicionales;

import java.util.Scanner;

public class condicionales5_IRF {
	public static void main(String[]args) {
		
		Scanner Scan = new Scanner(System.in); 
		
		int nota; 
		int edad;
		String sexo; 
		
		System.out.println("Ingrese su sexo");
		System.out.println("Masculino M:");
		System.out.println("Femenino F:");
		
		sexo = Scan.nextLine(); 
		
		System.out.println("Ingrese su edad:");
		edad = Scan.nextInt();
		
		System.out.println("Ingrese su nota:");
		nota = Scan.nextInt();
		
		if((edad >= 18 && nota > 5)) {
			System.out.println("ACEPTADA");
		}
		else {
			
			System.out.println("NO ACEPTADA");
		}
		
 
		
		
		
		
	}

}
