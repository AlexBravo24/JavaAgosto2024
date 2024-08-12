package com;

public class Ingredientes {
	private String nombreIngrediente; 
	private int precio; 
	private String lote;
	
	
	public Ingredientes() {
	}
	
	public Ingredientes(String nombreIngrediente, int precio, String lote) {
		super();
		this.nombreIngrediente = nombreIngrediente;
		this.precio = precio;
		this.lote = lote;
	}


	public String getNombreIngrediente() {
		return nombreIngrediente;
	}


	public void setNombreIngrediente(String nombreIngrediente) {
		this.nombreIngrediente = nombreIngrediente;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public String getLote() {
		return lote;
	}


	public void setLote(String lote) {
		this.lote = lote;
	}


	@Override
	public String toString() {
		return "Ingredientes [nombreIngrediente=" + nombreIngrediente + ", precio=" + precio + ", lote=" + lote + "]";
	}
	
	
	

}
