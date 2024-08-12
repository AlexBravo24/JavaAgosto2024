package com;

public class Persona {
	//no está el método main porque ya se encuentra en principal.java
	
	//ABSTRACCION - Definir los atributos de los objetos que queremos crear
	
	//Atributos
	//ENCAPSULACION-Pilar de la POO, que protege la informacion de ser cambiara
	//desde distintos niveles
	//Para ellos se utilizan los modificadors de acceso
	//private, public, protected, default
	
	private String nombre; 
	private int edad; 
	private String genero;
	
	//poner private hace que solo aquí podemos cambiar los valores
	
	//Metodos constructures-nos permiten inicializar a nuestros objetos
	
	//contructor vacío
	public Persona() {
	}
	
	//Contructor con todos los parámetros o todos los argumentos
	//permite inizializar nuestro objeto con todos sus atributos desde un inicio
	//click derecho, source, generate consturctor using Fields

	public Persona(String nombre, int edad, String genero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
	}
	
	//podemos tner constructores que nos permitan iniciar nuestos objeticos
	//solo con determinados atributos
	public Persona(String nombre) {
		super();
		this.nombre=nombre;
	}
	
	//GETTERS Y SETTERS
	//Métodos Getter-devuelven el valor guardado del atributo
	//Métodos Setter- permiten establecer/asignar un nuevo valor a un atributo

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
	
	//Método toString()
	//Permite visualizar los elementos que componen al objeto en una impresipn
	//en consola, ya que convierte sys valores a Atring o cadena de texto

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + "]";
	}
	
	
	
	
	}
	



