/**Faça um programa que peça uma nota, entre zero e dez. Mostre uma
mensagem caso o valor seja inválido e continue pedindo até que o
usuário informe um valor válido.*/
package EstruturaRepeticaoLoiane;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe uma nota de 0 a 10: ");
		int nota = scan.nextInt();
		
		while( nota > 10 || nota < 0) {
			System.out.println("Nota invalida, tente novamente: ");
			System.out.println("Informe uma nota de 0 a 10: ");
			nota = scan.nextInt();
		}
		
		System.out.println("Obrigado");
		
	}

}
