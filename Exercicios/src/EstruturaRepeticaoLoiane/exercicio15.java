/*Fibonacci*/

package EstruturaRepeticaoLoiane;

import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o N-esimo termo: ");
		int num = scan.nextInt();
		int primeiro = 1;
		int segundo = 1;
		int aux;
		
		for (int i = 3; i <= num; i++) {
			aux = primeiro + segundo;
			primeiro = segundo;
			segundo = aux;
			
			System.out.println(aux);
		}
		
	}

}
