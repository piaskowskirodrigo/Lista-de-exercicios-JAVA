/*Faça um programa que calcule o fatorial de um número inteiro
fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120*/

package EstruturaRepeticaoLoiane;


import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um numero: ");
		int num = scan.nextInt();
		int fatorial = 1;
		
		for (int i = num; i > 1; i--) {
			
			fatorial *= i;
			//System.out.println(i);

			

			
		}
		System.out.println("O fatorial do numero "+num +" e igual a: "+fatorial);

	}

}
