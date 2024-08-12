package condicionales;

import java.util.Scanner;

public class condicionales3_IRF {
	public static void main(String[] args) {
		
		int resultadoDiv; 
		
		// created scan obj 
		Scanner Scan = new Scanner(System.in); 
		
		// Ingresa 2 numeros 
		System.out.println("Ingresa 2 numeros para divirlos");
		System.out.println("Ingresa un numero");
		int num1 = Scan.nextInt(); 
		
		System.out.println("Ingresa otro numero");
		int num2 = Scan.nextInt(); 
		
		if (num2 == 0) {
			
			System.out.println("Ingrese un numero correcto, 0 es invalido");
			
		}else {
			
			resultadoDiv = num1 / num2; 
			System.out.println("El resultado es de la division es:");
			System.out.println(resultadoDiv);
			
		}
		
		

	}

}
