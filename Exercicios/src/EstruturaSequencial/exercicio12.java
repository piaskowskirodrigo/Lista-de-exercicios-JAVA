//Tendo como dados de entrada a altura de uma pessoa, 
//construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) – 58
package EstruturaSequencial;

import java.util.Scanner;

public class exercicio12 {
	
	public static void main(String [] args) {
		double altura,pesoIdeal;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira a altura: ");
		altura = scan.nextDouble();
		
		pesoIdeal = (altura * 72.7) - 58;
		
		System.out.println("Seu peso ideal e de: " + pesoIdeal);
		
		
	}

}
