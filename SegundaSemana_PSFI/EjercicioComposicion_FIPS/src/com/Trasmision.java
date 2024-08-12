package com;

public class Trasmision {
	 private String potencia;
	 private String aceite;
	 private double cambios; 
	 
	 public Trasmision() {
		 
	 }

	public Trasmision(String potencia, String aceite, double cambios) {
		super();
		this.potencia = potencia;
		this.aceite = aceite;
		this.cambios = cambios;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	public String getAceite() {
		return aceite;
	}

	public void setAceite(String aceite) {
		this.aceite = aceite;
	}

	public double getCambios() {
		return cambios;
	}

	public void setCambios(double cambios) {
		this.cambios = cambios;
	}

	@Override
	public String toString() {
		return "Trasmision [potencia=" + potencia + ", aceite=" + aceite + ", cambios=" + cambios + "]";
	}

	


}
