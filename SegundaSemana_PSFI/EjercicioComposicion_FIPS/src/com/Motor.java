package com;

public class Motor {
	
	private String tipo;
	private String estabilidad;
	private double potencia;
	
	public Motor () {
		
	}

	public Motor(String tipo, String estabilidad, double potencia) {
		super();
		this.tipo = tipo;
		this.estabilidad = estabilidad;
		this.potencia = potencia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEstabilidad() {
		return estabilidad;
	}

	public void setEstabilidad(String estabilidad) {
		this.estabilidad = estabilidad;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Motor [tipo=" + tipo + ", estabilidad=" + estabilidad + ", potencia=" + potencia + "]";
	}
	
	
	

}
