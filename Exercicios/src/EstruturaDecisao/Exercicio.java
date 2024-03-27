package EstruturaDecisao;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[]args) {
		int contador = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Voce telefonou para a vitima?");
		char pergunta1 = scan.next().charAt(0);
		
		System.out.println("Esteve no local do crime?");
		char pergunta2 = scan.next().charAt(0);
		
		System.out.println("Mora perto da vítima?");
		char pergunta3 = scan.next().charAt(0);
		
		System.out.println("Devia para a vítima?");
		char pergunta4 = scan.next().charAt(0);
		
		System.out.println("Já trabalhou com a vítima?");
		char pergunta5 = scan.next().charAt(0);
		
		if (pergunta1 == 's' || pergunta1 == 'S') {
			contador++;
		}
		if (pergunta2 == 's' || pergunta2 == 'S') {
			contador++;
		}
		if (pergunta3 == 's' || pergunta3 == 'S') {
			contador++;
		}
		if (pergunta4 == 's' || pergunta4 == 'S') {
			contador++;
		}
		if (pergunta5 == 's' || pergunta5 == 'S') {
			contador++;
		}
		if (contador == 2) {
			System.out.println("Suspeita");
		}else if(contador == 3 || contador == 4) {
			System.out.println("Cumplice");
		}else if(contador == 5) {
			System.out.println("Culpado");
		}else {
			System.out.println("Inocente");
		}
	}

}