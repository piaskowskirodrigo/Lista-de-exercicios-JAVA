//João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
//Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo 
//(50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a 
//variável peso (peso de peixes) e calcule o excesso. Gravar na variável “excesso” a quantidade de quilos além do 
//limite e na variável multa o valor da multa que João deverá pagar. Imprima os dados do programa com as mensagens 
//adequadas.

package EstruturaSequencial;

import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		
		Double pesoPeixe,pesoRegulamento, multa,excesso,valorFinal;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira o peso do peixe: ");
		pesoPeixe = scan.nextDouble();
		
		pesoRegulamento = 50.0;
		excesso = pesoPeixe - pesoRegulamento;
		multa = excesso * 4.0;
		
		
		System.out.println("O excesso de peso do peixe e de: "+excesso +" quilos");
		System.out.println("O valor da multa e de: " +multa+" reais");
		
		

	}

}
