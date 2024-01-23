//Faça um Programa que leia três números e mostre-os em ordem decrescente.

package EstruturaDecisao;

import java.util.Scanner;

public class exercicio26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe tres numeros: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		 
		int aux;
		
		if (num2>num1) {
			aux = num1;
			num1=num2;
			num2=aux;
			
		}
		if (num3>num1) {
			aux = num1;
			num1=num3;
			num3=aux;
		}
		if (num3>num2) {
			aux = num2;
			num2=num3;
			num3=aux;
		}
		
		System.out.println("Os numeros em ordens decrescente e: " +num1+","+num2+","+num3);
	}

}
