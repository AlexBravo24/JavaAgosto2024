package com;

//La HERENCIA nos va apermitir obtener los atributos 
//y comportamientos de una clase PADRE, en este caso, lka clase PERSONA

public class Empleado extends Persona {
	
	//declaramos atributos
	
    //Declaramos los atributos del empleado  por que los de persona
	//los vamos a reciclar o heredar
	
	private String rfc;
	private double salario; 
	private String turno;
	
	public Empleado() {}
	
	
    //Para poder crear un empleado con todos los 
	//atributos, incluyendo con lo persona debemois elegir el constructor tambien de la clase persona al momento de generarlo
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
	
	//COMENZAMOS A SOBREESCRIBIR por el metodo ADSTRACTRO
	//Las clases hijas se vena obligtadas a definir los metodos abstractos 
	//que hereda de sus clases padres
	@Override
	public void sumar(int a, int b) {
		System.out.println("La suma es  " + (a+b));
		// TODO Auto-generated method stub
		
	}
	
	

}
