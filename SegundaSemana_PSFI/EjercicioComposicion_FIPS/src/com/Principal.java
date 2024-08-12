package com;

public class Principal {

	public static void main(String[] args) {
		// Crear un objeto de composision que se 
		//componga de minimo otros tres peque�os 
		
		Motor electrico = new Motor("cilindros", "altas", 300); 
		Neumaticos tubeless = new Neumaticos("sin c�mara", "cer�micos", 4); 
		Trasmision propulsion = new Trasmision("elevada","SAE-80W", 1);
		
		Coche golf = new Coche ("mk", electrico, 8, tubeless, propulsion); 
		System.out.println(golf); 

	}

}
