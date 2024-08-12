package com;

public class Principal {

	public static void main(String[] args) { 
		
		Cientifica barrilito = new Cientifica("Barrilito", "Rojo", "X100", true);
		
		System.out.println(barrilito);
		barrilito.sumar(12, 15);
		barrilito.restar(6, 2);
		barrilito.multiplicar(4, 8);
		barrilito.dividir(12, 0);
		
		barrilito.tomarTemperatura();
		barrilito.volar();
		
		
		// Si le preguntan ¿existe la multiherencia?
		// La respuesta es no
		// Se puede simular medienate el uso de intercaces
		
		// ¿De donde toman comportamientos los objetos?
		// 1. De las clases, métodos propios.
		// 2. De otras clases con la herencia, incluyendo clases abstractas.
		// 3. De interfaces.
	}

}
