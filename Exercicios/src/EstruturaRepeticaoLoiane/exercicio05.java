/*Altere o programa anterior permitindo ao usuário informar as
populações e as taxas de crescimento iniciais. Valide a entrada e
permita repetir a operação.*/

package EstruturaRepeticaoLoiane;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		
		
		/*long popA = 80000;
		long popB = 200000;
		*/
		Scanner scan = new Scanner(System.in);
		long popA,popB;
		double porceA,porceB;

		
		
		boolean valido = false;
		do {
			System.out.println("Informe a populacao A");
			popA = scan.nextLong();
			
			if (popA > 0) {
				valido = true;
				
			}else {
				System.out.println("Popuçacao A precisa ser maior que 0");
			}
		} while (!valido);
		
		valido = false;
		do {
			System.out.println("Informe a populacao B");
			popB = scan.nextLong();
			
			if (popB > 0) {
				valido = true;
				
			}else {
				System.out.println("Popuçacao B precisa ser maior que 0");
			}
		} while (!valido);
		
		valido = false; //deixa false para poder conseguir validar depois
		do {
			System.out.println("Informe a % da populacao A");
			porceA = scan.nextDouble();
			
			if (porceA > 0) {
				valido = true;
				
			}else {
				System.out.println("% da Popuçacao A precisa ser maior que 0");
			}
		} while (!valido);
		
		valido = false;
		do {
			System.out.println("Informe a % da populacao A");
			porceB = scan.nextDouble();
			
			if (porceB > 0) {
				valido = true;
				
			}else {
				System.out.println("% da Popuçacao b precisa ser maior que 0");
			}
		} while (!valido);
		
		int cont = 0;
		
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

	


