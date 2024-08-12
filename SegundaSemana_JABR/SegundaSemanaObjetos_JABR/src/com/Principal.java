package com;

public class Principal {

	public static void main(String[] args) {
		
		// En la POO solo debe existir una clase con el método
		//main, que es la que ejecutará todo el programa o proyecto
		
		//Vamos a crear un nuevo objeto Persona
		Persona humberto = new Persona();
		
		//Vamos a crear a una nueva Persona pero con sus atributos iniciados
		Persona persona1 = new Persona("Hugo", 23, "Masculino");
		
		//Vamos a probar a asignarle nombre y demás valores a nuestro objeto
		//llamado Humberto
		humberto.setNombre("Humberto");
		humberto.setGenero("Masculino");
		
		//Probando un método get para devolver el valor del nombre de una persona
		System.out.println(persona1.getNombre());
		
		//Veamos que ocurre si quiero mandar a imprimir un objeto completo en consola
		System.out.println(persona1);
		System.out.println(humberto);
		
		//Van a crear 3 clases para poder crear 3 diferentes objetos
		//Recuerden, deben llevar por lo menos 3 atributos, constructores
		//getters y setters, toString()
		//En esta misma clase principal crean uno con todos los argumentos
		//y uno vacio, al que posteriormente le asignaran valor a uno de sus atributos
		//y los mandan a imprimir en consola
		
		//Ejemplo.....
		Personaje ryu = new Personaje("Ryu", "Masculino", 30, "Hadoken");
		
		Personaje ken = new Personaje();
		ken.setHabilidad("Shoryuken");
		
		System.out.println(ryu);
		System.out.println(ken);

	}

}
