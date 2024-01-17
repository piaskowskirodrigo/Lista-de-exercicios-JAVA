//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

import java.util.Scanner;

public class exercicio6 {
	
	public static void main(String[]args) {
		double raio;
		double pi = 3.14;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o raio do circulo: ");
		raio = scan.nextDouble();
		raio = raio*raio;
		double area = pi * raio;
		
		System.out.println("A area do circulo e: "+area);
	}

}
