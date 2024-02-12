package Vetores.Matrizes;

import java.util.Iterator;
import java.util.Random;

public class ValorAleatorio {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		int [][] matrizM = new int[4][4];
		int maior = 0;
		int posicaoLinha = 0;
		int posicaoColuna = 0;
		for (int i = 0; i < matrizM.length; i++) {
			for (int j = 0; j < matrizM[i].length; j++) {
				 matrizM[i][j] = aleatorio.nextInt(10);
				 if (matrizM[i][j] > maior) {
					maior = matrizM[i][j];
					posicaoColuna = j;
					posicaoLinha = i;
				}
			}
		}
		System.out.println("Matriz aleatoria: ");
		for (int i = 0; i < matrizM.length; i++) {
			for (int j = 0; j < matrizM[i].length; j++) {
				System.out.print(matrizM[i][j]+" ");
			}
			System.out.println();
		}
	
		System.out.println("Numero maior e: "+maior);
		System.out.println("A posicao da linha e = "+(posicaoLinha +1));
		System.out.println("A posicao da coluna e = "+(posicaoColuna+1));

	}
}


