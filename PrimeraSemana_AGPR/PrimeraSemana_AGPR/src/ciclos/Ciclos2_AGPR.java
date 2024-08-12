package ciclos;

import java.util.Scanner;

public class Ciclos2_AGPR {

	public static void main(String[] args) {
		/*2.- Programa un algoritmo que realice la tabla de multiplicar de un numero
		introducido desde teclado, hasta la iteración deseada por el usuario.
		Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ??? */
		
		Scanner entrada= new Scanner (System.in);
		int numero, iteracion, mult=1;
		
		System.out.println("Digite el numero que desea multiplicar");
		numero=entrada.nextInt();
		System.out.println("Digite el numero de iteraciones");
		iteracion=entrada.nextInt();
		
		for (int i = 0; i <= iteracion; i++) {
			mult=numero*i;
			System.out.println(mult);	
		}	
	}
}
