package Condicionales;

import java.util.Scanner;

public class Condicionales3_RES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b;
		float c;
		Scanner lectura = new Scanner(System.in);
        System.out.println("Programa que devuelve la divisi�n de dos n�meros");
        System.out.println("Ingresa el primer n�mero por favor :): ");
        a=lectura.nextFloat();
        System.out.println("Ingresa el segundo n�mero por favor :): ");
        b=lectura.nextFloat();
        lectura.close();
        if(b!=0)
          {
           c=a/b;
           System.out.print(a + " / "+b+" = "+c);
           }
        else
        {
         System.out.println("�Error, no es posible la divisi�n por cero!"); 	
        }

	}

}
