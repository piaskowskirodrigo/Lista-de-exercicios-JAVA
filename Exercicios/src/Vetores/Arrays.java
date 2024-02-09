package Vetores;

public class Arrays {

	public static void main(String[] args) {
		double [] temperaturas = new double[365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 31;
		temperaturas[2] = 35.7;
		temperaturas[3] = 34;
		temperaturas[4] = 32.3;
		
		System.out.println("O valor da temperatura do dia 1 e: "+temperaturas[0]);
		System.out.println("O tamanho do array: "+temperaturas.length);
		System.out.println("Valores do array: "+temperaturas);
		
		for(int i =0; i < temperaturas.length; i++) {
			System.out.println("O valor da temperatura do dia "+ (i+1)+" e: "+temperaturas[i]);
	}
	}
}
