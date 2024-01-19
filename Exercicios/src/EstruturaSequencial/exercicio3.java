//Faça um Programa que peça dois números e imprima a soma.
package EstruturaSequencial;

import java.util.Scanner;

public class exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira um numero: ");
		int num1 = scan.nextInt();
		
		System.out.println("Insira outro numero: ");
		int num2 = scan.nextInt();
		
		int soma = num1 + num2;
		
		System.out.println("A soma dos dois numeros e: " +soma);
		scan.close();
		
		
	}

}
