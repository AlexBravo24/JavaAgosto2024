package Condicionales;

import java.util.Scanner;

public class Condicionales7_RES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cara;
		Scanner lectura=new Scanner(System.in);
		System.out.println("Programa que determina La cara opuesta de  un dado ingresando el número de la cara");
		System.out.println("Ingrese la cara del dado:");
		cara=lectura.nextInt();
		lectura.close();
		switch (cara) {
		case 1:System.out.println("La cara opuesta de "+cara+" es 6");
		       break;
		case 2:System.out.println("La cara opuesta de "+cara+" es 5");
	       break;
		case 3:System.out.println("La cara opuesta de "+cara+" es 4");
	       break;
		case 4:System.out.println("La cara opuesta de "+cara+" es 3");
	       break;
		case 5:System.out.println("La cara opuesta de "+cara+" es 2");
	       break;
		case 6:System.out.println("La cara opuesta de "+cara+" es 1");
	       break;
	       
			
	default:System.out.println("ERROR:número incorrecto");
			break;
		}

	}

}
