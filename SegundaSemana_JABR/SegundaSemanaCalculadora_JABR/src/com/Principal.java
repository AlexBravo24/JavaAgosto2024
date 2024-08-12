package com;

public class Principal {

	public static void main(String[] args) {
	
		Cientifica casio = new Cientifica();
		
		casio.restar(6, 3);
		
		casio.tomarTemperatura();
		
		//Si les preguntan: ¿Existe la multiherencia en Java?
		// R: NO
		//Se puede simular mediante el uso de interfaces
		//Y una clase puede implementar más de una interface
		
		//¿De donde toman comportamientos los objetos?
		// 1. De las clases, de métodos propios
		// 2. De otras clases con la herencia, incluyendo clases
		//abstractas
		// 3. De interfaces

	}

}
