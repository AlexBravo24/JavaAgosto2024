package com.logica;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

import java.util.Date;
import java.util.HashMap;

import com.Principal; 
import com.sun.javafx.collections.MappingChange.Map;

public class Cajero implements IMetodos{

	// en este paquete se encatga la clase encargada de resolver las operaciones 
	
	// atributos 
	private String sucursal; 
	private HashMap<Integer,Cuenta> cuentas; 
	
	// declarar una clase auxiliar para incrementar el folio en nuestro 
	// ticket 
	private int folio = 1; 
	
	// constructor
	public Cajero() {}
	
	

	public Cajero(String sucursal, HashMap<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}



	@Override
	public Cuenta CONSULTAR(int numeroCuenta) {

		Cuenta cuenta = null; 
		
		// se asigna la cuenta si es que existe en el HashMap 
		cuenta = cuentas.get(numeroCuenta); 
		
		return cuenta;
	}
	
	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		Cuenta cuenta = null; 
		Ticket t1 = null;
		Date fecha = new Date(); 
		
		cuenta = cuentas.get(numeroCuenta); 
		
		if (cuenta != null) {
			
			// add monto 
			cuenta.setSaldo(cuenta.getSaldo() + monto);
			// init obj ticket 
			t1 = new Ticket(this.folio,fecha,cuenta.getUsuario(),cuenta.getSaldo(),"naolinco",12);
			return t1; 
		}
		
		
		return null;
	}






	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		Cuenta cuenta = null; 
		cuenta =  cuentas.get(numeroCuenta); 
		Ticket t1 = null; 
		Date fecha = new Date(); 
		
		if(cuenta != null){// si existe la cuenta
			
			if (monto > cuenta.getSaldo()) { // si el monto es superior no puede retirar
				
				System.out.println("el monto a retirar es nayor al saldo disponible");
				return t1; 
			}
			else if(monto <= 0) {
				System.out.println("ingrese una cantidad valida");
				return t1; 
			}
			else {
				// subtract monto 
				cuenta.setSaldo(cuenta.getSaldo() - monto);
				
				// init obj ticket 
				t1 = new Ticket(this.folio,fecha,cuenta.getUsuario(),cuenta.getSaldo(),"naolinco",12);
				return t1; 
				
			}
			 
		}
		else {
			System.out.println("no existe la cuenta");
		}

		return null;
	}


	

}
