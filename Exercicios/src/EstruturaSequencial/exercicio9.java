//Faça um Programa que peça a temperatura em graus Fahrenheit, 
//transforme e mostre a temperatura em graus Celsius. Fórmula => C = 5 * ((F-32) / 9).
package EstruturaSequencial;

import java.util.Scanner;

public class exercicio9 {
	
	public static void main(String[] args) {
		
		double temperaturaFar, temperaturaCel;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual a temperatura em Fahrenheit? ");
		temperaturaFar = scan.nextDouble();
		
		temperaturaCel = 5 * ((temperaturaFar-32) / 9);
		
		System.out.println("A temperatura Fahrenheit convertida para celcius e de: "+temperaturaCel+" Celsius");
		
		
;	}

}
