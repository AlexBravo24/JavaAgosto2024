package ciclos;

public class Ciclos5_AGPR {

	public static void main(String[] args) {
		/*. Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2%
de inter�s mensual. �Cu�l ser� la cantidad de dinero que esta persona
tendr� al cabo de un a�o si todo el dinero lo reinvierte?*/
		
		float interes=0.02f;
		
		float montoActual=1000f;
				
		for (int i = 1; i <12; i++) {
			montoActual += montoActual*interes;			
		}
		System.out.println("Al cabo de un a�o tendra: "+montoActual);


	}

}
