/*Desenvolva um gerador de tabuada, capaz de gerar a tabuada de
qualquer número inteiro entre 1 a 10. O usuário deve informar de qual
numero ele deseja ver a tabuada. A saída deve ser conforme o
exemplo abaixo:
*/

package EstruturaRepeticaoLoiane;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um numero inteiro: ");
		int num = scan.nextInt();

		for (int i = 1; i < 11; i++) {
			
			System.out.println(num+"X"+i+"="+num*i);
		}
	}

}
