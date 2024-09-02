package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity // Anotación que especifica que esta clase es una 
//entidad en una BD
@Table(name = "PROCURADORES")
public class Procuradores {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cid_auto")
	@SequenceGenerator(name = "cid_auto", sequenceName = "CLIENTES_SEQ")
	@Column(name = "PROCURADOR_ID", columnDefinition = "NUMBER")
	private int clienteId;
	
	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2(30)")
	private String nombre;
	
	@Column(name = "DIRECCION", columnDefinition = "NVARCHAR2(30)")
	private String direccion;
	
	@Column(name = "TELEFONO", columnDefinition = "NVARCHAR2(10)")
	private String telefono;
	
	@Column(name = "HONORARIOS", columnDefinition = "NUMBER")
	private String honorarios;
	
	public Procuradores () {
		
	}

	public Procuradores(int clienteId, String nombre, String direccion, String telefono, String honorarios) {
		super();
		this.clienteId = clienteId;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.honorarios = honorarios;
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

	public String getHonorarios() {
		return honorarios;
	}

	public void setHonorarios(String honorarios) {
		this.honorarios = honorarios;
	}

	@Override
	public String toString() {
		return "Procuradores [clienteId = " + clienteId + ", nombre = " + nombre + ", direccion = " + direccion
				+ ", telefono = " + telefono + ", honorarios = " + honorarios + "]";
	}
	
	

}
