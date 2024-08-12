package Condicionales;

import java.util.Scanner;

public class Condicionales6_RES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        float alumnos, pasajePorAlumno=0;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Programa que decide cuánto debe pagar un alumno para un viaje organizado por el director.");
        System.out.println("Ingresa la cantidad de alumnos: ");
        alumnos=lectura.nextFloat();
        lectura.close();
        if(alumnos<=30)
          pasajePorAlumno=4000/alumnos;
        else
        {
         if(alumnos>=100)
        	pasajePorAlumno=65;
         else
         {
        	 if(alumnos>49&&alumnos<100)
        		 pasajePorAlumno=80;
        	 }
         }
        System.out.println("¡Cada alumno deberá pagar: "+pasajePorAlumno+" Euros!");
		}
        		
	}

