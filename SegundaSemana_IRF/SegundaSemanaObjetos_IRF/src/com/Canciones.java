package com;

public class Canciones {
	
	private String name; 
	private String artista; 
	private int lanzamiento; 
	
	public Canciones() {
		
	}
	
	public Canciones(String name,String artista, int lanzamiento) {
		
		this.name = name; 
		this.artista = artista;
		this.lanzamiento = lanzamiento; 
	}

	
	// setters and getters 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	
	
	public int getLanzamiento() {
		return lanzamiento;
	}

	public void setLanzamiento(int lanzamiento) {
		this.lanzamiento = lanzamiento;
	}

	public void escibirFragmento(String fragmentoCancion) {
		System.out.println(fragmentoCancion);
	}

	@Override
	public String toString() {
		return "Canciones [name=" + name + ", artista=" + artista + ", lanzamiento=" + lanzamiento + "]";
	}
	
	
	
	

}
