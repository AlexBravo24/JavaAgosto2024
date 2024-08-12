package com;

import java.util.HashMap;
import java.util.Map;

import com.logica.Cajero;
import com.modelo.Cuenta;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vamos a crear nuestra base de datos
		//Declaramos nuestro HashMap
		Map<Integer,Cuenta> cuentas = new HashMap<Integer,Cuenta>();
		//Para agregar cuentas en nuestro HashMap podemos hacerlo de dos formas:
		//Creando la cuenta y agregándola después
		Cuenta alex = new Cuenta ("Alex",13000,4000,50000,"Debito");
		cuentas.put(1001, alex);
		
		//Creando las cuentas directamente en el HashMap
		cuentas.put(1002, new Cuenta("Berenice",1000,100,15000,"Debito"));
		cuentas.put(1003, new Cuenta("Humbertoe",10000,1000,20000,"Debito"));
		cuentas.put(1004, new Cuenta("Pablo",500,100,10000,"Debito"));
		System.out.println(cuentas.get(1003));
		Cajero angelopolis = new Cajero("Angelopolis",cuentas);
		System.out.println(angelopolis.consultar(1006));
		
		//Probar el método retirar exitoso
		

		System.out.println(angelopolis.retirar(1001, 9000));
		System.out.println(angelopolis.retirar(1001, 1000));
		//quiero retirar dinero de una cuenta que no existe
		System.out.println(angelopolis.retirar(1004, 1000));
		
		//Probar el método depositar exitoso
		System.out.println(angelopolis.depositar(1001, 5000));
	}

}
