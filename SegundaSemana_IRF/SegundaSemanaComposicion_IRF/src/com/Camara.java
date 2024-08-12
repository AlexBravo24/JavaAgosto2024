package com;

public class Camara {
	
	private String megaPiexeles; 
	private String cantidadLentes; 
	private String operturaFocal;
	
	public Camara(String megaPiexeles, String cantidadLentes, String operturaFocal) {
		super();
		this.megaPiexeles = megaPiexeles;
		this.cantidadLentes = cantidadLentes;
		this.operturaFocal = operturaFocal;
	}

	
	
	public String getMegaPiexeles() {
		return megaPiexeles;
	}



	public void setMegaPiexeles(String megaPiexeles) {
		this.megaPiexeles = megaPiexeles;
	}



	public String getCantidadLentes() {
		return cantidadLentes;
	}



	public void setCantidadLentes(String cantidadLentes) {
		this.cantidadLentes = cantidadLentes;
	}



	public String getOperturaFocal() {
		return operturaFocal;
	}



	public void setOperturaFocal(String operturaFocal) {
		this.operturaFocal = operturaFocal;
	}



	@Override
	public String toString() {
		return "Camara [megaPiexeles=" + megaPiexeles + ", cantidadLentes=" + cantidadLentes + ", operturaFocal="
				+ operturaFocal + "]";
	} 
	
	
	
	

}
