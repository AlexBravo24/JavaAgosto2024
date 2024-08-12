package com;

public class Virus {
	
	private String nombre; 
	private String materialGenetico; 
	private String envueltoDesnudo;
	
	
	public Virus() {
	}


	public Virus(String nombre, String materialGenetico, String envueltoDesnudo) {
		super();
		this.nombre = nombre;
		this.materialGenetico = materialGenetico;
		this.envueltoDesnudo = envueltoDesnudo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getMaterialGenetico() {
		return materialGenetico;
	}


	public void setMaterialGenetico(String materialGenetico) {
		this.materialGenetico = materialGenetico;
	}


	public String getEnvueltoDesnudo() {
		return envueltoDesnudo;
	}


	public void setEnvueltoDesnudo(String envueltoDesnudo) {
		this.envueltoDesnudo = envueltoDesnudo;
	}


	@Override
	public String toString() {
		return "Virus [nombre=" + nombre + ", materialGenetico=" + materialGenetico + ", envueltoDesnudo="
				+ envueltoDesnudo + "]";
	}
	
	
	
	
	

}
