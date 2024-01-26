/*Faça um programa que peça dois números, base e expoente, calcule e
mostre o primeiro número elevado ao segundo número. Não utilize a
função de potência da linguagem.*/

package EstruturaRepeticaoLoiane;

import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira um numero: ");
		int base = scan.nextInt();
		System.out.println("Insira outro numero: ");
		int pot = scan.nextInt();
		int resultado = base;
		
		for (int i = 1; i < pot; i++) {
			resultado *= base;
			
		}
		System.out.println("O resultado e: "+resultado);
	}

}
