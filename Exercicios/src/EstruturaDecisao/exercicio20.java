package EstruturaDecisao;

import java.util.Scanner;

public class exercicio20 {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite F para feminino e M para masculino");
		char sexo = scan.next().charAt(0);
		
		switch (sexo) {
		case 'F': {
			
			System.out.println("Feminino");
			break;
			
		}
		case 'M': {
			
			System.out.println("Masculino");
			break;
		}
		default:
			System.out.println("Sexo invalido");
		}
		
		
		
	}
		
	}


