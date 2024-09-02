package com.entity;

public class Carreras {
	
	private int carreraId;
	private String nombre;
	private String area;
	private String duracion;
	private double presupuesto;
	
	public Carreras () {
		
	}

	public Carreras(int carreraId, String nombre, String area, String duracion, double presupuesto) {
		super();
		this.carreraId = carreraId;
		this.nombre = nombre;
		this.area = area;
		this.duracion = duracion;
		this.presupuesto = presupuesto;
	}

	public int getCarreraId() {
		return carreraId;
	}

	public void setCarreraId(int carreraId) {
		this.carreraId = carreraId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public double getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}

	@Override
	public String toString() {
		return "Carreras [carreraId = " + carreraId + ", nombre = " + nombre + ", area = " + area + ", duracion = " + duracion
				+ ", presupuesto = " + presupuesto + "]";
	}
	
	

}
