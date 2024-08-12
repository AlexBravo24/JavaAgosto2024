package com;

public class Principal {

	public static void main(String[] args) {
		//En la POO solo debe existir una clase con el método main
		//que es la que ejecutará todo el programa
		
		//Vamos a crear un nuevo objeto persona
		Persona humberto=new Persona();
		
		//Vamos a crear a una nueva persona con sus atributos iniciados
		Persona persona1= new Persona("Hugo",23,"Masculino");//Para que aparezcan las sugerencias presionar
		                                                     //Ctrl+espacio después del nombre de la clase
		//Vamos a probar a asignarle nombre a nuestro objeto llamado humberto
		humberto.setNombre("Humberto");
		humberto.setGenero("Masculino");
		
		//Probando un método Get para devolver el nombre de una persona
		System.out.println(persona1.getNombre());
		//Veamos que ocurre si quiero mandar a imprimir un objeto completo un constructor
		System.out.println(persona1);
		
		Personaje pikachu = new Personaje();
		Personaje meowth = new Personaje("Meowth","Imaginativo y traductor del equipo Rocket","Región Canto");
		pikachu.setNombre("Pikachu");
		pikachu.setHabilidad("Es un taser");
		System.out.println("\n\nPersonajes de Pokemón");
		System.out.println("Personaje: "+pikachu.getNombre());
		System.out.println("Habilidad: "+pikachu.getHabilidad());
		
		System.out.println(meowth);
		
		Pan deFiesta = new Pan();
		Pan beso = new Pan("Beso","blanco y rojo",8);
		deFiesta.setNombre("De fiesta");
		deFiesta.setColores("Amarillo, rojo y verde");
		System.out.println("\n\nPan");
		System.out.println("Nombre="+deFiesta.getNombre());
		System.out.println("Color="+deFiesta.getColores());
		
		System.out.println(beso);
		
		memoriaRAM DDR2 = new memoriaRAM();
		memoriaRAM PC3 = new memoriaRAM("SK Hynix","PC3","8GB","1600MHz",398);
		System.out.println("\n\nMemorias");
		DDR2.setMarca("Kingston");
		DDR2.setModelo("DDR2");
		DDR2.setFsb("800Mhz");
		System.out.println("\nMemoria");
		System.out.println("Marca: "+DDR2.getMarca()+"\nModelo: "+DDR2.getModelo()+"\nFSB= "+DDR2.getFsb());
		System.out.println(PC3);
				
		
		

	}

}
