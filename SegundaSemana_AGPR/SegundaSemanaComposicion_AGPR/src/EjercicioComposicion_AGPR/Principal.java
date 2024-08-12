package EjercicioComposicion_AGPR;

public class Principal {

	public static void main(String[] args) {
	
		Maceta barro =new Maceta("Barro", 100, "Mediana");
		Taxonomia orquideaTax =new Taxonomia("Magnoliophyta", "Liliopsida");
		Cuidado orquideaCuidado= new Cuidado("Riego 1 vez a la semana", "Sombra", "Lixiviado de lombriz");
		
		ArregloFloral orquidea= new ArregloFloral("Orquidea", "Tierra de hoja", "$400", orquideaTax, barro, orquideaCuidado);
		
		System.out.println(orquidea);


	}

}
