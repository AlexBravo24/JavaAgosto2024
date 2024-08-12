package condicionales;

import java.util.Scanner;

public class condicinales6_IRF {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * . La forma de cobrar es la siguiente: * Si son 	
			100 alumnos o más, el costo por cada alumno es de 65 euros
			
			50 a 99 alumnos el costo es de 70
			
			de 30 a 49 alumnos el costo es de 95
			
			menos de 30 la renta del autobis de 4000
			
			 */
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Ingrese la cantidad de alumnos que realizaran el viaje");
		int numeroAlumnos = scan.nextInt(); 
		
		if(numeroAlumnos>=100) {
			System.out.println("el costo por alumno es de 65");
		}
		else if (numeroAlumnos >= 50) {
			System.out.println("el costo es de 70 euros");
		}
		else if (numeroAlumnos>= 30) {
			System.out.println("el costo es de 95 euros");
		}
		else{
			System.out.println("el costo por alumno es de 133 euros");
		}

	}

}
