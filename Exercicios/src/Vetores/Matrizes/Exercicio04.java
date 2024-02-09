/*Faça um programa para armazenar em uma matriz os
compromissos de uma agenda pessoal. Cada dia do mês deve
conter 24 horas, onde para cada uma destas 24 horas podemos
associar um tarefa específica (compromisso agendado). O
programa deve ter um menu onde o usuário indica o dia do mês
que deseja alterar e a hora, entrando em seguida com o
compromisso, ou então, o usuário pode também consultar a
agenda, fornecendo o dia e a hora para obter o
compromisso armazenado.*/

package Vetores.Matrizes;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		String [][] compromisso = new String[31][24];
		Scanner scan = new Scanner(System.in);
		boolean sair = false;
		byte opcao;
		while (!sair) {
			System.out.println("Digite 1 para adicionar compromisso.");
			System.out.println("Digite 2 para verificar compromisso.");
			System.out.println("Digite 0 para sair.");
			opcao = scan.nextByte();
			
			if (opcao == 1) {
				System.out.println("Digite o dia de 1 a 31: ");
				int data = scan.nextInt();
				
				System.out.println("Digite a hora formato 24h : ");
				int hora = scan.nextInt();
				System.out.println("Digite o compromisso do dia nesta hora : ");
				compromisso[data][hora] = scan.next();
				
					}
				
				
			
			if (opcao == 2) {
				for (int i = 0; i < compromisso.length; i++) {
					for (int j = 0; j < compromisso[i].length; j++) {
						System.out.print(compromisso[i][j]+" ");
						
					}
					System.out.println();
				}
			}
			
			if (opcao == 0) {
				sair = true;
				
			}
		}
	}
}
		
	
	
		

	


