package com;

public class Cancer {
	
	private String tipoCancer; 
	private String generoComun; 
	private String tasaSupervivencia;
	private String factorRiesgo;
	
	
	public Cancer() {
	}


	public Cancer(String tipoCancer, String generoComun, String tasaSupervivencia, String factorRiesgo) {
		super();
		this.tipoCancer = tipoCancer;
		this.generoComun = generoComun;
		this.tasaSupervivencia = tasaSupervivencia;
		this.factorRiesgo = factorRiesgo;
	}


	public String getTipoCancer() {
		return tipoCancer;
	}


	public void setTipoCancer(String tipoCancer) {
		this.tipoCancer = tipoCancer;
	}


	public String getGeneroComun() {
		return generoComun;
	}


	public void setGeneroComun(String generoComun) {
		this.generoComun = generoComun;
	}


	public String getTasaSupervivencia() {
		return tasaSupervivencia;
	}


	public void setTasaSupervivencia(String tasaSupervivencia) {
		this.tasaSupervivencia = tasaSupervivencia;
	}


	public String getFactorRiesgo() {
		return factorRiesgo;
	}


	public void setFactorRiesgo(String factorRiesgo) {
		this.factorRiesgo = factorRiesgo;
	}


	@Override
	public String toString() {
		return "Cancer [tipoCancer=" + tipoCancer + ", generoComun=" + generoComun + ", tasaSupervivencia="
				+ tasaSupervivencia + ", factorRiesgo=" + factorRiesgo + "]";
	}
	
	

}
