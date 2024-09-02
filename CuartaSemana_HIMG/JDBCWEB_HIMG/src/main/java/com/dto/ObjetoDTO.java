package com.dto;

public class ObjetoDTO {
	
	// En el patrón de diseño DTO
	// Data Transfer Object, debemos conjuntar la info 
	// o consulta que proviene de varias entidades en une 
	// base de datos en un solo objeto aqui en Java
	
	private int matricula;
	private String alumno;
	private String carrera;
	private String area;
	
	public ObjetoDTO () {
		
	}

	public ObjetoDTO(int matricula, String alumno, String carrera, String area) {
		super();
		this.matricula = matricula;
		this.alumno = alumno;
		this.carrera = carrera;
		this.area = area;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getAlumno() {
		return alumno;
	}

	public void setAlumno(String alumno) {
		this.alumno = alumno;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "ObjetoDTO [matricula = " + matricula + ", alumno = " + alumno + ", carrera = " + carrera + ", area = " + area
				+ "]";
	}
	
	

}
