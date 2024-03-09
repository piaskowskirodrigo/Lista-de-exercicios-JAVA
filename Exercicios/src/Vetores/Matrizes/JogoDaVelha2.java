package Vetores.Matrizes;

import java.util.Scanner;

public class JogoDaVelha2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[][] jogoDaVelha2 = new char[3][3];
		char sinal = ' ';
		boolean ganhar = false;
		int linha = 0;
		int coluna = 0;
		int jogada = 1;
		
		System.out.println("-----JOGO DA VELHA----");
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		
		while(!ganhar) {
			//verifica vez do jogador1
			if(jogada%2==1) {
				System.out.println("Vez do jogador 1");
				sinal = 'X';	
			}else {
				System.out.println("Vez do jogador 2");
				sinal = 'O';
			}
			
			//verifica linha valida
			boolean validaLinha = false;
			while(!validaLinha) {
				System.out.println("Escolha a linha 1 ou 2 ou 3");
				linha = scan.nextInt();
				if(linha >= 1 && linha <=3) {
					validaLinha = true;
				}else {
					System.out.println("Linha invalida, tente novamente linha 1 ou 2 ou 3");
				}
			}
			//verifica linha valida
			boolean validaColuna = false;
			while(!validaColuna) {
				System.out.println("Escolha a coluna 1 ou 2 ou 3");
				coluna = scan.nextInt();
				if(coluna >= 1 && coluna <= 3) {
					validaColuna = true;
				}else {
					System.out.println("Coluna invalida, tente novamente coluna 1 ou 2 ou 3");
				}
			}
			//diminui 1 da linha e coluna para nao confundir o leitor com a matriz
			linha--;
			coluna--;
			
			//verific jogada repitida
			
			if (jogoDaVelha2[linha][coluna] == 'X' || jogoDaVelha2[linha][coluna] == 'O' ) {
				System.out.println("Jogada ja realizada, tente novamente ");
			}else {
				jogoDaVelha2[linha][coluna] = sinal;
				jogada++;
			}
			
			//imprime tabuleiro
			for (int i = 0; i < jogoDaVelha2.length; i++) {
				for (int j = 0; j < jogoDaVelha2[i].length; j++) {
					System.out.print(jogoDaVelha2[i][j] + " | ");
				}
				System.out.println();
				
			}
			
			//verifica quem ganhou o jogo
			if (jogoDaVelha2[0][0] == 'X' && jogoDaVelha2[0][1] == 'X' && jogoDaVelha2[0][2] == 'X' || //linha  0
				jogoDaVelha2[1][0] == 'X' && jogoDaVelha2[1][1] == 'X' && jogoDaVelha2[1][2] == 'X' || //linha  1	
				jogoDaVelha2[2][0] == 'X' && jogoDaVelha2[2][1] == 'X' && jogoDaVelha2[2][2] == 'X' || //linha  2	
				jogoDaVelha2[0][0] == 'X' && jogoDaVelha2[1][0] == 'X' && jogoDaVelha2[2][0] == 'X' || //coluna 0	
				jogoDaVelha2[0][1] == 'X' && jogoDaVelha2[1][1] == 'X' && jogoDaVelha2[2][1] == 'X' || //coluna 1
				jogoDaVelha2[0][2] == 'X' && jogoDaVelha2[1][2] == 'X' && jogoDaVelha2[2][2] == 'X' || //coluna 1
				jogoDaVelha2[0][0] == 'X' && jogoDaVelha2[1][1] == 'X' && jogoDaVelha2[2][2] == 'X' || //vertical \
				jogoDaVelha2[0][2] == 'X' && jogoDaVelha2[1][1] == 'X' && jogoDaVelha2[2][0] == 'X') { //vertical / 
				
				System.out.println("Parabens jogador 1 ganhou!!");
				ganhar = true;
				
			}else if(jogoDaVelha2[0][0] == 'O' && jogoDaVelha2[0][1] == 'O' && jogoDaVelha2[0][2] == 'O' || //linha  0
				jogoDaVelha2[1][0] == 'O' && jogoDaVelha2[1][1] == 'O' && jogoDaVelha2[1][2] == 'O' || //linha  1	
				jogoDaVelha2[2][0] == 'O' && jogoDaVelha2[2][1] == 'O' && jogoDaVelha2[2][2] == 'O' || //linha  2	
				jogoDaVelha2[0][0] == 'O' && jogoDaVelha2[1][0] == 'O' && jogoDaVelha2[2][0] == 'O' || //coluna 0	
				jogoDaVelha2[0][1] == 'O' && jogoDaVelha2[1][1] == 'O' && jogoDaVelha2[2][1] == 'O' || //coluna 1
				jogoDaVelha2[0][2] == 'O' && jogoDaVelha2[1][2] == 'O' && jogoDaVelha2[2][2] == 'O' || //coluna 1
				jogoDaVelha2[0][0] == 'O' && jogoDaVelha2[1][1] == 'O' && jogoDaVelha2[2][2] == 'O' || //vertical \
				jogoDaVelha2[0][2] == 'O' && jogoDaVelha2[1][1] == 'O' && jogoDaVelha2[2][0] == 'O'){
				
				System.out.println("Parabens jogador 2 ganhou!!");
				ganhar = true;
				
			} else if(jogada == 9){
				System.out.println("Ninguem ganhou essa partida");
			}
		
			
			
			
		}
	}
}
