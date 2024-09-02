package com.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "ASUNTOS")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
					property="asuntoId")
public class Asuntos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "asuId_auto")
	@SequenceGenerator(name = "asuId_auto", sequenceName = "ASUNTOS_SEQ")
	@Column(name = "ASUNTOS_ID", columnDefinition = "NUMBER")
	private int asuntoId;
	
	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2(30)")
	private String nombre;
	
	@Column(name = "FECHAINICIO", columnDefinition = "DATE")
	private Date fechaInicio;
	
	@Column(name = "FECHAFIN", columnDefinition = "DATE")
	private Date fechaFin;
	
	@Column(name = "ESTADO", columnDefinition = "NVARCHAR2(30)")
	private String estado;
	
	//@Column(name = "CLIENTE_ID", columnDefinition = "NUMBER")
	//private int clienteId;
	
	//@OneToOne
	@ManyToOne //Muchos asuntos para un solo cliente
	@JoinColumn(name = "CLIENTE_ID", columnDefinition = "NUMBER")
	private Clientes cliente;
	
	public Asuntos () {
		
	}

	public Asuntos(int asuntoId) {
		super();
		this.asuntoId = asuntoId;
	}

	public int getAsuntoId() {
		return asuntoId;
	}

	public void setAsuntoId(int asuntoId) {
		this.asuntoId = asuntoId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Asuntos [asuntoId=" + asuntoId + ", nombre=" + nombre + ", fechaInicio=" + fechaInicio + ", fechaFin="
				+ fechaFin + ", estado=" + estado + ", cliente=" + cliente + "]";
	}

}
