//Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. 
//Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros,
//que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.

package EstruturaSequencial;

import java.util.Scanner;

public class exercicio16 {
	
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a quantidade de metros quadrados a serem pintadas: ");
		double area = scan.nextDouble();
		
		double qtdLitros = area/3;
		double qtdLatas = qtdLitros/18;
		double valorTotal = qtdLatas * 80;
		
		System.out.println("A quantia de latas necessaria e de: "+qtdLatas);
		System.out.println("O valor total e de R$: "+valorTotal);
		
	}

}
