package Vetores.Matrizes;

import java.util.Iterator;
import java.util.Random;

public class MaiorMenor {

	public static void main(String[] args) {
		int [][] matrizM = new int[10][10];
		Random aleatorio = new Random();
		
		
		
		
		for (int i = 0; i < matrizM.length; i++) {
			for (int j = 0; j < matrizM[i].length; j++) {
				matrizM[i][j] = aleatorio.nextInt(100);
				System.out.print(matrizM[i][j]+ "  ");
			}
			System.out.println();
		}
		//verificalihamaior
		int maiorLinha5 = 0;
		int menorLinha5 = 101;
		for (int i = 0; i < matrizM.length; i++) {
			for (int j = 0; j < matrizM[5].length; j++) {
				if(matrizM[5][i] > maiorLinha5) {
					maiorLinha5 = matrizM[5][i] ;
				}
				if(matrizM[5][i] < menorLinha5) {
					menorLinha5 = matrizM[5][i] ;
				}
			}
		}
		//verificColuna maior
		int maiorColuna7 = 0;
		int menorColuna7 = 101;
		for (int i = 0; i < matrizM.length; i++) {
			for (int j = 0; j < matrizM[7].length; j++) {
				if(matrizM[i][7] > maiorColuna7) {
					maiorColuna7 = matrizM[i][7] ;
				}
				if(matrizM[i][7] < menorColuna7) {
					menorColuna7 = matrizM[i][7] ;
				}
			}
		}
		System.out.print("Maior valor da linha 5 = "+maiorLinha5);
		System.out.println();
		System.out.print("Menor valor da linha 5 = "+menorLinha5);
		System.out.println();
		System.out.print("Maior valor da coluna 7 = "+maiorColuna7);
		System.out.println();
		System.out.print("Menor valor da coluna 7 = "+menorColuna7);
		System.out.println();
	}

}
