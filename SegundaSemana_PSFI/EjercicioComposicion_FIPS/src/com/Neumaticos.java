package com;

public class Neumaticos {
	
	private String modelp;
	private String disco;
	private double cuantas; 
	
	public Neumaticos () {
		
	}

	public Neumaticos(String modelp, String disco, double cuantas) {
		super();
		this.modelp = modelp;
		this.disco = disco;
		this.cuantas = cuantas;
	}

	public String getModelp() {
		return modelp;
	}

	public void setModelp(String modelp) {
		this.modelp = modelp;
	}

	public String getDisco() {
		return disco;
	}

	public void setDisco(String disco) {
		this.disco = disco;
	}

	public double getCuantas() {
		return cuantas;
	}

	public void setCuantas(double cuantas) {
		this.cuantas = cuantas;
	}

	@Override
	public String toString() {
		return "Neumaticos [modelp=" + modelp + ", disco=" + disco + ", cuantas=" + cuantas + "]";
	}
	


}
