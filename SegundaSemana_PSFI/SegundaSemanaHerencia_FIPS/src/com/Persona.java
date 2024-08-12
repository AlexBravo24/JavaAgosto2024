package com;

//Una clase abstracta es aquella que posee por lo menos 
//un metodo abstracto
public abstract class Persona {
	private String nombre;
	private int edad;
	private String genero; 
	
	public Persona() {
		
	}

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
	
	
	//Metodos propios de la clase
	//Acciones de nuestro objeto va a poder realizar
	//Existen 2 formas de declarar los miembros;
	
	//Metodo void- sin retorno
	//Ejecuta alguna accion, pero no tiene la necesidad de devolver un tipo
	//de dato
	
	//Ej. Un metodo que le permita comer a las personas
	
//	la capacidad de tener varios metodos con el mismo nombre se le conoce
//	como sobrecarga de metodos
//	y esto se logra gracias a la sobre carga de argumentos 
	
	public void comer () { //0 argumentos
		//creamos un cuerpo de metodo
		System.out.println("Estoy comiendo...");	
		
	}
	
	//Metodo con retorno -debe devolver el tipo de dato que declara
	
	public String saludar() {
		//puedo declarar como ejemplo un string que guarde un saludo
		String saludo = "Hola mundo";
		
		return saludo; 
	}
	
	//Declarando un metodo poliformico del metodo comer
	//estamo argumentando lo que hara el metodo
    //POLIMORFISMO - Pilar de la POO
	//En la cual un metodo u objeto es capaz de poseer varias formas
	public void comer(String comida) { //1 argumento
		System.out.println("Estoy comiendo " + comida);
	}
	

	public void comer (String comida, int cantidad) { //2 argumentos
		System.out.println("Estoy comiendo " + cantidad + comida);
	}
	
	//ADSTRACCION
	//EJEMPLO DE DECLARACION 
	//Esto volvera a mi clase abstracta
	
	//Los metodos adstractos no dicen que se va hacer pero no 
	//Como
	//Esto ultimo quiere decir que  el metodo tendra que ser definido
	// por una clase hija
	public abstract void sumar(int a, int b) ;  
	
	
	
	
	

}
