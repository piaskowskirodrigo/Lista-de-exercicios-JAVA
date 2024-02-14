package Vetores.Matrizes;

import java.util.Iterator;
import java.util.Scanner;

public class testeee {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char [][] jogoDaVelha = new char[3][3];
		boolean ganhou = false;
		int jogadas = 1;
		char sinal;
		int linha = 0,coluna = 0;
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		
		
		while (!ganhou) {
			//verifica jogador
			if (jogadas%2==1) {
				System.out.println("Vez do jogador 1 ");
				sinal = 'X';
			}else {
				System.out.println("Vez do jogador 2 ");
				sinal = 'O';
			}
			
			//valida linha
			boolean validaLinha = false;
			while (!validaLinha) {
				System.out.println("Entre com a linha 1 ou 2 ou 3 ");
				linha = scan.nextInt();
				if (linha >= 1 && linha <= 3) {
					validaLinha = true;
				}else {
					System.out.println("Linha invalida tente novamente ");
				}
			}
			//valida coluna
			boolean validaColuna = false;
			while (!validaColuna) {
				System.out.println("Entre com a coluna 1 ou 2 ou 3 ");
				coluna = scan.nextInt();
				if (coluna >= 1 && coluna <= 3) {
					validaColuna = true;
				}else {
					System.out.println("Coluna invalida tente novamente ");
				}
			}
			
			linha--;
			coluna--;
			//valid jogada valida
			if (jogoDaVelha[linha][coluna] == 'X' || jogoDaVelha[linha][coluna] == 'O') {
				System.out.println("Jogada ja realizada, tente novamente ");
			}else {
				jogoDaVelha[linha][coluna] = sinal;
				jogadas++;
			}
			
			
			//imprime tabuleiro
			for (int i = 0; i < jogoDaVelha.length; i++) {
				for (int j = 0; j < jogoDaVelha[i].length; j++) {
					System.out.print(jogoDaVelha[i][j] + " | ");
					
				}
				System.out.println();
			}
			
			//verifica ganhador
			if ((jogoDaVelha[0][0] == 'X' && jogoDaVelha[0][1] == 'X' && jogoDaVelha[0][2] == 'X') ||     //linha 1
                    (jogoDaVelha[1][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[1][2] == 'X') || //linha 2
                    (jogoDaVelha[2][0] == 'X' && jogoDaVelha[2][1] == 'X' && jogoDaVelha[2][2] == 'X') || //linha 3
                    (jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][0] == 'X' && jogoDaVelha[2][0] == 'X') || //coluna 1
                    (jogoDaVelha[0][1] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][1] == 'X') || //coluna 2
                    (jogoDaVelha[0][2] == 'X' && jogoDaVelha[1][2] == 'X' && jogoDaVelha[2][2] == 'X') || //coluna 3
                    (jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][2] == 'X') || //diagonal
                    (jogoDaVelha[0][2] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][0] == 'X')) {
				System.out.println("Parabens jogador 1 ganhou ");
				ganhou = true;
			}else if((jogoDaVelha[0][0] == 'O' && jogoDaVelha[0][1] == 'O' && jogoDaVelha[0][2] == 'O') ||     //linha 1
                    (jogoDaVelha[1][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[1][2] == 'O') || //linha 2
                    (jogoDaVelha[2][0] == 'O' && jogoDaVelha[2][1] == 'O' && jogoDaVelha[2][2] == 'O') || //linha 3
                    (jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][0] == 'O' && jogoDaVelha[2][0] == 'O') || //coluna 1
                    (jogoDaVelha[0][1] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][1] == 'O') || //coluna 2
                    (jogoDaVelha[0][2] == 'O' && jogoDaVelha[1][2] == 'O' && jogoDaVelha[2][2] == 'O') || //coluna 3
                    (jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][2] == 'O') || //diagonal
                    (jogoDaVelha[0][2] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][0] == 'O')) {
				System.out.println("Parabens jogador 2 ganhou ");
				ganhou = true;
			}else if(jogadas == 9) {
				System.out.println("Nniguem ganhou essa partida ");
				ganhou = true;
			}
		}

	}

}
