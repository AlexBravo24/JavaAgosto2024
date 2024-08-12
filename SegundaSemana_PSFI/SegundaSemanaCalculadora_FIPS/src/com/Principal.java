package com;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Creamos calculadora
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		Calculadora calculadora1 = new Cientifica ();
		System.out.println("Tu resultado de la suma es: "+ calculadora1.sumar(2, 3));
		
		System.out.println("Tu resultado de la resta es: "+ calculadora1.restar(10, 3));
		
		System.out.println("Tu resultado de la multiplicar es: "+ calculadora1.multiplicar(5, 5));
		
		System.out.println("Tu resultado de la dividir es: "+ calculadora1.dividir(15, 5));
		
		Cientifica casio = new Cientifica();
		casio.tomarTemperatura();
		
		//Si preguntan: ¿Existe la multiherencia en Java?
		//R:NOO
		//Se puede simular mediante el uso de una interfaz	
		//Ejemplos; si tenemos operaciones basicas, esas operaciones las puedo inplementar en una calculadora o en una persona
		//Si tuvieramos otros comportamientos.
		
		//DE DONDE TOMAR COMPORTAMIENTOS LOS OBJETOS??
		//1. De las clases, de metodos propios
		//2.  DE otras clases con la herencia incluyendo clases abstractas
		//3. De interfaces
		
		boolean bandera = true;
		
		while (bandera) {
			   System.out.println("Selecciona una operación:");
		       System.out.println("1. Sumar");
		       System.out.println("2. Restar");
		       System.out.println("3. Multiplicar");
		       System.out.println("4. Dividir");
		       System.out.println("5. Salir");
		   
		       int resultado = 0;
		       
		       int opcion = sc.nextInt();
		       if(opcion == 5) break;
		       int num1 = sc.nextInt();
		       int num2 = sc.nextInt();
		       
		       switch (opcion) {
	            case 1:
	                resultado = calculadora1.sumar(num1, num2);
	                break;
	            case 2:
	                resultado = calculadora1.restar(num1, num2);
	                break;
	            case 3:
	                resultado = calculadora1.multiplicar(num1, num2);
	                break;
	            case 4:
	                resultado = calculadora1.dividir(num1, num2);
	                break;
	            
	            case 5:
	            	bandera = false;
	            	break;
	            	
	            default:
	                System.out.println("Opción inválida.");
	                return;
	        }
	        
	        System.out.println("El resultado es: " + resultado);
		
		       
		}
		
		System.out.println("Adios");
		
		 

	}

}
 