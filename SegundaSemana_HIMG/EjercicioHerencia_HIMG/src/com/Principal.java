package com;

public class Principal {

	public static void main(String[] args) {
		// 
		System.out.println("-----Nuevo maestro-----");
		Maestro maestro1 = new Maestro("Jocelyn", "L�pez", "lopezjoce@gmail.com", "Ciudad de M�xico", "55-2475-3540", "Historia", "5");
		System.out.println(maestro1);
		
		System.out.println("\n-----Nuevo tutor-----");
		Tutor tutor1 = new Tutor("Evelin", "Mart�nez", "martinezeve@gmail.com", "Ciudad de M�xico", "56-1175-8799", "Italiano", 7);
		System.out.println(tutor1);
		
		System.out.println("\n-----Nuevo alumno-----");
		Alumno alumno1 = new Alumno("Aylin", "Mar�n", "marinaylin@gmail.com", "Morelia", "422-7623-134", "22020453", "Ciencias Sociales");
		System.out.println(alumno1);


	}

}
