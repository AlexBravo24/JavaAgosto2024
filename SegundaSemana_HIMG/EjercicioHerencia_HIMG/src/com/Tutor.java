package com;

public class Tutor extends Usuario {
	
	private String materiaTutoria;
	private int numAlumnos;
	
	public Tutor() {
		
	}
	
	public Tutor(String nombre, String apellido, String correo, String direccion, String telefono,
			String materiaTutoria, int numAlumnos) {
		super(nombre, apellido, correo, direccion, telefono);
		this.materiaTutoria = materiaTutoria;
		this.numAlumnos = numAlumnos;
	}

	public String getMateriaTutoria() {
		return materiaTutoria;
	}

	public void setMateriaTutoria(String materiaTutoria) {
		this.materiaTutoria = materiaTutoria;
	}

	public int getNumAlumnos() {
		return numAlumnos;
	}

	public void setNumAlumnos(int numAlumnos) {
		this.numAlumnos = numAlumnos;
	}

	@Override
	public String toString() {
		return "Tutor [materiaTutoria = " + materiaTutoria + ", numAlumnos = " + numAlumnos + ", toString() = "
				+ super.toString() + "]";
	}
	
	
	
	

}
