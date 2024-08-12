package com;

public class Alumno extends Usuario {
	
	private String matricula;
	private String carrera;
	
	public Alumno(String nombre, String apellido, String correo, String direccion, String telefono, String matricula,
			String carrera) {
		super(nombre, apellido, correo, direccion, telefono);
		this.matricula = matricula;
		this.carrera = carrera;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "Alumno [matricula = " + matricula + ", carrera = " + carrera + ", getNombre() = " + getNombre()
				+ ", getApellido() = " + getApellido() + "]";
	}
	
	
	
	

}
