package com.servicio;

import com.modelo.Cuentas;
import com.respuesta.Ticket;

public interface IMetodos {
	
	//Contiene métodos abstractos
	//Aquí declaramos las operacioens que la clase encargada 
	//de la lógica tendrá que resolver
	
	//Método para consultar una cuenta de banco
	public Cuentas consultar(int numeroCuenta);
	
	//Retirar recursos de nuestra cuenta
	public Ticket retirar (int numeroCuenta, double monto);
	
	//Depositar recursos de nuestra cuenta
	public Ticket depositar (int numeroCuenta, double monto);
}
