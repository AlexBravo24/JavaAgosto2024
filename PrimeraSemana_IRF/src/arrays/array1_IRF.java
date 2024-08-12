package arrays;

import java.util.Scanner;

public class array1_IRF {

	public static void main(String[] args) {
		
		// muestra el un numero por consola en base a su indice 
		
		int[] arrInt = {0,1,2,3,4,5,6,7,8,9,10}; 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("solicita un numero del  0 al 10");
		int input = scan.nextInt(); 
		System.out.println(arrInt[input]);

	}

}
