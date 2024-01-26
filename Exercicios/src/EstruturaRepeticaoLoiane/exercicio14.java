/*Faça um programa que peça 10 números inteiros, calcule e mostre a
quantidade de números pares e a quantidade de números impares.*/

package EstruturaRepeticaoLoiane;

import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num;
		int par = 0;
		int impar = 0;
		
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Insira um numero: ");
			num = scan.nextInt();
			
			if (num % 2 == 0) {
				par++;
			}else {
				impar++;
			}
		}
		
		System.out.println("Quantidade de numeros pares: "+par);
		System.out.println("Quantidade de numeros impares: "+impar);
	}

}
