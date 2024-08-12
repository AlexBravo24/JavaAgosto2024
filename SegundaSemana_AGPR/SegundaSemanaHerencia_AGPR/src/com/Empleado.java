package com;

//La HERENCIA nos va a permitir obtener los atrobutos
//y comportamientos de una clase Padre, en este caso, 
//la clase persona (usamos extends nombreClase)

public class Empleado extends Persona{
	
	//Aquí solo declaramos los atributos propios de un empleado
	//porque los de Persona los vamos a reciclar
	//o heredar
	
	//evitará que otra vez estemos dándole nombre, edad, género
	
	private String rfc;
	private double salario;
	private String turno;
	
	//Generamos el constructor vacío de forma normal
	
	public Empleado () {}
	
	//En todos los parámetros veremos cambios. Tenemos que elegir los parámetros 
	//de la clase Persona(String, int, String)

	public Empleado(String nombre, int edad, String genero, String rfc, double salario, String turno) {
		super(nombre, edad, genero); //esta parte se llena porque proviene de una clase super (padre)
		this.rfc = rfc;
		this.salario = salario;
		this.turno = turno;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	//En to String elegimos inhereted methos>toStrin para ver los atributos heredados
	//además del rfc, el salario y el turno
	@Override
	public String toString() {
		return "Empleado [rfc=" + rfc + ", salario=" + salario + ", turno=" + turno + ", toString()=" + super.toString()
				+ "]";
	}
	
	//Las clases hijas de ven obligadas a definir los métodos abstractos 
	//que hereda de su clase padre

	@Override
	public void sumar(int a, int b) {
		System.out.println("La suma es: "+(a+b));
		
	}

}
