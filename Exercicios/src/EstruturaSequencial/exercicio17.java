//aça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps), 
//calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).
package EstruturaSequencial;

import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o tamanho do arquivo em Mb: ");
		double tamanhoArquivo = scan.nextDouble();
		
		System.out.println("Informe a velocidade da internet em Mb: ");
		double velocidadeInternet = scan.nextDouble();
		
		double tempo = tamanhoArquivo / (velocidadeInternet/8);
		double tempoMinuto = tempo/60;
		
		System.out.println("O tempo de download e de: "+tempoMinuto+" Minutos");
				
	
	}

}
