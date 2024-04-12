package Vetores.Matrizes;


import java.util.Scanner;

public class JogoDaVelhaTeste {

	public static void main(String[] args) {
		char jogoodavelha[][] = new char[3][3];
		Scanner scan = new Scanner(System.in);
		int jogadas = 1;
		boolean ganhou = false;
		int linha = 0;
		int coluna = 0;
		char sinal;
		
		
		System.out.println("JOGO DA VELHA");
		System.out.println("JOGAOR 1 = X");
		System.out.println("JOGAOR 2 = O");
		
		while(!ganhou) {
			
			//verifica vez do jogador
			if (jogadas%2 == 1) {
				System.out.println("Vez do jogador 1");
				sinal = 'X';
			}else {
				System.out.println("Vez do jogador 2");
				sinal = 'O';
			}
			
			//verifca linha valida
			boolean verificaLinha = false;
			while(!verificaLinha) {
				System.out.println("Informe a linha 1 ou 2 ou 3");
				linha = scan.nextInt();
				if (linha < 1 || linha > 3 ) {
					System.out.println("Linha invalida tente novamente");
				}else {
					verificaLinha = true;
				}
			}
			//verifica coluna
			boolean verificaColuna = false;
			while(!verificaColuna) {
				System.out.println("Informe a Coluna 1 ou 2 ou 3");
				coluna = scan.nextInt();
				if (coluna < 1 || coluna > 3 ) {
					System.out.println("coluna invalida tente novamente");
				}else {
					verificaColuna = true;
				}
			}
			linha--;
			coluna--;
			//verifica jogada valida
			if (jogoodavelha[linha][coluna] == 'X' ||jogoodavelha[linha][coluna] == 'O') {
				System.out.println("Jogada ja utilizada tente novamente");
				
			}else {
				jogoodavelha[linha][coluna] = sinal;
				jogadas++;
			}
			
			for (int i = 0; i < jogoodavelha.length; i++) {
				for (int j = 0; j < jogoodavelha[i].length; j++) {
					System.out.print(jogoodavelha[i][j]+ " | ");
				}
				System.out.println();
			}
			
			//valida se jogador 1 ganhou
			if ((jogoodavelha[0][0] == 'X' && jogoodavelha[0][1] == 'X' && jogoodavelha[0][2] == 'X') ||     //linha 1
                    (jogoodavelha[1][0] == 'X' && jogoodavelha[1][1] == 'X' && jogoodavelha[1][2] == 'X') || //linha 2
                    (jogoodavelha[2][0] == 'X' && jogoodavelha[2][1] == 'X' && jogoodavelha[2][2] == 'X') || //linha 3
                    (jogoodavelha[0][0] == 'X' && jogoodavelha[1][0] == 'X' && jogoodavelha[2][0] == 'X') || //coluna 1
                    (jogoodavelha[0][1] == 'X' && jogoodavelha[1][1] == 'X' && jogoodavelha[2][1] == 'X') || //coluna 2
                    (jogoodavelha[0][2] == 'X' && jogoodavelha[1][2] == 'X' && jogoodavelha[2][2] == 'X') || //coluna 3
                    (jogoodavelha[0][0] == 'X' && jogoodavelha[1][1] == 'X' && jogoodavelha[2][2] == 'X') || //diagonal
                    (jogoodavelha[0][2] == 'X' && jogoodavelha[1][1] == 'X' && jogoodavelha[2][0] == 'X')){  //diagonal inversa
                ganhou = true;
                System.out.println("Parabéns, jogador 1 ganhou!");
            } else if ((jogoodavelha[0][0] == 'O' && jogoodavelha[0][1] == 'O' && jogoodavelha[0][2] == 'O') ||     //linha 1
                    (jogoodavelha[1][0] == 'O' && jogoodavelha[1][1] == 'O' && jogoodavelha[1][2] == 'O') || //linha 2
                    (jogoodavelha[2][0] == 'O' && jogoodavelha[2][1] == 'O' && jogoodavelha[2][2] == 'O') || //linha 3
                    (jogoodavelha[0][0] == 'O' && jogoodavelha[1][0] == 'O' && jogoodavelha[2][0] == 'O') || //coluna 1
                    (jogoodavelha[0][1] == 'O' && jogoodavelha[1][1] == 'O' && jogoodavelha[2][1] == 'O') || //coluna 2
                    (jogoodavelha[0][2] == 'O' && jogoodavelha[1][2] == 'O' && jogoodavelha[2][2] == 'O') || //coluna 3
                    (jogoodavelha[0][0] == 'O' && jogoodavelha[1][1] == 'O' && jogoodavelha[2][2] == 'O') || //diagonal
                    (jogoodavelha[0][2] == 'O' && jogoodavelha[1][1] == 'O' && jogoodavelha[2][0] == 'O')){  //diagonal inversa
                ganhou = true;
                System.out.println("Parabens, jogador 2 ganhou!");
            }else if (jogadas > 9){
                ganhou = true;
                System.out.println("Ninguem ganhou essa partida.");
			}
		}
	}

}
