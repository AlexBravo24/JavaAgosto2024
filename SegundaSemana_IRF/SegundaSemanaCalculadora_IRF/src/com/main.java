package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
	
	public static void main(String[] args){
		
		Cientifica casio = new Cientifica("Casio","plata","FX-991ES"); 
		
		// suma 
		List<Integer> list = new ArrayList<>(); 
		
		list.add(10);
		list.add(2);
		list.add(2);
		
		// suma 
		System.out.println(casio.suma(10,2));
		System.out.println(casio.suma(list));
		
		// resta 
		System.out.println(casio.resta(10,2));
		System.out.println(casio.resta(list));
		
		// multiplicacion 
		System.out.println(casio.multiplicacion(10,2));
		System.out.println(casio.multiplicacion(list));
		
		// division 
		System.out.println(casio.division(10,2));
		

		

		

		
	} 

}
