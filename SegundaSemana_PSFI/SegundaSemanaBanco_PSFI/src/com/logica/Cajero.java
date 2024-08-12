package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.IMetodos;

public class Cajero implements IMetodos {

	
	//En el paquete co.logica se encuentra la clase
	//encargada de resolver lasm operaciones
	
	//Vamos a declarar unos atributos de nuestro cajero
	private String sucursal; 
	private Map<Integer, Cuenta> cuentas; //Se diria que es nuestra BD
	
	//Declarar una variable auxiliar para incrementar
	//el folio en nuestro Ticket
	private int folio=1;
	
	public Cajero() {}
	
	
	
	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}

	
	

	@Override
	public Cuenta consultar(int numeroCuenta) {
		// TNecesitamos crear una cuenta vacia incialmente
		Cuenta cuenta = null;
		
		//Entonces asignamos posterior mente la cuenta si existe en el HashMap
		cuenta = cuentas.get(numeroCuenta);
		
		return cuenta;
	}

	
	
	
	@Override
	public Ticket retirar(int numeroCuenta, double monto) {
		
		Ticket ticket = null; 
		
		//vamos a buscar la cuenta y necesitamos hacer una validaciones
		//Primero, si se encuentra o localiza la cuenta, la asignamos
		
		if(consultar(numeroCuenta) !=null) {
			Cuenta cuenta = consultar(numeroCuenta);
			
			//Una vez localizamos la cuenta para manipular 
			//Realizamos ciertas validaciones 
			
			if(monto>9000) { //Validamos si el monto excede el maximo que limita el cajero
				System.out.println("El monto excede el maximo permitido por el cajero");
				return ticket; 
			} else if (cuenta.getSaldo()<monto) { //Si el saldo es menos al monto a retirar
				System.out.println("Saldo insifuciente para realizar el retiro");
				return ticket;
			}else if (cuenta.getSaldo()-monto<cuenta.getSaldoMin()) {
				System.out.println("El retiro dejaria por debajo del minimo a la cuenta");
				return ticket; 
			}else {//si el retiro puede realizarse
				//actualizamos el saldo de nuestra cuenta
				cuenta.setSaldo(cuenta.getSaldo()-monto); //realizamos el retiro
				//entonces ahora si emitimos un nuevo tikect
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1); 
				return ticket; 
			}
		}else {
			
		System.out.println("No existe una cuenta asociada a ese cliente");
		return ticket;
			
		}
	}

	
	
	@Override
	public Ticket depocitar(int numeroCuenta, double monto) {
		Ticket ticket = null; 
		
		if(consultar(numeroCuenta) !=null) {
			Cuenta cuenta = consultar(numeroCuenta);
			//Validaciones
			if (monto>cuenta.getSaldoMax()) {
				System.out.println("El monto a depositar excede el maximo permitido en la cuenta");
				return ticket;
			}else if(cuenta.getSaldo()+monto>cuenta.getSaldoMax()) {
				System.out.println("El saldo el maximo permitido en la cuenta");
				return ticket;
			}else {
				cuenta.setSaldo(cuenta.getSaldo()+monto);
				ticket = new Ticket(folio++, new Date(), cuenta.getUsuario(), cuenta.getSaldo(), sucursal, 1);
				return ticket;
				
			}
		}else {
			System.out.println("No hay una cuenta asociada a ese cliente");
			return ticket;
		}
		
	}
	
	

}
