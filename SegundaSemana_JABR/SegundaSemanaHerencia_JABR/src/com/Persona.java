package com;

//Una clase abstracta es aquella que posee por lo menos
//un m�todo abstracto
public abstract class Persona {
	
	private String nombre;
	private int edad;
	private String genero;
	
	public Persona() {}

	public Persona(String nombre, int edad, String genero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + "]";
	}
	
	//M�todos Propios de la clase
	//Son acciones que nuestro objeto va a poder realizar
	//Existen 2 formas de declarar los mismos:
	
	//M�todos void - sin retorno
	//Ejecutan alguna acci�n, pero no tienen la necesidad de devolver un tipo 
	//de dato
	
	//Ej. Un m�todo que le permita comer a las personas
	
	public void comer() {
		System.out.println("Estoy comiendo....");
	}
	//M�todo con retorno - debe devolver el tipo de dato que declara
	//al momento de nombrarlo
	public String saludar() {
		//Puedo declarar como ejemplo un String que guarde un saludo
		String saludo = "Hola mundo";
		
		return saludo;
	}	
	//Declarando un m�todo polimorfico de el m�todo comer
	//POLIMORFISMO - Pilar de la POO
	//En la cual un m�todo u objeto es capaz de poseer varias formas
	public void comer(String comida) {
		System.out.println("Estoy comiendo " + comida);
	}
	
	public void comer(String comida, int cantidad) {
		System.out.println("Estoy comiendo " + cantidad + comida);
	}
	
	//Ejemplo de declaraci�n de un m�todo abstracto
	//Esto volver� a mi clase abstracta
	//Los m�todos abstractos nos dicen QU� se va a hacer, pero no
	//C�MO
	//Esto ultimo quiere decir que el m�todo tendr� que ser definido
	// por una clase hija
	public abstract void sumar(int a, int b);
	
	
	
	
	
}
