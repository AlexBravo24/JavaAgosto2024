package Condicionales;

import java.util.Scanner;

public class Condicionales1_RES {
	public static void main(String[] args) {
        int a,b;
        System.out.println("Introduce el primer n�mero: ");
        Scanner lectura = new Scanner(System.in);
        a=lectura.nextInt();
        System.out.println("Introduce el segundo n�mero: ");
        b=lectura.nextInt();
        lectura.close();
        if(a<b)
          {
           System.out.println("�"+b+" es el n�mero mayor !");	
          }
        else
        {
        if(a>b)
        {
         System.out.println("� "+a+" es el n�mero mayor !");	
        }
        else
        {
         System.out.println("� Ambos n�meros son iguales !");	
        }
        }
	}

}
