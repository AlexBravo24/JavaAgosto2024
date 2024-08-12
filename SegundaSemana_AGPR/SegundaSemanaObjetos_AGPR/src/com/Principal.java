package com;

public class Principal {

	public static void main(String[] args) {
		// En la POO solo debe existir una clase con el método main
		// que es la ejecutara todo el programa o proyecto

		//vamos a crear un nuevo objeto persona
		Persona humberto=new Persona ();
		
		//Vamos a crear una nueva Persona pero con sus aributos iniciados
		
		Persona persona1 = new Persona("Hugo", 23, "Masculino");
		
		//Vamos a probar asignarle nombre y demás valores a nuestro objeto llamado humberto
		humberto.setNombre("Humberto");
		humberto.setGenero("Masculino");
		
		//Probando un método get para devolver el valor del nombre de una persona
		System.out.println(persona1.getNombre());
		
		//Qué ocurre si queremos imprimir un objeto completo en consola
		System.out.println(persona1);
		
		System.out.println(humberto);
		
		
		//Van a crear 3 clases para poder crear 3 diferentes objetos
		//Deben llevar por lo menos 3 atributos, constructores,
		//getters y setters, toString().
		//En esta misma clase principal crean uno con todos sus argumentos 
		//y uno vacío, al que posteriormente le asignar+an valor a uno de sus atributos
		//Y los mandan a imprimir en consola
		
		
		Personaje ryu=new Personaje("Ryu", "Masculino", 30, "Hadoken");
		
		Personaje ken=new Personaje();
		ken.setHabilidad("hor");
		
		System.out.println(ryu);
		System.out.println(ken);
		
		System.out.println(" ");
		
		//INGREDIENTES
		System.out.println("EJEMPLO INGREIDENTES");
		
		Ingredientes mentol =new Ingredientes("Mentol", 100, "MXN001");
		Ingredientes alcanfor = new Ingredientes();
		alcanfor.setPrecio(200);
		
		System.out.println(mentol);
		System.out.println(alcanfor);
		System.out.println(" ");
		
		//Virus
		System.out.println("EJEMPLO VIRUS");
		Virus influenza =new Virus("Virus de la influenza", "ARN", "Envuelto");
		Virus adenovirus = new Virus();
		adenovirus.setMaterialGenetico("ADN");
				
		System.out.println(influenza);
		System.out.println(adenovirus);
		System.out.println(" ");
		
		
		//Cancer
		System.out.println("EJEMPLO CANCER");
		Cancer mama= new Cancer("Cáncer de mama", "Mujeres", "90%", "Edad y género");
		Cancer prostata=new Cancer("Cáncer de próstata", "Hombres", "98%", "Edad avanzada");
		Cancer pulmon=new Cancer();
		pulmon.setTasaSupervivencia("20%");
		
		System.out.println(mama);
		System.out.println(prostata);
		System.out.println(pulmon);
	}
	

}
