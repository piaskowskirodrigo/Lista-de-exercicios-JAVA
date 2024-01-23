/*As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para 
 * desenvolver o programa que calculará os reajustes. Faça um programa que recebe o salário de um colaborador e o 
 * reajuste segundo o seguinte critério, baseado no salário atual:
a. Salários até R$ 280,00 (incluindo): aumento de 20%
b. Salários entre R$ 280,00 e R$ 700,00: aumento de 15%
c. Salários entre R$ 700,00 e R$ 1500,00: aumento de 10%
d. Salários de R$ 1500,00 em diante: aumento de 5%
Após o aumento ser realizado, informe na tela:
e. O salário antes do reajuste;
f. O percentual de aumento aplicado;
g. O valor do aumento;
h. O novo salário, após o aumento.*/

package EstruturaDecisao;

import java.util.Scanner;

public class exercicio28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe seu salario: ");
		double salario = scan.nextDouble();
		double salario20 = salario * 0.2;
		double salario15 = salario * 0.15;
		double salario10 = salario * 0.10;
		double salario5 = salario * 0.05;
		
		if (salario <= 280) {
			System.out.println("Seu salario atual e: "+salario);
			System.out.println("Voce ganhou um aumento de 20%");
			System.out.println("O valor do aumento e de: "+ salario20);
			System.out.println("Seu novo salario e de: "+(salario + salario20));
		}else if (salario > 280 && salario <700) {
			System.out.println("Seu salario atual e: "+salario);
			System.out.println("Voce ganhou um aumento de 15%");
			System.out.println("O valor do aumento e de: "+ salario15);
			System.out.println("Seu novo salario e de: "+(salario + salario15));
		}else if (salario >= 700 && salario <1500) {
			System.out.println("Seu salario atual e: "+salario);
			System.out.println("Voce ganhou um aumento de 10%");
			System.out.println("O valor do aumento e de: "+ salario10);
			System.out.println("Seu novo salario e de: "+(salario + salario10));
		}else if (salario >= 1500) {
			System.out.println("Seu salario atual e: "+salario);
			System.out.println("Voce ganhou um aumento de 5%");
			System.out.println("O valor do aumento e de: "+ salario5);
			System.out.println("Seu novo salario e de: "+(salario + salario5));
		}
		
		
	}

}
