package com;

public class Motor {
	private String tipo;
	private int potencia;
	private boolean esElectrico;
	
	public Motor() {
		
	}
	
	public Motor(String tipo, int potencia, boolean esElectrico) {
		super();
		this.tipo = tipo;
		this.potencia = potencia;
		this.esElectrico = esElectrico;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public boolean isEsElectrico() {
		return esElectrico;
	}

	public void setEsElectrico(boolean esElectrico) {
		this.esElectrico = esElectrico;
	}

	@Override
	public String toString() {
		return "Motor [tipo=" + tipo + ", potencia=" + potencia + ", esElectrico=" + esElectrico + "]";
	}
	
	
	

}
