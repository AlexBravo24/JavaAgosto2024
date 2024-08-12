package com;


import java.util.Date;
import java.util.HashMap;
import com.respuesta.Ticket; 
import com.logica.Cajero;
import com.modelo.Cuenta;
import com.sun.javafx.collections.MappingChange.Map;

public class Principal {
	
	public static void main(String[] args) {
		
		// vamos a crear nuestra base de datos
		
		// crear nuestro HashMap 
		HashMap <Integer,Cuenta> cuentas = new HashMap<Integer,Cuenta>(); 
		
		// created obj cuenta 
		Cuenta alex = new Cuenta ("Alex",2000,2000,2000,"ahorros"); 
		
		// add hashMap
		cuentas.put(1001, alex); 
		
		// add hashMap
		cuentas.put(1002, new Cuenta("ximena",1000,2000,3000,"inversion")); 
		cuentas.put(1003, new Cuenta("Santiago",1000,2000,3000,"inversion")); 
		cuentas.put(1004, new Cuenta("Napoleon",1000,2000,3000,"inversion")); 

		// init new cajero
		Cajero cajeroNaolincoCenter = new Cajero("centro",cuentas); 
		
		// depositar 
		Ticket TicketResultado = cajeroNaolincoCenter.depositar(1002, 200); 
		System.out.println(TicketResultado);
		
		// retirar efectivo
		System.out.println();
		System.out.println("Retirar efectivo");
		
		TicketResultado = cajeroNaolincoCenter.retirar(1002, 300); 
		System.out.println(TicketResultado);



		


		
		

		

		
	}

}
