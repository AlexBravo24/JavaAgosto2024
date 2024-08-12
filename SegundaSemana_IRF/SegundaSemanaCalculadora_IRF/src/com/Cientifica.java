package com;

import java.util.List;

public class Cientifica extends calculadora {
	 
	 

 public Cientifica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cientifica(String marca, String color, String modelo) {
		super(marca, color, modelo);
		// TODO Auto-generated constructor stub
	}

public float suma(int a , int b) {
	 System.out.println("Suma");
	 return a + b; 
 }


public float suma(List<Integer> lisInter) {
	 System.out.println("Suma");
	float r = 0; 
	
	for (Integer item : lisInter) {
		
		r = r + item; 
	}
	
	return r; 
}
 
 public float division(int a , int b) {
	 System.out.println("division");
	 return a / b; 
 }
 
 public float resta(int a , int b) {
	 System.out.println("resta");
	 return a - b; 
 }
 
 public float resta(List<Integer> lisInter) {
	 System.out.println("resta");
		float r =0; 
		
		boolean unaVez = true; 
		
		// itera todo la lista 
		for (Integer item : lisInter) 
		{
			
			// asigna el valor una vez 
			if (unaVez) 
			{
				r = item; 
				unaVez = false;
 			}
			else
			{
				r = r - item; 
			}
			
			
		}
		
		return r; 
	}
 

 public float multiplicacion(int a , int b) {
	 System.out.println("multiplicacion");
	 return a * b; 
 }
 
 public float multiplicacion(List<Integer> lisInter) {
	 System.out.println("multiplicacion");
		float r = 0; 
		
		boolean unaVez = true; 
		
		// itera todo la lista 
		for (Integer item : lisInter) 
		{
			
			// asigna el valor una vez 
			if (unaVez) 
			{
				r = item; 
				unaVez = false;
			}
			else
			{
				r = r * item; 
			}
			
			
		}
		
		return r; 
	}

@Override
public String toString() {
	return "Cientifica [getMarca()=" + getMarca() + ", getColor()=" + getColor() + ", getModelo()=" + getModelo()
			+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}
 
 

	

	
}
