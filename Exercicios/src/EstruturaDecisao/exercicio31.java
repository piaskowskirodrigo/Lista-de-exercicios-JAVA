/*Faça um Programa que leia um número e exiba o dia correspondente da semana. 
 * (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.*/

package EstruturaDecisao;

import java.util.Scanner;

public class exercicio31 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um numero de 1 a 7: ");
		char numero = scan.next().charAt(0);		
		switch (numero) {
		case '1': {
			System.out.println("Domingo");
			break;
		}
		case '2': {
			System.out.println("Segunda");
			break;
		}
		case '3': {
			System.out.println("Terca");
			break;
		}
		case '4': {
			System.out.println("Quarta");
			break;
		}
		case '5': {
			System.out.println("Quinta");
			break;
		}
		case '6': {
			System.out.println("Sexta");
			break;
		}
		case '7': {
			System.out.println("Sabado");
			break;
		}
		default: 
			System.out.println("Numero invalido");
		
	}

}
}