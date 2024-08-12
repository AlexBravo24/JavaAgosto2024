package com;

public class Principal {

	public static void main(String[] args) {
		
		// Probando que podemos instanciar una persona
		
		//Una vez que una clase es abstracta, esta no puede
		//ser instanciada (no podemos crear objetos de ella)
		//Persona persona1 = new Empleado --- POLIMORFISMO DE ASIGNACION 
		Persona persona1 = new Empleado ("Pedro", 30, "Maculino", "FAT6789", 25000, "Matutino");
		System.out.println(persona1); 
		
		//Probando que podemos instanciar en empleado con el constructor completo
		Empleado empleado1 = new Empleado("Fatima", 20, "Femenino", "FAT6789", 25000, "Matutino"); 
		System.out.println(empleado1);
		
		//Remplazamos el nombre de empleado
		empleado1.setRfc("FAT12354");
		System.out.println(empleado1);
		
		//Crear una clase pabre para que esta le heredae a otra sus atributos y metodos y los manda a imprimir 
		//en una clase principal
		//Ej. Vehiculo que hereda a algun trasporte especifico
		//Auto, barco, tren, avion, etc..
		
		
		//Probamos el metodo propio comer 
		
		persona1.comer();
		empleado1.comer();
		
		//Probando el metodo propio saludar
		persona1.saludar(); //debera mandarte un string  
		System.out.println(persona1.saludar());
		
		//Probando el metodo polimorfico comer
		persona1.comer();
		persona1.comer("pizza");
		
		persona1.comer(" Rebanadas de pizza", 4);
		
		//Probamos el metodo abstracto ya definido en empleado
		persona1.sumar(10, 17);
		
		

	}

}
