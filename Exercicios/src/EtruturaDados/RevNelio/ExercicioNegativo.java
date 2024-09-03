package EtruturaDados.RevNelio;

import java.util.Scanner;

public class ExercicioNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Quantos numeros voce vai digitar? ");
		int n = scan.nextInt();
		int vetor[] = new int[n];

		
		for (int i = 0; i < vetor.length; i++) {
			
			System.out.println("Digite o numero "+(i+1));
			vetor[i] = scan.nextInt(); 
			
		}
		
		System.out.println("Numeros impares: ");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < 0) {
				System.out.print(vetor[i]);
			}
		}
			
	}

}
