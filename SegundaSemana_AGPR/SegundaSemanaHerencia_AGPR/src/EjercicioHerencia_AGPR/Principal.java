package EjercicioHerencia_AGPR;

public class Principal {

	public static void main(String[] args) {
		
		Persona persona1=new Persona("Juan", 59, "Masculino");
		System.out.println(persona1);
		
		Paciente paciente1=new Paciente("Mar�a", 60, "Femenino", "A+", "5 de junio", "101A", "Fractura");
		System.out.println(paciente1);
		
		Paciente paciente2=new Paciente("Pedro", 15, "Masculino", "O-", "6 de junio", "104B", "Apendicitis");
		System.out.println(paciente2);
		
		//A Mar�a la movieron al cuarto 102A
		paciente1.setCuartoAsignado("102A");
		System.out.println(paciente1);

	}

}
