package com;

//Una clase abstracta es aquella que posee por lo menos un método asbtractos

public abstract class Persona {
	
	private String nombre;
	private int edad;
	private String genero;
		
	public Persona () {}

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
	
	
	//Métodos propios de la clase
	//Son accioens que nuestro objeto va a poder realizar. 
	//existen 2 formas de declarar los mismos: 
	
	
	//MÉTODOS VOID- sin retorno
	//ejecutan alguna acción pero no tienen la necesidad de devolver un tipo de dato
	
	//Ej. un método que le permita comer a las personas
	
	public void comer() {
		//lo que vaya aqui es lo que método va a ejecutar
		System.out.println("Estoy comiendo...");
	}
	
	//MÉTODO CON RETORNO- devuelve el tipo de dato que declara al momento de nombrarlo
	
	public String saludar() {
		//Puedo declarar como ejemplo un Strin que guarde un saludo
		String saludo="Hola mundo";
		return saludo;
		//return null; //para que no salga error
	}
	
	//POLIMORFISMO- es otro pilar de la programacion orientada a objetos, en la cual
	//un método u objeto es capaz de poseer varias formas
	//Declarar un método polimórfico del método comer.
	
	public void comer(String comida) {	//agregamos String comida para que vea que es otro método
		System.out.println("Estoy comiendo "+comida);
	}
	
	//otro método de ejecutar el método comer
	public void comer (String comida, int cantidad) {
		System.out.println("Estoy comiendo "+cantidad + " "+comida);
	}
	
	//La capacidad de tener varios método se conoce como SOBRECARGA DE MÉTODOS
	//y esto se logra gracias a la sobrecarga de argumentos.
	//entre más cosas pieda el método, más sobrecargo de argumentos.
	
	//MÉTODO ABSTRACTO
	// public abstract void comer(); Está vacío. Esto protege la clase
	
	//Ejemplo de declaración de un método abstracto
	//Esto volverá a mi clase abstracta
	//Los métodos abstractos nos dicen QUÉ se va a hacer pero no CÓMO
	//Es decir, el método tendrá que ser definido por una clase hija
	
	public abstract void sumar(int a, int b);
	//Tener solo un método abstracto hace que toda la clase persona se vuelva abstracta
	//Entonces tenemos que convertir toda la clase en abstracta poniendo la palabra asbtract en public abstract class Persona{

}
