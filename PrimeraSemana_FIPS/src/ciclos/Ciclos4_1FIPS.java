package ciclos;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Ciclos4_1FIPS {

	public static void main(String[] args) {
		// Simular el comportamiento de un reloj digital, imprimiendo la hora, 
		//minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59 
		//horas
		
		int horas,minutos,segundos;
		System.out.println("Programa que simula un reloj digital");
		horas=minutos=segundos=0;
		System.out.println("¡Presione cualquier tecla para empezar!: ");
		Scanner lectura= new Scanner(System.in);
		lectura.nextLine();
		lectura.close();
		try
		{
		for(horas=0;horas<24;horas++)
			for(minutos=0;minutos<60;minutos++)
				for(segundos=0;segundos<60;segundos++)
				   {
					if(horas<10)
					  System.out.print("0"+horas+":");
					else
						System.out.print(horas+":");
					if(minutos<10)
					  System.out.print("0"+minutos+":");
					else
						System.out.print(minutos+":");
					if(segundos<10)
					  System.out.print("0"+segundos);
					else
					    System.out.print(segundos);
					System.out.println("");
					TimeUnit.SECONDS.sleep(1);
										}
		}
		catch (Exception e)
		{
		 System.out.println(e);	
		}

	}

}
