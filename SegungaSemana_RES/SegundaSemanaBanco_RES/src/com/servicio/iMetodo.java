package com.servicio;
import com.modelo.Cuenta;
import com.respuesta.Ticket;

public interface iMetodo {
	//Aquí declaramos las operaciones que
	//la clase encargada de la lógica
	//tendrá que resolver
    
	//Consultar la información de nuestra cuenta de banco
	public Cuenta consultar(int numeroCuenta);


	//Depositar recursos de nuestra cuenta
	public Ticket depositar(int numeroCuenta, double monto);
}
