//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
//Calcule e mostre o total do seu salário no referido mês.


import java.util.Scanner;

public class exercicio8 {
	
	public static void main(String[] args) {
		
		double valorHora, numeroHoras, salario;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual e o valor que voce ganha por hora? ");
		valorHora = scan.nextDouble();
		
		System.out.println("Qualntas horas voce trabalha por mes? ");
		numeroHoras = scan.nextDouble();
		
		salario = valorHora * numeroHoras;
		
		System.out.println("seu salario mensal e de: "+ salario);
		
		
	}

}
