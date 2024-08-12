package com;

public class Principal {

	public static void main(String[] args) {
		//Crear una clase pabre para que esta le heredae a otra sus atributos y metodos y los manda a imprimir 
		//en una clase principal
		//Ej. Vehiculo que hereda a algun trasporte especifico
		//Auto, barco, tren, avion, etc..
		
		Empleado empleado1 = new Empleado("Fatima", 20, "Femenino", "FAT6789", 25000, "Matutino"); 
		System.out.println(empleado1);
		
		//Remplazamos el nombre de empleado
		empleado1.setRfc("FAT12354");
		System.out.println(empleado1);
	
		
		
		Gerente gerente1 = new Gerente ("Fatima", 20, "Femenino", "FAT6789", 25000, "Matutino", "Ventas", 2, "Bonos");
		 System.out.println(empleado1);
		
		
		gerente1.setDepartamento("Marketing");
		System.out.println(gerente1);
	}

}
