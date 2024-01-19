//Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
//a. Para homens: (72.7*h) - 58
//b. Para mulheres: (62.1*h) - 44.7

package EstruturaSequencial;

import java.util.Scanner;

public class exercicio13 {
	
	public static void main(String [] args) {
		double altura,pesoIdealHomem,pesoIdealMulher;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira a altura: ");
		altura = scan.nextDouble();
		
		pesoIdealHomem = (altura * 72.7) - 58;
		pesoIdealMulher = (altura * 62.1) - 44.7;
		
		System.out.println("Seu peso Masculino ideal e de: " + pesoIdealHomem);
		System.out.println("Seu peso Feminino ideal e de: " + pesoIdealMulher);
		
		
	}

}