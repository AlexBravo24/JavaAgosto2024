package com;

//Una clase abstracta es aquella que posee por lo menos un m�todo asbtractos

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
	
	
	//M�todos propios de la clase
	//Son accioens que nuestro objeto va a poder realizar. 
	//existen 2 formas de declarar los mismos: 
	
	
	//M�TODOS VOID- sin retorno
	//ejecutan alguna acci�n pero no tienen la necesidad de devolver un tipo de dato
	
	//Ej. un m�todo que le permita comer a las personas
	
	public void comer() {
		//lo que vaya aqui es lo que m�todo va a ejecutar
		System.out.println("Estoy comiendo...");
	}
	
	//M�TODO CON RETORNO- devuelve el tipo de dato que declara al momento de nombrarlo
	
	public String saludar() {
		//Puedo declarar como ejemplo un Strin que guarde un saludo
		String saludo="Hola mundo";
		return saludo;
		//return null; //para que no salga error
	}
	
	//POLIMORFISMO- es otro pilar de la programacion orientada a objetos, en la cual
	//un m�todo u objeto es capaz de poseer varias formas
	//Declarar un m�todo polim�rfico del m�todo comer.
	
	public void comer(String comida) {	//agregamos String comida para que vea que es otro m�todo
		System.out.println("Estoy comiendo "+comida);
	}
	
	//otro m�todo de ejecutar el m�todo comer
	public void comer (String comida, int cantidad) {
		System.out.println("Estoy comiendo "+cantidad + " "+comida);
	}
	
	//La capacidad de tener varios m�todo se conoce como SOBRECARGA DE M�TODOS
	//y esto se logra gracias a la sobrecarga de argumentos.
	//entre m�s cosas pieda el m�todo, m�s sobrecargo de argumentos.
	
	//M�TODO ABSTRACTO
	// public abstract void comer(); Est� vac�o. Esto protege la clase
	
	//Ejemplo de declaraci�n de un m�todo abstracto
	//Esto volver� a mi clase abstracta
	//Los m�todos abstractos nos dicen QU� se va a hacer pero no C�MO
	//Es decir, el m�todo tendr� que ser definido por una clase hija
	
	public abstract void sumar(int a, int b);
	//Tener solo un m�todo abstracto hace que toda la clase persona se vuelva abstracta
	//Entonces tenemos que convertir toda la clase en abstracta poniendo la palabra asbtract en public abstract class Persona{

}
