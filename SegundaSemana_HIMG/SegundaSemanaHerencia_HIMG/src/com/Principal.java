package com;

public class Principal {

	public static void main(String[] args) {
		// Probando que podemos instanciar una Persona.
		
		Persona persona1 = new Empleado("Pedro", 30, "Masculino","FAT678120", 25000, "Matutino");
		// Una vez que una clase es abstracta esta no puede ser 
		// instanciada (no podemos crear objetos de ella)
		System.out.println(persona1);
		
		// Probando que podemos instanciar un
		Empleado empleado1 = new Empleado("Fatima", 20, "Femenino", "FAT678120", 25000, "Matutino");
		System.out.println(empleado1);
		
		// Reemplazar el nombre del empleado1
		empleado1.setRfc("FTM18946");
		System.out.println(empleado1);
		
		// Probamos el metodo propio comer.
		persona1.comer();
		empleado1.comer();
		
		// Probando el metodo propio saludar.
		persona1.saludar();
		// Si yo quiero ver el saludo en consola tengo que mandar a imprimir.
		System.out.println(persona1.saludar());
		
		// Probando el método polimorfico comer.
		persona1.comer("Pizza");
		
		persona1.comer(" rebanadas de pizza", 4);
		
		// Probando el método abstracto ya definido en empleado
		persona1.sumar(10, 17);

	}

}
