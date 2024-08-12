package com.condicionales;

import java.util.Scanner;

public class Condicionales6_PSFI {

	public static void main(String[] args) {
		
//		El director de una escuela est� organizando un viaje de estudios y requiere 
//		determinar cu�nto debe cobrar a cada alumno y cu�nto debe pagar a la 
//		compa��a de viajes por el servicio. La forma de cobrar es la siguiente: * Si son 
//		100 alumnos o m�s, el costo por cada alumno es de 65 euros. * De 50 a 99 
//		alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95 
//		euros. * Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 
//		euros, sin importar el n�mero de alumnos. Realiza un algoritmo que permita 
//		determinar el pago a la compa��a de autobuses y lo que debe pagar cada 
//		alumno por el viaje
		 Scanner entrada = new Scanner(System.in);

	        // Solicitar el n�mero de alumnos
	        System.out.println("Ingresa el n�mero de alumnos que asistir�n al viaje: ");
	        int numAlumnos = entrada.nextInt();

	        // Variables para almacenar el costo por alumno y el pago total a la compa��a de autobuses
	        int costoPorAlumno = 0;
	        int pagoTotal = 0;

	        // Determinar el costo seg�n el n�mero de alumnos
	        if (numAlumnos >= 100) {
	            costoPorAlumno = 65;
	            pagoTotal = numAlumnos * costoPorAlumno;
	        } else if (numAlumnos >= 50) {
	            costoPorAlumno = 70;
	            pagoTotal = numAlumnos * costoPorAlumno;
	        } else if (numAlumnos >= 30) {
	            costoPorAlumno = 95;
	            pagoTotal = numAlumnos * costoPorAlumno;
	        } else {
	            pagoTotal = 4000;
	            costoPorAlumno = (pagoTotal / numAlumnos);
	        }

	        // Mostrar el resultado
	        System.out.println("El costo por alumno es de: " + costoPorAlumno + " euros.");
	        System.out.println("El pago total a la compa��a de autobuses es de: " + pagoTotal + " euros.");
	    }
	}