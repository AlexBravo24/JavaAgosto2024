package condicionales;
import java.util.Scanner;

public class condicionales1_IRF {
	
	public static void main(String[] args) {
		
		Scanner Scan = new Scanner(System.in); 
		
		System.out.println("Ingresa un numero:");
		int num1 = Scan.nextInt(); 
		
		System.out.println("Ingresa un segundo numero");
		int num2 = Scan.nextInt();
		
		if(num1 > num2) {
			
			System.out.println("El numero mayor es: " + num1);
		}
		else {
			System.out.println("El numero mayor es: " + num2);
		}
		
		
	}

}
