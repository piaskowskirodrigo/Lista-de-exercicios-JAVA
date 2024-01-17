//Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.


import java.util.Scanner;

public class exercicio10 {
	
	public static void main(String[] args) {
		
		double temperaturaCel, temperaturaFare;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual a temperatura Celsius? ");
		temperaturaCel = scan.nextDouble();
		
		temperaturaFare =  (temperaturaCel * 1.8) + 32;
		
		System.out.println("A temperatura em Fahrenheit e de: "+temperaturaFare);
	

	}

}
