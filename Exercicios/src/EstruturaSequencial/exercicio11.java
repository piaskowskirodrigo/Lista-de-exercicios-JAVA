//Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
//a. o produto do dobro do primeiro com metade do segundo.
//b. a soma do triplo do primeiro com o terceiro.
//c. o terceiro elevado ao cubo.

package EstruturaSequencial;

import java.util.Scanner;

public class exercicio11 {
	public static void main(String[] args) {
		double num1,num2,num3,contaA,contaB,contaC;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira um numero inteiro: ");
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
		System.out.println("Insira um numero real: ");
		num3 = scan.nextDouble();
		
		contaA = (num1 * 2) * (num2 / 2);
		contaB = (num1 * 3) + num3;
		contaC = (num3*num3*num3);
		
		System.out.println("o produto do dobro do primeiro com metade do segundo e: " +contaA);
		System.out.println("a soma do triplo do primeiro com o terceiro: " +contaB);
		System.out.println("o terceiro elevado ao cubo e: : " +contaC);
		
		scan.close();
		
	
	}

}
