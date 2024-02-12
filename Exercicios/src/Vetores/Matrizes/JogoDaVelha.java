package Vetores.Matrizes;

import java.util.Scanner;

public class JogoDaVelha {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[][] jogoVelha = new char [3][3];
		
		boolean ganhou = false;
		char sinal;
		int jogadas = 1;
		int linha = 0, coluna = 0;
		
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = 0");
		
		//enquanto jogador nao ganha roda os loop
		while(!ganhou) {
			
			if (jogadas %2==1) {
				System.out.println("Vez do jogador 1: ");	
				sinal = 'X';
			}else {
				System.out.println("Vez do jogador 2: ");	
				sinal = 'O';
			}
			
			//valida linha
			boolean linhaValida = false;
			while(!linhaValida) {
				System.out.println("Entre com a linha 1 ou 2 ou 3: ");
				linha = scan.nextInt();
				if (linha >=1 && linha<=3){
                    linhaValida = true;
                } else {
                    System.out.println("Entrada invalida, tente novamente");
                }
			}
			//valida coluna
			boolean colunaValida = false;
			while(!colunaValida) {
				System.out.println("Entre com a coluna 1 ou 2 ou 3");
				coluna = scan.nextInt();
				if (coluna >= 1 && coluna <=3) {
					colunaValida = true;
				}else {
					System.out.println("Entrada invalida, tente novamente");
				}
			}
			linha--;
			coluna--;
			//valida jogada repitida
			if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
				System.out.println("Jogada invalida, tente outra posicao ");
			} else {
				jogoVelha[linha][coluna] = sinal;
				jogadas++;
			}
			
			//imprime tabuleiro
			for (int i = 0; i < jogoVelha.length; i++) {
				for (int j = 0; j < jogoVelha[i].length; j++) {
					System.out.print(jogoVelha[i][j]+ " | ");
				}
				System.out.println();
			}
			//valida se jogador 1 ganhou
			if ((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X') ||     //linha 1
                    (jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X') || //linha 2
                    (jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X') || //linha 3
                    (jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X') || //coluna 1
                    (jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X') || //coluna 2
                    (jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X') || //coluna 3
                    (jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X') || //diagonal
                    (jogoVelha[0][2] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][0] == 'X')){  //diagonal inversa
                ganhou = true;
                System.out.println("Parabéns, jogador 1 ganhou!");
            } else if ((jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O') ||     //linha 1
                    (jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O') || //linha 2
                    (jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O') || //linha 3
                    (jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O') || //coluna 1
                    (jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O') || //coluna 2
                    (jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O') || //coluna 3
                    (jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O') || //diagonal
                    (jogoVelha[0][2] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][0] == 'O')){  //diagonal inversa
                ganhou = true;
                System.out.println("Parabens, jogador 2 ganhou!");
            }else if (jogadas > 9){
                ganhou = true;
                System.out.println("Ninguem ganhou essa partida.");
			}
			
		
		}
	}
}

