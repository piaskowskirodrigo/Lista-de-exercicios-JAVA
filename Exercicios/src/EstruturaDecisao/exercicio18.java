//Faça um Programa que peça dois números e imprima o maior deles.

package EstruturaDecisao;

import java.util.Scanner;

public class exercicio18 {
	
	public static void main(String [] args) {
		int num1,num2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um numero: ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		
		if (num1 > num2) {
			System.out.println("O numero maior e: "+num1);
		}else {
			System.out.println("O numero maior e: "+ num2);
		}
	}

}
