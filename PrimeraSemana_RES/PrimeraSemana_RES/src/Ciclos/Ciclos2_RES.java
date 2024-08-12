package Ciclos;

import java.util.Scanner;

public class Ciclos2_RES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	long multiplicando,multiplicador;	
	Scanner lectura=new Scanner(System.in);
	System.out.println("Escribe el número a obtener su tabla: ");
	multiplicando=lectura.nextLong();
	System.out.println("Escribe la cantidad de veces que deseas que se genere la tabla de multiplicar de "+multiplicando+" : ");
    multiplicador=lectura.nextLong();
    System.out.println("La tabla de multiplicar es: ");
    lectura.close();
    for (long i = 1; i <=multiplicador ; i++)
    	System.out.println(multiplicando+"*"+i+"="+multiplicando*i);
	}

}
