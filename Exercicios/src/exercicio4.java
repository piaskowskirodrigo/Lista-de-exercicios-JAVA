//Faça um Programa que peça as 4 notas bimestrais e mostre a média.

import java.util.Scanner;

public class exercicio4 {
	
	public static void main (String[] args) {
		
		double nota1,nota2,nota3,nota4, media;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informa a nota 1");
		nota1 = scan.nextDouble();
		
		System.out.println("Informa a nota 2");
		nota2 = scan.nextDouble();

		System.out.println("Informa a nota 3");
		nota3 = scan.nextDouble();
		
		System.out.println("Informa a nota 4");
		nota4 = scan.nextDouble();
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println("Sua media final e: " +media);
		 scan.close();
		
	}

}
