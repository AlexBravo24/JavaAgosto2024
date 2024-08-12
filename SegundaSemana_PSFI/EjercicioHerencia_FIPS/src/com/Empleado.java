package com;

public class Empleado {
	
	private String nombre;
	private int edad;
	private String genero;
	private String rfc;
	private double salario; 
	private String turno;
	
	public Empleado() {}

	public Empleado(String nombre, int edad, String genero, String rfc, double salario, String turno) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.rfc = rfc;
		this.salario = salario;
		this.turno = turno;
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
		return "Empleado [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", rfc=" + rfc + ", salario="
				+ salario + ", turno=" + turno + "]";
	}

	
	
}
