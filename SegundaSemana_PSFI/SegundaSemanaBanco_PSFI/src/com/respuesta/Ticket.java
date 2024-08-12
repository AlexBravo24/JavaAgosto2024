package com.respuesta;

import java.util.Date;

public class Ticket {
	
	//El proposito de esta clase es responder
	//si las operaciones se realiza con exito 
	
	private int folio; 
	private Date fechaHora;
	private String nombre; 
	private double saldo; 
	private String sucursal; 
	private int idCajero; 
	
	public Ticket () {}

	public Ticket(int folio, Date fechaHora, String nombre, double saldo, String sucursal, int idCajero) {
		super();
		this.folio = folio;
		this.fechaHora = fechaHora;
		this.nombre = nombre;
		this.saldo = saldo;
		this.sucursal = sucursal;
		this.idCajero = idCajero;
	}

	public int getFolio() {
		return folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public int getIdCajero() {
		return idCajero;
	}

	public void setIdCajero(int idCajero) {
		this.idCajero = idCajero;
	}

	@Override
	public String toString() {
		return "Ticket [folio=" + folio + ", fechaHora=" + fechaHora + ", nombre=" + nombre + ", saldo=" + saldo
				+ ", sucursal=" + sucursal + ", idCajero=" + idCajero + "]";
	}
	
	

}
