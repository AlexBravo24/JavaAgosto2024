package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		// Vamos a crear nuestra base de datos
		
		//Declaramos nuestro HashMpa
		
		Map<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();
		
		//Existen dos formas de agregar cuentas
		//Para agregar cuenta en nuestro HashMap
		//Creamos la cuenta y agregandola despues
		
		Cuenta alex = new Cuenta("Alex", 13000, 4000, 50000, "Debito"); 
		
		cuentas.put(1001, alex);
		
		//Agegamos cuentas en nuestro HashMap
		//Creando cuentas directamente
		cuentas.put(1002, new Cuenta("Berenice", 1000, 100, 100000, "Debito"));
		cuentas.put(1003, new Cuenta("Humberto", 10000, 100, 20000, "Debito"));
		cuentas.put(1004, new Cuenta("Pablo",500, 100, 100000, "Debito"));

		
		//Para recuperar el valor de ub objeto en mi HashMap
		//System.out.println(cuentas.get(1003)); Esto lo debe hacer mi cajero
		
		//Crear mi nuevo cajero
		Cajero angelopolis = new Cajero("Angelopolis", cuentas);
		
		//Probar el metodo consultar
		System.out.println(angelopolis.consultar(1001)); 
		
		//Probamos el METODO RETIRAR exitoso
		System.out.println(angelopolis.retirar(1001, 9000));
		System.out.println(angelopolis.retirar(1001, 1000));
		
		//Quiero retirar dinero en una cuenta que no existe
		System.out.println(angelopolis.retirar(1004, 1000));
		
		
		//Probamos el METODO DEPOSITAR EXITO
		System.out.println(angelopolis.depocitar(1001, 5000));
		System.out.println(angelopolis.depocitar(1003, 10000));
		
	}

}
