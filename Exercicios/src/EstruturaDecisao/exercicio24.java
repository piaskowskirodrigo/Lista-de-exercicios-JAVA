//Faça um Programa que leia três números e mostre o maior e o menor deles.


package EstruturaDecisao;

import java.util.Scanner;

public class exercicio24 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe tres numeros: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		int maiorNumero = 0;
		int menorNumero = 0;
		
		if (num1 > num2) {
			maiorNumero = num1;
			menorNumero = num2;
		}else {
			maiorNumero = num2;
			menorNumero = num1;
		}
		if (num3 >maiorNumero) {
			
			maiorNumero = num3;
			
		}
		if (num3 <maiorNumero) {
			
			menorNumero = num3;
		}
		System.out.println("O maior numro e : "+maiorNumero);
		System.out.println("O menor numero e : "+menorNumero);
	}

}

