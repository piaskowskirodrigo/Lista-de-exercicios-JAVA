//Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
package EstruturaSequencial;

import java.util.Scanner;

public class exercicio7 {
	public static void main(String[] args) {
		double area,comprimento,largura,dobroArea;
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o comprimento: ");
		comprimento = scan.nextDouble();
		System.out.println("Informe a largura: ");
		largura = scan.nextDouble();
		
		area = comprimento * largura;
		dobroArea = area * 2;
		
		System.out.println("Multiplicando a largura com o comprimento teremos "+area);
		System.out.println("O dobro da area do quadrado e "+dobroArea);
		
	}

}
