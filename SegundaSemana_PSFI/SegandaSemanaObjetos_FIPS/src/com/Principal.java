package com;

public class Principal {

	public static void main(String[] args) {
		// En la programacion orientada a objetos solo debe existir una clase con el metodo main
		//Es la que ejecutara todo el programa o poryecto 
		
		//Vamos a crear un nuevo objeto Persona
		Persona humberto = new Persona (); 
		
		//Vamos a crear a una nueva persona pero con sus atributos inicializados
		Persona persona1 = new Persona ("Hugo", 23, "Masculino");
		
		//Vamos a porbar asignarle nombres y demas valores a nuetsro objeto 
		//llamado Humberto 
		humberto.setNombre("Humberto");
		humberto.setGenero("Masculino");
		
		//Probando un metodo get para devolver el valor del nombre de una persona
		System.out.println(persona1.getNombre());
		
		//Vamos que ocurre si quiero mandar a imprimir un objeto completo en consola
		System.out.println(persona1);
		System.out.println(humberto);
		
//		Vamos a crear 3 clases para poder crear 3 diferentes objetos
//		Recuerden, deben llevar por lo menos 3 atributos, constructores 
//		getter y setter, toString ()
//		En esta misma clase principal crean uno con todos los argumentos
//		y uno vacio al que posteriormente asignaran valor a uno de sus atributos
//		y los mandan a imprimir en consola
		
		//Ejemplo...
		Personaje ryu = new Personaje("Ryu", "Masculino", 30, "Hadoken");
		
		Personaje ken = new Personaje();
		ken.setHabilidad("Shoryuken");
		
		System.out.println(ryu);
		System.out.println(ken);
		
		Peliculas Interestelar = new Peliculas ("Interestelar","CienciaFision", "12A", 2014, 169);
		
		
		Peliculas Alfilodelmañana = new Peliculas ();
		Alfilodelmañana.setClasificacion("PG13");
		
		System.out.println(Interestelar);
		System.out.println(Alfilodelmañana);

	}
	
}

