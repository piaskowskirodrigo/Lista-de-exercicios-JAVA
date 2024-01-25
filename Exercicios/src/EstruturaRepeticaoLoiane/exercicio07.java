/*Faça um programa que leia 5 números e informe o maior número*/

package EstruturaRepeticaoLoiane;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int maior = Integer.MIN_VALUE;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe um numero: ");
			int num = scan.nextInt();
			
			if (num > maior) {
				maior = num;
				
			}
			
		}
		System.out.println("O MAIOR numero digitado foi: "+maior);

	}

}
