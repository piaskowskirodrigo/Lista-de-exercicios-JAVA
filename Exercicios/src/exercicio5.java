//Faça um Programa que converta metros para centímetros.

import java.util.Scanner;

public class exercicio5 {
	
	public static void main (String[]args) {
		
	double metros,centimetros;	
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Informe o valor em metros: ");
	metros = scan.nextDouble();
	
	centimetros = metros * 100;
	
	System.out.println(metros + " metros, e igual a:  "+ centimetros+ " Centimetros. ");
	scan.close();
	}

}
