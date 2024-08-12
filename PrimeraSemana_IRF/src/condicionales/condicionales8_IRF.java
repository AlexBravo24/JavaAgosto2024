package condicionales;

import java.util.Scanner;

public class condicionales8_IRF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ESTE PROGRAMA PIDE UN NUMERO
		// ESE NUMERO REPRESENTA EL DIA DE LA SEMANA Y SE IMPREME EN CONSOLA 
		
		// Lunes, martes, miércoles, jueves, viernes, sábado y domingo
		
		
		String[] arrDias = {"Lunes","martes","miércoles",
				"jueves","viernes","sabado","domingo"}; 
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.println("Ingresa un numero del 1 al 7");
		
		int diaNumero = scan.nextInt(); 
		if(diaNumero>7 || diaNumero<=0){
			
			System.out.println("Ingresa un un numero correcto");
		}
		else {
			System.out.println("el dia de la semana es:");
			System.out.println(arrDias[diaNumero - 1]);
		}
		

	}

}
