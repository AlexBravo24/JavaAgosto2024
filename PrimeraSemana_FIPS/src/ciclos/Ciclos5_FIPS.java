package ciclos;

public class Ciclos5_FIPS {

	public static void main(String[] args) {
		// Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% 
		//de inter�s mensual. �Cu�l ser� la cantidad de dinero que esta persona 
		//tendr� al cabo de un a�o si todo el dinero lo reinvierte
        double monto = 1000.00;

        // Tasa de inter�s mensual (2%)
        double tasaInteresMensual = 0.02;

        // N�mero de meses (1 a�o)
        int numeroDeMeses = 12;

        // Calcular el monto final despu�s de un a�o
        for (int mes = 1; mes <= numeroDeMeses; mes++) {
            // Aplicar el inter�s al monto actual
            monto += monto * tasaInteresMensual;
        }

        // Imprimir el monto final
        System.out.printf("El monto total despu�s de un a�o es: $%.2f\n", monto);
    }
}