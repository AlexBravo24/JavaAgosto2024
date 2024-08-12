package com;

public class Gerente extends Empleado{
	
	private String departamento;
	private double zona;
	private String prestaciones; 
	
	public Gerente () {
		
	}

	public Gerente(String nombre, int edad, String genero, String rfc, double salario, String turno,
			String departamento, double zona, String prestaciones) {
		super(nombre, edad, genero, rfc, salario, turno);
		this.departamento = departamento;
		this.zona = zona;
		this.prestaciones = prestaciones;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getZona() {
		return zona;
	}

	public void setZona(double zona) {
		this.zona = zona;
	}

	public String getPrestaciones() {
		return prestaciones;
	}

	public void setPrestaciones(String prestaciones) {
		this.prestaciones = prestaciones;
	}

	@Override
	public String toString() {
		return "Gerente [departamento=" + departamento + ", zona=" + zona + ", prestaciones=" + prestaciones
				+ ", toString()=" + super.toString() + "]";
	}

	
	

}
