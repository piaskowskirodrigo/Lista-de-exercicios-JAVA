/*Supondo que a população de um país A seja da ordem de 80000
habitantes com uma taxa anual de crescimento de 3% e que a
população de B seja 200000 habitantes com uma taxa de crescimento
de 1.5%. Faça um programa que calcule e escreva o número de anos
necessários para que a população do país A ultrapasse ou iguale a
população do país B, mantidas as taxas de crescimento.*/

package EstruturaRepeticaoLoiane;

public class exercicio04 {

	public static void main(String[] args) {
		
		
		long popA = 80000;
		long popB = 200000;
		long cont = 0;
		
		while(popA < popB) {
			popA += (popA/100)*3;
			popB += (popB/100)* 1.5;
			cont++;
		}
		System.out.println("Populacao A = "+ popA);
		System.out.println("Populacao B = "+ popB);
		System.out.println("Anos para ultrapasasar: "+cont);
		

	}

}




