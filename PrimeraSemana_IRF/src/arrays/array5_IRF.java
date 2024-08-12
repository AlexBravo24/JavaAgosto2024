package arrays;

import java.util.Scanner;

public class array5_IRF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingresa la cantidad de productos a registar");
		
		// 
		int sizeArr = scan.nextInt(); 
		scan.nextLine(); 			// consumir caracter restante /n
		
		int[] arrPrecios = new int[sizeArr]; 
		String[] strnameProducts = new String[sizeArr];
		
		// obtiene los parametros de los arrays 
		for (int i = 0; i<sizeArr; i++) {
			
			System.out.println("Ingresa nombre del producto");
			strnameProducts[i] = scan.nextLine();
			
			System.out.println("Ingresa precio del producto");
			arrPrecios[i] = scan.nextInt();
			scan.nextLine();
			
		}
		
		// muestra todos los valores en consola 
		for (int i = 0; i<sizeArr; i++) {
			
			System.out.println(strnameProducts[i] + ": " + arrPrecios[i] );
			
		}
		

	}

}
