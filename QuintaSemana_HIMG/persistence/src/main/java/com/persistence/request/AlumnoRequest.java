package com.persistence.request;

import java.time.LocalDateTime;

public class AlumnoRequest {
	
	// Aqui vamos a crear un POJO
	// POJO - Plain Old Java Object
	
	private int alumnoId;
	private String nombre;
	private LocalDateTime fechaNac;
	private String genero;
	private String grado;
	private String ciudad;
	private int status;
	
	public AlumnoRequest () {
		
	}

	public AlumnoRequest(int alumnoId, String nombre, LocalDateTime fechaNac, String genero, String grado,
			String ciudad, int status) {
		super();
		this.alumnoId = alumnoId;
		this.nombre = nombre;
		this.fechaNac = fechaNac;
		this.genero = genero;
		this.grado = grado;
		this.ciudad = ciudad;
		this.status = status;
	}

	public int getAlumnoId() {
		return alumnoId;
	}

	public void setAlumnoId(int alumnoId) {
		this.alumnoId = alumnoId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDateTime getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDateTime fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getGrado() {
		return grado;
	}

	public void setGrado(String grado) {
		this.grado = grado;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "AlumnoRequest [alumnoId = " + alumnoId + ", nombre = " + nombre + ", fechaNac = " + fechaNac + ", genero = "
				+ genero + ", grado = " + grado + ", ciudad = " + ciudad + ", status = " + status + "]";
	}
	
	

}
