package condicionales;

import java.util.Scanner;

public class condicionales7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//                   0      1     2      3        4       5*
		String[] arrDados = {"Uno","Dos","Tres","Cuatro","Cinco","Seis"}; 
		
		System.out.println("lanza un dado y ingresa el numero resultante");
		Scanner scan = new Scanner(System.in); 
		
		int numDado = scan.nextInt(); 
		
		if(numDado <= 0 || numDado > 6)
		{
			System.out.println("numero ingresado incorrecto");
		}
		else {
			switch (numDado) {

			  case 1:
				  System.out.println(arrDados[5]);
			    break;
			  
			  case 2:
				  System.out.println(arrDados[4]);
			    break;
			    
			  case 3:
				  System.out.println(arrDados[3]);
				break;
				
			  case 4:
				  System.out.println(arrDados[2]);
				break;
				
			  case 5:
				  System.out.println(arrDados[1]);
				break;
				
			  case 6:
				  System.out.println(arrDados[0]);
				break;
			}
			
			
		}
		

	}
		


}
