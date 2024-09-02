package com.persistence.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ALUMNO")
public class Alumno implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// La interface Serializable sirve para descomponer y recomponer
	// la información en bits y presengtarla adecuadamente
	// al frente

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aId_auto")
	@SequenceGenerator(name = "aId_auto", sequenceName = "ALUMNO_SEQ", allocationSize = 1)
	@Column(name = "ALUMNO_ID", columnDefinition = "NUMBER")
	private int alumnoId;
	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2")
	private String nombre;
	@Column(name = "FECHANAC", columnDefinition = "DATE")
	private LocalDateTime fechaNac;
	@Column(name = "GENERO", columnDefinition = "NVARCHAR2")
	private String genero;
	@Column(name = "GRADO", columnDefinition = "NVARCHAR2")
	private String grado;
	@Column(name = "CIUDAD", columnDefinition = "NVARCHAR2")
	private String ciudad;
	@Column(name = "STATUS", columnDefinition = "NUMBER")
	private int status;

	public Alumno() {

	}

	public Alumno(int alumnoId, String nombre, LocalDateTime fechaNac, String genero, String grado, String ciudad,
			int status) {
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Alumno [alumnoId=" + alumnoId + ", nombre=" + nombre + ", fechaNac=" + fechaNac + ", genero=" + genero
				+ ", grado=" + grado + ", ciudad=" + ciudad + ", status=" + status + "]";
	}

}
