package com.servicio;

import com.modelo.Cuentas;
import com.respuesta.Ticket;

public interface IMetodos {
	
	//Contiene m�todos abstractos
	//Aqu� declaramos las operacioens que la clase encargada 
	//de la l�gica tendr� que resolver
	
	//M�todo para consultar una cuenta de banco
	public Cuentas consultar(int numeroCuenta);
	
	//Retirar recursos de nuestra cuenta
	public Ticket retirar (int numeroCuenta, double monto);
	
	//Depositar recursos de nuestra cuenta
	public Ticket depositar (int numeroCuenta, double monto);
}
