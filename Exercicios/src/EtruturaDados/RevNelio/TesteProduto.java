package EtruturaDados.RevNelio;

import java.util.Scanner;

public class TesteProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o numero de produtos: ");
		int n = scan.nextInt();
		
		Produto[] vetor = new Produto[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Informe o nome do produto " +(i+1));
			String name = scan.next();
			System.out.println("Informe o preco do produto " +(i+1));
			double preco = scan.nextDouble();
			vetor[i] = new Produto(name, preco);
		}
		
		double soma = 0;
		for (int i = 0; i < n; i++) {
			soma += vetor[i].getPreco();
		}
		double media = soma/n;
		
		System.out.println("Media dos produtos e: "+media);
		
	}

}
