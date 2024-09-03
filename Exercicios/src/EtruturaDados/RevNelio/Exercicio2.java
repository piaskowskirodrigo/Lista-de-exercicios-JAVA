package EtruturaDados.RevNelio;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Quantos numeros voce vai digitar? ");
		int n = scan.nextInt();
		int soma = 0;
		int[] vetor = new int[n];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o numero "+(i+1));
			vetor[i]=scan.nextInt();
			soma+= vetor[i];
		}
		double media = soma/n;
		System.out.println();
		System.out.print("Valores = ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " , ");
		}
		System.out.println();
		System.out.println("A soma dos valores e: " +soma);
		System.out.println("A media dos valores e: "+media);
	}

}
