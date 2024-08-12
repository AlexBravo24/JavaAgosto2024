package com;


public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Personas");
		// set edad 
		Persona p1 = new Persona(); 
		p1.setEdad(26); 
		System.out.println(p1);
		
		// print objeto 
		Persona p2 = new Persona("Juan",18,"Masculino"); 
		System.out.println(p2);
		System.out.println();
		
		System.out.println("Cars");
		
		// objetos carros 
		Cars Versa = new Cars("Azul","Nissan",180); 
		System.out.println(Versa);
		
		Cars challenger = new Cars(); 
		challenger.setMarca("Dodge");
		System.out.println(challenger);
		
		// objetos canciones
		System.out.println();
		System.out.println("Canciones");
		
		Canciones michelle = new Canciones("Michelle","The Beatles", 1995); 
		System.out.println(michelle);
		
		Canciones sunflower = new Canciones(); 
		sunflower.setName("Sunflower");
		System.out.println( sunflower);
		

		

		
		
		

		
		
	    

		


	}

}

