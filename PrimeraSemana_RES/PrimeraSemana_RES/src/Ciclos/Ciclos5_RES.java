package Ciclos;

public class Ciclos5_RES {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float Saldo=1000;
        for (int i = 0; i < 12; i++)
        	Saldo*=1.02;
        System.out.printf("El saldo reinvertido al finalizar el mes en el nuevo mes durante un año es:%.2f  ",Saldo);
	}

}
