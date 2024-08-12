
// Programa un algoritmo que realice la tabla de multiplicar de un numero
//introducido desde teclado, hasta la iteración deseada por el usuario.
//Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???

package ciclos;
import java.util.Scanner;

public class ciclos2_IRF {
	
	public static void main(String []args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingresa un numero a multiplicar");
		int multiNumber = scan.nextInt(); 
		
		System.out.println("Ingresa hasta que numero se va a a iterar");
		int limit = scan.nextInt(); 
		
		for (int i = 0; i<=limit; i++)
		{
			int r = multiNumber * i; 
			System.out.println(multiNumber + "x" + i + " = " + r);
		}
		
		
	}

}
