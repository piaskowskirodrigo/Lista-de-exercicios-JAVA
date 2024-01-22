//Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.

package EstruturaDecisao;

import java.util.Scanner;

public class exercicio19 {

	public static void main(String[] args) {
		int num;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um numero");
		num = scan.nextInt();
		
		if (num > 0) {
			System.out.println("O numero e positivo");
		}else {
			System.out.println("O numero e negativo");
		}
	}

}
