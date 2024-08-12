package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

	
	Cientifica calc1 = new Cientifica();
	
	calc1.sumar(1, 2);
	
	calc1.dividir(3, 1);
	
	calc1.setColor("Negra");
	
	System.out.println(calc1);
	
	Cientifica calc2=new Cientifica();
	calc2.setMarca("Casio");
	calc2.setColor("negro");
	
	System.out.println(calc2);
	

     Cientifica calc3 = new Cientifica();

     System.out.print("Ingrese primer número para sumar: ");
     int num1 = scanner.nextInt();
     System.out.print("Ingrese segundo número para sumar: ");
     int num2 = scanner.nextInt();
     calc3.sumar(num1, num2);
     // Similar para restar, multiplicar y dividir
     scanner.close();
     
     calc3.TomarTemperatura();
     calc3.Volar();
     
     //¿Existe la multiherencia en Java?
     //R: NO
     //Se puede simular mediante el uso de interfases
     
     //¿De donde toman comportamiento los objetos?
     //1. de las clases, de métodos propios
     //2. De otras clases con la herencia, incluyendo clases
     //abstractas
     //3. De interfases
		
	}
}