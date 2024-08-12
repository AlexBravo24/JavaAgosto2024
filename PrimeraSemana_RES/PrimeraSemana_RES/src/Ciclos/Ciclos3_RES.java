package Ciclos;

import java.util.Scanner;

public class Ciclos3_RES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena="";
		int adelante,atras,bandera=0;
		Scanner lectura = new Scanner(System.in);
		System.out.println("Programa que analiza si una frase es palíndrome");
		System.out.println("Escribe la frase a analizar:");
		cadena=lectura.nextLine();
		adelante=0;
		atras=cadena.length()-1;
		lectura.close();
		do
		{
		 if(cadena.charAt(adelante)==' ')
		   adelante++;
		 if(cadena.charAt(atras)==' ')
		   atras--;
		 if(cadena.charAt(adelante)==cadena.charAt(atras))
			bandera=0;
		 else
			 bandera=1;
		 adelante++;
		 atras--;
		}
		while(adelante<atras);
		if(bandera==0)
	      System.out.println("¡La frase '"+cadena+"' es palíndrome :)!");
	    else
	    	System.out.println("¡La frase '"+cadena+"' no es palíndrome :( !");

	}

}
