/*Capture do teclado valores para preenchimento de uma matriz M
3x3. Após a captura imprima a matriz criada e encontre a
quantidade de números pares, a quantidade de números ímpares.*/

package Vetores.Matrizes;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [][] matrizM = new int[3][3];
		int qtdPar = 0;
		int qtdImpar = 0;
	
		for (int i = 0; i < matrizM.length; i++) {
			for (int j = 0; j < matrizM[i].length; j++) {
			System.out.println("Informe o valor da posicao da linha "+(i+1) + " da coluna " +(j+1));
			matrizM[i][j] = scan.nextInt();

            }
        }
		
		//for dos pares e impares
		for (int i = 0; i < matrizM.length; i++) {
			for (int j = 0; j < matrizM[i].length; j++) {
				if (matrizM[i][j] %2 ==0) {
					qtdPar++;
				}else {
					qtdImpar++; 
				}
            }
        }
		
		for (int i=0; i<matrizM.length; i++){ //imprime a raiz 
            for (int j=0; j<matrizM[i].length; j++){
                System.out.print(matrizM[i][j] + " ");
            }
            System.out.println();
       

		}
		 System.out.println();
         System.out.println("Quantidade par = "+qtdPar);
         System.out.println("Quantidade impar = "+qtdImpar);

}
}
