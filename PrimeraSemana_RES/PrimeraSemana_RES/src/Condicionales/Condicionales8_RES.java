package Condicionales;

import java.util.Scanner;

public class Condicionales8_RES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int dia;
		 String mensaje="";
		 Scanner lectura= new Scanner(System.in);
		 System.out.println("Programa que determina �El d�a de la semana dado un n�mero entre 1 y 7.");
		 System.out.println("Escribe el d�a de la semana: ");
		 dia=lectura.nextInt();
		 lectura.close();
		 switch(dia)
		          {
		           case 1:mensaje="�El n�mero "+dia+" corresponde al d�a "+" Lunes!";
		                  break;
		           case 2:mensaje="�El n�mero "+dia+" corresponde al d�a "+" Martes!";
		                  break;
		           case 3:mensaje="�El n�mero "+dia+" corresponde al d�a "+" Mi�rcoles!";
		                  break;
		           case 4:mensaje="�El n�mero "+dia+" corresponde al d�a "+" Jueves!";
		                  break;
		           case 5:mensaje="�El n�mero "+dia+" corresponde al d�a "+" Viernes!";
		           		  break;
		           case 6:mensaje="�El n�mero "+dia+" corresponde al d�a "+" S�bado! ";
	                      break;
		           case 7:mensaje="�El n�mero "+dia+" corresponde al d�a "+" Domingo! ";
		                  break;
		          default:mensaje="�ERROR:N�mero incorrecto!";
		                  break;
		          }
		 System.out.println(mensaje);

	}

}
