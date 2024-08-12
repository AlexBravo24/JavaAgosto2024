package com.servicio;

import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface IMetodos {
	// aqui declaramos las operaciones que la clase encargada de la logica tiene que 
	// resolver 
	
	// consultar saldo una cuenta de banco  
	public Cuenta CONSULTAR(int numeroCuenta); 
	
	// retirar recursos de nuestra cuenta 
	public Ticket retirar(int numeroCuenta, double monto); 
	
	// depositar recursos de nuestra cuenta 
	public Ticket depositar(int numeroCuenta, double monto); 
}
