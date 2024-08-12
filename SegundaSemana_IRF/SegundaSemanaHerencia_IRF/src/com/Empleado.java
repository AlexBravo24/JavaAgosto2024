package com;

// aplicamos la herencia para tener atributos y metodos de la clase persona 


public class Empleado extends Persona{
	
	/*
	 * solo se definenn los atributos de empleado para evitar rescribir todos los valore
	 * */
	
	private String rfc; 
	private double salario; 
	private String turno; 
	
	public Empleado() {

	}


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
		return "Empleado [rfc=" + rfc + ", salario=" + salario + ", turno=" + turno + ", getNombre()=" + getNombre()
				+ ", getEdad()=" + getEdad() + ", getGenero()=" + getGenero() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}


	
	
	
	
	

}
