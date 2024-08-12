package com;

import java.util.Scanner;

public class CalculadoraCientifica_RES extends Calculadora_RES implements ITermometro{
    
			private static final String bienvenida="¡Hola!\n¡Está es una calculadora científica!\nMenú de opciones:";
	         private static final String menu="1.- Suma de dos números.\n2.-Suma de tres números\n3.-Resta de dos números.\n4.-Multiplicación.\n5.-División.\n6.-Exponenciación.\n7.-Raíz Cuadrada.\n8.-Tomar temperatura.\nElige la operación a realizar: ";
	         private String color;
	         private String size;
	         private String resultado;
	         private double x;
	         public CalculadoraCientifica_RES() {}
 			 public String getResultado() {
				return resultado;
			}
			public void setResultado(String resultado) {
				this.resultado = resultado;
			}
			public double getX() {
				return x;
			}
			public void setX(double x) {
				this.x = x;
			}
			public CalculadoraCientifica_RES(double a, double b, double c, double r, String color, String size,String resultado) {
				super(a, b, c, r);
				this.color = color;
				this.size = size;
				this.resultado =resultado;
			}
 			public String getColor() {
 				return color;
 			}
 			public void setColor(String color) {
 				this.color = color;
 			}
 			public String getSize() {
 				return size;
 			}
 			public void setSize(String size) {
 				this.size = size;
 			}
 			public String getBienvenida() {
 				return bienvenida;
 			}
 			public String getMenu() {
 				return menu;
 			}
			public void suma(double a, double b) {
				 String resultado;
				 r=a+b;
 				 resultado=Double.toString(r);
 				 System.out.println(a+" + "+b+" = "+resultado);
 			 }
 			 public void suma(double a, double b, double c) {
 				 r=a+b+c;
 				 resultado=Double.toString(r);
 				 System.out.println(a+" + "+b+" + "+c+" = "+resultado);
 			 }
             public void resta(double a,double b) {
            	 r=a-b;
            	 resultado=Double.toString(r);
            	 System.out.println(a+" - "+b+" = "+resultado);
             }
             public void multiplicacion(double a, double b) {
            	 r=a*b;
            	 resultado=Double.toString(r);
            	 System.out.println(a+" * "+b+" = "+resultado);
             }
             public void division(double a, double b) {
            	 if(b!=0)
            	 {	 
            	   r=a/b;
            	   resultado=Double.toString(r);
            	 }
            	 else
            		 resultado="¡Error!\n¡Intentaste dividir por cero :(!";
             System.out.println(a+" / "+b+" = "+resultado);
            }
            public void exponenciacion(double a, double b) {
            	
            	r=(double) Math.pow(a, b);
            	resultado=Double.toString(r);
            	System.out.println(a+" ^ "+b+" = "+resultado);
            }
            public void raizCuadrada(double a) {
            	r=Math.sqrt(a);
            	resultado =Double.toString(r);
            	System.out.println("La raíz cuadrada de "+a+" = "+resultado);
            }
			@Override
			public void tomarTemperatura(double temperatura) {
				// TODO Auto-generated method stub
				if(temperatura>=36&&temperatura<40)
				  System.out.println("Temperatura correcta");
				else
					if(temperatura>=40)
					  System.out.println("¡Tienes fiebre :( !\n¡Acude lo antes posible al médico!");
					else
						System.out.println("¡Tienes hipotermia :(!\n¡Acude lo antes posible al médico!");
				
			}
			public double mensaje (String m) {
				          double x;
				          Scanner a = new Scanner (System.in);
				          System.out.println(m);
				          x=a.nextDouble();
				          a.close();
				          return x;
				         
			}
			public CalculadoraCientifica_RES(String color, String size, String resultado, double x) {
				super();
				this.color = color;
				this.size = size;
				this.resultado = resultado;
				this.x = x;
			}
			              
            
                          
             
}
