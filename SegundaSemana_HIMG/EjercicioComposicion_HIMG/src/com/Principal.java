package com;

public class Principal {

	public static void main(String[] args) {
		// 
		Motor motor = new Motor("Diesel", 200, false);
		Ruedas ruedas = new Ruedas(4, "Neum�ticas");
		Montacargas montacargas = new Montacargas("Toyota", "8FDU25", "Amarillo", 2000, ruedas, motor);
		
		System.out.println(montacargas);

	}

}
