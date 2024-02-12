package Vetores.Matrizes;

import java.util.Scanner;

public class jogoooDaVelha {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char [] [] jodoDaVelha = new char[3][3];
		boolean ganhar = false;
		int jogadas = 1; 
		char sinal ;
		int linha = 0;
		int coluna = 0;
		
		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");
		
		
		while(!ganhar) {
			//valida se e vez do jogador1 ou 2
			
			if(jogadas%2==1) {
				
				System.out.println("Vez do jogador 1");
				sinal = 'X';
			}else {
				System.out.println("Vez do jogador 2");
				sinal = 'O';
			}
		
			//valida linha
			boolean validaLinha = false;
			while (!validaLinha) {
				System.out.println("Insira a linha 1 ou 2 ou 2");
				linha = scan.nextInt();
				
				if (linha >= 1 && linha <= 3) {
					validaLinha = true;
				}else {
					System.out.println("Linha invalida tente novamente");
					
				}
			}
			
			
			//valida coluna
			boolean validaColuna = false;
			while (!validaColuna) {
				System.out.println("Insira a coluna 1 ou 2 ou 2");
				coluna = scan.nextInt();
				if (coluna >= 1 && coluna <= 3) {
					validaColuna = true;
				}else {
					System.out.println("Coluna invalida tente novamente");
				}
			}
			
			linha--;
			coluna--;
		
		
		
			//valida jogada valida
			boolean validaJogada = false;
			while(!validaJogada) {
				if (jodoDaVelha[linha][coluna] == 'X' || jodoDaVelha[linha][coluna] == 'O') {
					System.out.println("Jogada ja realizada, tente novamente ");
					validaJogada = true;
			}else {
				jodoDaVelha[linha][coluna] = sinal;
				
				jogadas ++;
			}
			
		
			}
			
			//imprime tabuleiro
			for (int i = 0; i < jodoDaVelha.length; i++) {
				for (int j = 0; j < jodoDaVelha[i].length; j++) {
					System.out.print(jodoDaVelha[i][j] + " | ");
				}
				System.out.println();
				
			}
			
			//valida ganhador
			if ((jodoDaVelha[0][0] == 'X' && jodoDaVelha[0][1] == 'X' && jodoDaVelha[0][2] == 'X') ||     //linha 1
                    (jodoDaVelha[1][0] == 'X' && jodoDaVelha[1][1] == 'X' && jodoDaVelha[1][2] == 'X') || //linha 2
                    (jodoDaVelha[2][0] == 'X' && jodoDaVelha[2][1] == 'X' && jodoDaVelha[2][2] == 'X') || //linha 3
                    (jodoDaVelha[0][0] == 'X' && jodoDaVelha[1][0] == 'X' && jodoDaVelha[2][0] == 'X') || //coluna 1
                    (jodoDaVelha[0][1] == 'X' && jodoDaVelha[1][1] == 'X' && jodoDaVelha[2][1] == 'X') || //coluna 2
                    (jodoDaVelha[0][2] == 'X' && jodoDaVelha[1][2] == 'X' && jodoDaVelha[2][2] == 'X') || //coluna 3
                    (jodoDaVelha[0][0] == 'X' && jodoDaVelha[1][1] == 'X' && jodoDaVelha[2][2] == 'X') || //diagonal
                    (jodoDaVelha[0][2] == 'X' && jodoDaVelha[1][1] == 'X' && jodoDaVelha[2][0] == 'X')){  //diagonal inversa
                ganhar = true;
                System.out.println("Parabéns, jogador 1 ganhou!");
            } else if ((jodoDaVelha[0][0] == 'O' && jodoDaVelha[0][1] == 'O' && jodoDaVelha[0][2] == 'O') ||     //linha 1
                    (jodoDaVelha[1][0] == 'O' && jodoDaVelha[1][1] == 'O' && jodoDaVelha[1][2] == 'O') || //linha 2
                    (jodoDaVelha[2][0] == 'O' && jodoDaVelha[2][1] == 'O' && jodoDaVelha[2][2] == 'O') || //linha 3
                    (jodoDaVelha[0][0] == 'O' && jodoDaVelha[1][0] == 'O' && jodoDaVelha[2][0] == 'O') || //coluna 1
                    (jodoDaVelha[0][1] == 'O' && jodoDaVelha[1][1] == 'O' && jodoDaVelha[2][1] == 'O') || //coluna 2
                    (jodoDaVelha[0][2] == 'O' && jodoDaVelha[1][2] == 'O' && jodoDaVelha[2][2] == 'O') || //coluna 3
                    (jodoDaVelha[0][0] == 'O' && jodoDaVelha[1][1] == 'O' && jodoDaVelha[2][2] == 'O') || //diagonal
                    (jodoDaVelha[0][2] == 'O' && jodoDaVelha[1][1] == 'O' && jodoDaVelha[2][0] == 'O')){  //diagonal inversa
                ganhar = true;
                System.out.println("Parabens, jogador 2 ganhou!");
            }else if (jogadas > 9){
                ganhar = true;
                System.out.println("Ninguem ganhou essa partida.");
			}
	
}
}
}
	


