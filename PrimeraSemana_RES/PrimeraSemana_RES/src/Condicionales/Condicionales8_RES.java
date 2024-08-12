package Condicionales;

import java.util.Scanner;

public class Condicionales8_RES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int dia;
		 String mensaje="";
		 Scanner lectura= new Scanner(System.in);
		 System.out.println("Programa que determina ¡El día de la semana dado un número entre 1 y 7.");
		 System.out.println("Escribe el día de la semana: ");
		 dia=lectura.nextInt();
		 lectura.close();
		 switch(dia)
		          {
		           case 1:mensaje="¡El número "+dia+" corresponde al día "+" Lunes!";
		                  break;
		           case 2:mensaje="¡El número "+dia+" corresponde al día "+" Martes!";
		                  break;
		           case 3:mensaje="¡El número "+dia+" corresponde al día "+" Miércoles!";
		                  break;
		           case 4:mensaje="¡El número "+dia+" corresponde al día "+" Jueves!";
		                  break;
		           case 5:mensaje="¡El número "+dia+" corresponde al día "+" Viernes!";
		           		  break;
		           case 6:mensaje="¡El número "+dia+" corresponde al día "+" Sábado! ";
	                      break;
		           case 7:mensaje="¡El número "+dia+" corresponde al día "+" Domingo! ";
		                  break;
		          default:mensaje="¡ERROR:Número incorrecto!";
		                  break;
		          }
		 System.out.println(mensaje);

	}

}
