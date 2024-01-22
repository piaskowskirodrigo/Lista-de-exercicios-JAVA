//Faça um Programa que leia três números e mostre o maior deles.

package EstruturaDecisao;

import java.util.Scanner;

public class exercicio23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um numero: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if (num1>num2 && num1 >num3) {
			System.out.println("O numero maior e o: "+num1);
			
		}else if (num2>num1 && num2 >num3) {
			System.out.println("O numero maior e o: "+num2);
		} else {
			System.out.println("O numero maior e o: "+num3);
		}

	}

}
