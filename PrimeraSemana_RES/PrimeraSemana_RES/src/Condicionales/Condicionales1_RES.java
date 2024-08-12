package Condicionales;

import java.util.Scanner;

public class Condicionales1_RES {
	public static void main(String[] args) {
        int a,b;
        System.out.println("Introduce el primer número: ");
        Scanner lectura = new Scanner(System.in);
        a=lectura.nextInt();
        System.out.println("Introduce el segundo número: ");
        b=lectura.nextInt();
        lectura.close();
        if(a<b)
          {
           System.out.println("¡"+b+" es el número mayor !");	
          }
        else
        {
        if(a>b)
        {
         System.out.println("¡ "+a+" es el número mayor !");	
        }
        else
        {
         System.out.println("¡ Ambos números son iguales !");	
        }
        }
	}

}
