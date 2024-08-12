package com;

//Una clase abstracta es aquella que posee por lo menos
//un método abstracto
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
	
	//Métodos Propios de la clase
	//Son acciones que nuestro objeto va a poder realizar
	//Existen 2 formas de declarar los mismos:
	
	//Métodos void - sin retorno
	//Ejecutan alguna acción, pero no tienen la necesidad de devolver un tipo 
	//de dato
	
	//Ej. Un método que le permita comer a las personas
	
	public void comer() {
		System.out.println("Estoy comiendo....");
	}
	//Método con retorno - debe devolver el tipo de dato que declara
	//al momento de nombrarlo
	public String saludar() {
		//Puedo declarar como ejemplo un String que guarde un saludo
		String saludo = "Hola mundo";
		
		return saludo;
	}	
	//Declarando un método polimorfico de el método comer
	//POLIMORFISMO - Pilar de la POO
	//En la cual un método u objeto es capaz de poseer varias formas
	public void comer(String comida) {
		System.out.println("Estoy comiendo " + comida);
	}
	
	public void comer(String comida, int cantidad) {
		System.out.println("Estoy comiendo " + cantidad + comida);
	}
	
	//Ejemplo de declaración de un método abstracto
	//Esto volverá a mi clase abstracta
	//Los métodos abstractos nos dicen QUÉ se va a hacer, pero no
	//CÓMO
	//Esto ultimo quiere decir que el método tendrá que ser definido
	// por una clase hija
	public abstract void sumar(int a, int b);
	
	
	
	
	
}
