/*Faça um programa que leia 5 números e informe a soma e a média
dos números.*/

package EstruturaRepeticaoLoiane;


import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for (int i = 1; i < 5; i++) {
			System.out.println("Informe 5 numeros: ");
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			int num3 = scan.nextInt();
			int num4 = scan.nextInt();
			int num5 = scan.nextInt();
			
			
			int soma = num1+num2+num3+num4+num5;
			int media = (num1+num2+num3+num4+num5) / 5;
			
			
			System.out.println("A soma dos numeros e: "+soma);
			System.out.println("A media dos numeros e: "+media);
			
			
		}

	}

}
