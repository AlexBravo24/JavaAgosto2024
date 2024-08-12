package com;

public class Usuario {
	private String nombre;
	private String apellido;
	private String correo;
	private String direccion;
	private String telefono;
	
	public Usuario() {
		
	}
	
	public Usuario(String nombre, String apellido, String correo, String direccion, String telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Usuario [nombre = " + nombre + ", apellido = " + apellido + ", correo = " + correo + ", direccion = "
				+ direccion + ", telefono = " + telefono + "]";
	}
	
	
	
	
	
	

}
