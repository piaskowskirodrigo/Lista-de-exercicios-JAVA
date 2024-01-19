//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total 
//do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
//a. Salário bruto.
//b. Quanto pagou ao INSS.
//c. Quanto pagou ao sindicato.
//d. O salário líquido.

package EstruturaSequencial;

import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {
		
	double valorHora, numeroHoras, salarioBruto,inss,sindicato,impostoRenda,salarioLiquido;
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Qual e o valor que voce ganha por hora? ");
			valorHora = scan.nextDouble();
			
			System.out.println("Qualntas horas voce trabalha por mes? ");
			numeroHoras = scan.nextDouble();
			
			salarioBruto = valorHora * numeroHoras;
			impostoRenda = salarioBruto * 0.11;
			inss = salarioBruto * 0.08;
			sindicato = salarioBruto * 0.05;
			
			salarioLiquido = salarioBruto - impostoRenda - inss - sindicato;
			
			
			System.out.println("Salário Bruto : R$: "+ salarioBruto);
			System.out.println("IR (11%) "+ impostoRenda);
			System.out.println("INSS (8%) : R$ "+ inss);
			System.out.println("Sindicato ( 5%) : R$ "+ sindicato);
			System.out.println("Salário Liquido : R$ "+ salarioLiquido);

	}

}
