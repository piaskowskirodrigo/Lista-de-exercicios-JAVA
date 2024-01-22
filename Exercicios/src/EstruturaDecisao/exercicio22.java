//Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
//a. A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
//b. A mensagem "Reprovado", se a média for menor do que sete;
//c. A mensagem "Aprovado com Distinção", se a média for igual a dez.

package EstruturaDecisao;

import java.util.Scanner;

public class exercicio22 {
	
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe uma nota: ");
		double nota1 = scan.nextDouble();
		double nota2 = scan.nextDouble();
		
		double media = (nota1+nota2)/2;
		if (media == 10) {
			System.out.println("Aprovado com distincao");
		} else if (media < 7) {
			System.out.println("Reprovado");
		}else {
			System.out.println("Aprovado");
		}
			
		
		
	}

}
