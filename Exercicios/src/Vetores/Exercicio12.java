/*Criar um vetor A com 10 elementos inteiros. Implementar um programa
que defina e escreva a soma de todos os elementos armazenados
neste vetor.*/

package Vetores;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[4];
		int soma = 0;
	
		for(int i =0; i<vetorA.length;i++) {
			System.out.println("Entre com o valor da posicao "+i);
			vetorA[i] = scan.nextInt();
		}
		System.out.print("Vetor A = ");
		for(int i=0; i<vetorA.length;i++) {
			System.out.print(vetorA[i]+  " ");
		}

		for(int i=0; i<vetorA.length;i++) {
			soma += vetorA[i];
			}
		System.out.print("Soma dos vetores: "+soma);
		}
		
		
}

