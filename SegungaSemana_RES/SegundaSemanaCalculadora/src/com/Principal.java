package com;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
	public static double mensaje(String m) {
		          double dato=0.0;
		          // System.out.println("Entrada recibida: " + input);
		          Scanner scanner=new Scanner(System.in);
                  while(true) {
		          try {
		        	   System.out.print(m);
			          String input = scanner.nextLine();
			          dato = Double.parseDouble(input.trim());
		              //   System.out.println("Número introducido: " + dato);
			          break;
		          } catch (NumberFormatException e) {
		              System.out.println("Error: Por favor, introduce un número decimal válido.");
		          }
                  }
		         // scanner.close();
		          return dato;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	double a,b,c;
	char op;
	int opcion;
    Scanner lector=new Scanner(System.in);
    CalculadoraCientifica_RES calculadoraCientifica = new CalculadoraCientifica_RES();;
    do
      {	
       System.out.println(calculadoraCientifica.getBienvenida());
       System.out.println(calculadoraCientifica.getMenu());
       opcion=lector.nextInt();
       switch(opcion) {
       case 1:
    	        a=mensaje("Escriba el primer sumando: ");
			    b=mensaje("Escriba el segundo sumando: ");
			    calculadoraCientifica.suma(a,b);
    	        break;
       case 2:a=mensaje("Escriba el primer sumando: ");
		        b=mensaje("Escriba el segundo sumando: ");
		        c=mensaje("Escriba el tercer sumando: ");
		        calculadoraCientifica.suma(a,b,c);
                break;
       case 3:a=mensaje("Escriba el número a restar: ");
  	            b=mensaje("Escriba el sustractor: ");
    	        calculadoraCientifica.resta(a, b);
                break;
       case 4:a=mensaje("Escriba el multiplicando: ");
       			b=mensaje("Escriba el multiplicador: ");
       			calculadoraCientifica.multiplicacion(a, b);
                break;
       case 5:a=mensaje("Escriba el dividendo: ");
  	            b=mensaje("Escriba el divisor: ");
  	            calculadoraCientifica.division(a,b);
				break;
       case 6:a=mensaje("Escriba la base: ");
   				b=mensaje("Escriba la potencia: ");
   				calculadoraCientifica.exponenciacion(a, b);
				break;
       case 7:a=mensaje("Escriba el radicando: ");
                calculadoraCientifica.raizCuadrada(a);
				break;
       case 8:a=mensaje("Introduce tu temperatura: ");
                calculadoraCientifica.tomarTemperatura(a);
                break;
	  default: System.out.println("Operación inválida");
	           break;
       }
       System.out.println("Presione cualquier tecla para continuar: ");
       lector.nextLine();
     do
      {
       System.out.println("¿Deseas hacer otra operación (s/n)?: ");	
       op=lector.nextLine().charAt(0);
          }
      while(op!='s'&&op!='n'&&op!='S'&&op!='N');
	  }
    while(op!='n'&&op!='N');
    lector.close();
	}
}
