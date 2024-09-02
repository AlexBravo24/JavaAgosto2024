package com.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity // Anotación que especifica que esta clase es una 
// entidad en una BD
@Table(name = "CLIENTES")
public class Clientes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cid_auto")
	@SequenceGenerator(name = "cid_auto", sequenceName = "CLIENTES_SEQ")
	@Column(name = "CLIENTE_ID", columnDefinition = "NUMBER")
	private int clienteId;
	
	@Column(name = "NOMBRE", columnDefinition = "NVARCHAR2(30)")
	private String nombre;
	
	@Column(name = "DIRECCION", columnDefinition = "NVARCHAR2(30)")
	private String direccion;
	
	@Column(name = "TELEFONO", columnDefinition = "NVARCHAR2(10)")
	private String telefono;
	
	//Atributo relacional u objeto que estable una relacion con clientes, pero que no existe en la tabla
	//@OneToOne sirve para cuando hay solo un objeto para un solo cliente
	//@OneToOne(mappedBy="cliente")
	//private Asuntos asunto;
	
	//Cuando hay más de un asunto, necesitamos recibirlos aquí en una lista
	//y sería una relación 1 a muchos. Un cliente con muchos o varios asuntos
	@OneToMany(mappedBy="cliente")
	private List<Asuntos> asunto;
	
	// Constructores
	
	public Clientes () {
		
	}
	

	// Hibernate para poder trabajar requiere por lo menos el constructor con el ID
	public Clientes(int clienteId) {
		super();
		this.clienteId = clienteId;
	}


	// GETTERS Y SETTERS
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
	
	
	public List<Asuntos> getAsunto() {
		return asunto;
	}


	public void setAsunto(List<Asuntos> asunto) {
		this.asunto = asunto;
	}


	// Metodo toString
	@Override
	public String toString() {
		return "Clientes [clienteId = " + clienteId + ", nombre = " + nombre + ", direccion = " + direccion + ", telefono = "
				+ telefono + "]";
	}
	
	
}
