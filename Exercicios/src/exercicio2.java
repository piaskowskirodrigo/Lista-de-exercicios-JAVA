//Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].

import java.util.Scanner;

public class exercicio2 {
	
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um numero: ");
		int num = scan.nextInt();
		
		
		System.out.println("O numero digitado acima e: " +num);
		scan.close();
		}

}
