package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuentas;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos{
	
	//Esta es la clase que va a tener que resolver la lógica
	// de la interfase IMetodos. Importamos los métodos no implementados
	//En el paquete com.logica se encuentra la clase encargada
	//de resolver las operaciones
	
	//Vamos a declarar unos atributos a nuestro cajero
	private String sucursal;
	private Map<Integer, Cuentas> cuentas;
	
	//Declarar una variable auxiliar para incrementar el folio
	//en nuestro ticket
	private int folio=1;
	
	public Cajero() {}
	
	//Creamos el constructor con todos los campos pero no seleccionamos
	//el de folio porque solo lo hicimos para tener una cuenta iniciada en 0.

	public Cajero(String sucursal, Map<Integer, Cuentas> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}


	@Override
	public Cuentas consultar(int numeroCuenta) {
		// Necesitamos crear una cuenta vacía inicialmente
		Cuentas cuenta=null;
		
		//Entonces asignamos posteriormente la cuenta si existe en el HashMap
		cuenta = cuentas.get(numeroCuenta);
		return cuenta;
	}

	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		Ticket ticket = null;
		//Vamos a buscar la cuenta y necesitamos hacer unas validaciones
		//Primero, si se encuentra o localiza la cuenta, la asignamos para manipularla
		if (consultar(numeroCuenta) != null) {
			Cuentas cuenta= consultar (numeroCuenta);
			// UNa vez localizamos la cuenta para manipular, 
			//realizamos ciertas validaciones
			if (monto>9000) { //validamos si el monto excede el maximo del cajero
			System.out.println("El monto excede el máximo permitido por el cajero");
			return ticket;
			}
			else if (cuenta.getSaldo()<monto) {
				System.out.println("Saldo insufiente para realizar operación");
				return ticket;
			}
			else if(cuenta.getSaldo()-monto<cuenta.getSaldoMin()) {
				System.out.println("El retiro dejaría por debajo del mínimo de la cuenta");
			}
			else {//Si el retiro puede realizarse
				//Actualizamos el saldo de nuestra cuenta
				cuenta.setSaldo(cuenta.getSaldo()-monto);
				ticket=new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}
		} 
		else {
			System.out.println("No existe una cuenta asociada a ese cliente");
			return ticket;
		}
		return ticket;
	}

	@Override
	public Ticket depositar(int numeroCuenta, double monto) {
		Ticket ticket=null;
		
		if (consultar(numeroCuenta)!= null) {
			Cuentas cuenta= consultar(numeroCuenta);
			//Validaciones
			if (monto>cuenta.getSaldoMax()) {
				System.out.println("El monto excede el monto máximo permitido");
				return ticket;
			}
			else if (cuenta.getSaldo() + monto> cuenta.getSaldoMax()) {
				System.out.println("El saldo excedería el máximo permitido");
				return ticket;
			}
			else {
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
			}
		}
		else {
			System.out.println("NO hay una cuenta asociada a ese cliente");
				return ticket;
			}
	}
}
