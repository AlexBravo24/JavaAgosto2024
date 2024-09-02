package com.ms_clientes.entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTES")
public class Clientes implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aId_auto")
	@SequenceGenerator(name = "aId_auto", sequenceName = "CLIENTES_SEQ", allocationSize = 1)
	@Column(name = "CLIENTE_ID", columnDefinition = "NUMBER")
	private int clienteId;
	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2")
	private String nombre;
	@Column(name = "DIRECCION", columnDefinition = "NVARCHAR2")
	private String direccion;
	@Column(name = "Telefono", columnDefinition = "NVARCHAR2")
	private String telefono;

	public Clientes() {

	}

	public Clientes(int clienteId, String nombre, String direccion, String telefono) {
		super();
		this.clienteId = clienteId;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}

	public int getClienteId() {
		return clienteId;
	}

	public void setClienteId(int clienteId) {
		this.clienteId = clienteId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Clientes [clienteId = " + clienteId + ", nombre = " + nombre + ", direccion = " + direccion
				+ ", telefono = " + telefono + "]";
	}

}
