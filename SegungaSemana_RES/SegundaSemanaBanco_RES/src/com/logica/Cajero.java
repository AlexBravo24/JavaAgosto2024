package com.logica;

import java.util.Date;
import java.util.Map;

import com.modelo.Cuenta;
import com.respuesta.Ticket;
import com.servicio.iMetodo;

public class Cajero implements iMetodo {
	
	//En el paquete com.logica se encuentra la clase 
	//encargada de resolver las operaciones
	//Vamos a declarar unos atributos de nuestro cajero
	private String sucursal;
	private Map<Integer,Cuenta> cuentas;
	private int folio=1;
	public Cajero(){}
	
	public Cajero(String sucursal, Map<Integer, Cuenta> cuentas) {
		super();
		this.sucursal = sucursal;
		this.cuentas = cuentas;
	}

	public Cuenta consultar(int numeroCuenta) {
		   Cuenta cuenta =null;
		   //Entonces asignamos antesiormente la cuenta si existe en el HashMap
		   cuenta = cuentas.get(numeroCuenta);
		   return cuenta;
		
	}
	public Ticket depositar(int numeroCuenta, double monto) {
		Ticket ticket=null;
		if(consultar(numeroCuenta)!=null)
		  {
			Cuenta cuenta = consultar(numeroCuenta);
	        if(monto>cuenta.getSaldomax()) {
	    	   System.out.println("El monto a depositar excede el máximo permitido en la cuenta para depositar");
	    	   return ticket;
	           }
	        else
	        	if(cuenta.getSaldo()+monto>cuenta.getSaldomax())
	        	  {
	            	System.out.println("El monto a depositar excede el máximo permitido en la cuenta para depositar");
	    	       return ticket;
	              }
	           else
	               {
	    	        cuenta.setSaldo(cuenta.getSaldo()+monto);
	    	        ticket=new Ticket(folio++,new Date(), cuenta.getUsuario(),cuenta.getSaldo(),sucursal,1);
	    	        }
		     }
		 else{
			  System.out.println("No hay una cuenta asociada a ese cliente");
			  return ticket;
		      }
		return ticket;
	}
		public Ticket retirar(int numeroCuenta, double monto) {
		   Ticket ticket = null;
		   //Vamos a buscar la cuenta y necesitamos hacer unas validaciones
		   //primero, si se encuentra o localiza la cuenta, la asignamos 
		   //para manipularla
		   if(consultar(numeroCuenta)!=null) {
			   Cuenta cuenta=consultar(numeroCuenta);
			   //Una vez que localizamos la cuenta para manipoular
			   //realizamos ciertas validaciones
			   if(monto>9000) {//Validamos si el monto excede el máximo a retirar del cajero
				 System.out.println("El monto excede el máximo de retiro permitido por el cajero");
				 return ticket;
			   }
			   else if(cuenta.getSaldo()<monto) {//Si el saldo es menor al monto a retirar
				 System.out.println("Saldo insuficiente para realizar el retiro");
				 return ticket;
			   }else if(cuenta.getSaldo()-monto<cuenta.getSaldoMin()) {
				   System.out.println("El retiro dejaría por debajo del saldo mínimo a la cuenta");
				   return ticket;
				   
			   }
			   else {//Si el retiro puede realizarse
				   //Actualizamos el monto de nuestra cuenta
				   cuenta.setSaldo(cuenta.getSaldo()-monto);//realizamos el retiro
				   //Entonces ahora ahora si emitimos un nuevo ticket
				   ticket=new Ticket(folio++,new Date(), cuenta.getUsuario(),cuenta.getSaldo(),sucursal,1);
				   return ticket;
			   }
		   }
	   else{
		    System.out.println("No existe una cuenta asociada a ese cliente");
			return ticket;
		   }
		   
	}
	             
}
