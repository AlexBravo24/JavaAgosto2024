package condicionales;
import java.util.Scanner;

public class condicionales2_IRF {
	
	
	public static void main(String[] args){
		
		// este programa determina si un numero es par o impar 
		
		Scanner Scan = new Scanner(System.in); 
		System.out.println("determina si es par o impar");
		System.out.println("Ingresa un numero:");
		int num1 = Scan.nextInt(); 
		
		if (num1 % 2 == 0) {
			
			System.out.println("el numero es par:	" + num1);
		}
		else {
			System.out.println("el numero es impar:	" + num1);
		}
		
		
	}


}
