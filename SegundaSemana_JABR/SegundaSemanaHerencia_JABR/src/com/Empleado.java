package com;

//La HERENCIA nos va a permitir obtener los atributos
//y comportamientos de una clase Padre, en este caso, la clase
//Persona
public class Empleado extends Persona {
	
	//Aqui solo declaramos los atributos propios de un empleado
	//porque los de Persona, los vamos a reciclar
	//o heredar
	
	private String rfc;
	private double salario;
	private String turno;
	
	public Empleado() {}

	//Para poder crear un Empleado con todos los atributos incluyendo los
	//de la clase Persona, debemos elegir el constructor también de la clase Persona
	//al momento de generarlo
	public Empleado(String nombre, int edad, String genero, String rfc, double salario, String turno) {
		super(nombre, edad, genero);
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

	@Override
	public String toString() {
		return "Empleado [rfc=" + rfc + ", salario=" + salario + ", turno=" + turno + ", toString()=" + super.toString()
				+ "]";
	}

	//Las clases hijas se ven obligadas a definir los métodos abstractos
	//que heredan de su clase padre
	@Override
	public void sumar(int a, int b) {
		System.out.println("La suma es: " + (a+b));
		
	}

	
	

}
