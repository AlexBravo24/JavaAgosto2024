package com;

public class Maestro extends Usuario {
	private String materia;
	private String experiencia;
	
	public Maestro() {
		
	}

	public Maestro(String nombre, String apellido, String correo, String direccion, String telefono, String materia,
			String experiencia) {
		super(nombre, apellido, correo, direccion, telefono);
		this.materia = materia;
		this.experiencia = experiencia;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return "Maestro [materia = " + materia + ", experiencia = " + experiencia + ", toString( = " + super.toString()
				+ "]";
	}
	
	
	
	
	
	

}
