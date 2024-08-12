package com.servicio;
import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface iMetodo {
	//Aqu� declaramos las operaciones que
	//la clase encargada de la l�gica
	//tendr� que resolver
    
	//Consultar la informaci�n de nuestra cuenta de banco
	public Cuenta consultar(int numeroCuenta);


	//Depositar recursos de nuestra cuenta
	public Ticket depositar(int numeroCuenta, double monto);
}
