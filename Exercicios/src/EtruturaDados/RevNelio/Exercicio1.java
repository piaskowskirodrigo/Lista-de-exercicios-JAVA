package EtruturaDados.RevNelio;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do vetor: ");
		int n = scan.nextInt();
		
		double[] vetor = new double[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Informe o valor do vetor " +(i+1));
			vetor[i]= scan.nextDouble();
		}
		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma+= vetor[i];
		}
		double media = soma/n;
		
		System.out.println("A media dos vetores e: "+media);

	}

}
