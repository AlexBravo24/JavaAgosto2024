package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //Una vez que una clase es abstracta no podemos crear instancias de ella pero si puedo asignar como si fuera un nuevo empleado y a esto le llamaríamos polimorfismo de asignación
		Persona persona1 = new Empleado("Pedro",30,"Masculino", "fat678120", 25000, "Matutino");
		Empleado empleado1 = new Empleado("Fátima",20, "Femenino", "fat678120", 25000, "Matutino");
		System.out.println(empleado1);
		Gerente gerente = new Gerente("Nohemí",30,"Femenino","OURN9408131M5",50000,"Matutino","Cobranza","Pachuca","Seguro de gastos médicos mayores, Atención Dental, Atención Psicológica, Guardería");
		System.out.println(gerente);
	empleado1.comer();
	gerente.comer();
	//Si yo quiero ver el saludo en pantalla tengo que guardar el saludo en un String y mandarlo a visualizar con Syso
	persona1.saludar();
	persona1.comer("Pizza");
	persona1.comer("Pizza",4);
	//Probando el método abstracto ya definido en la clase Empleado
	persona1.sumar(5, 15);
	}

}
