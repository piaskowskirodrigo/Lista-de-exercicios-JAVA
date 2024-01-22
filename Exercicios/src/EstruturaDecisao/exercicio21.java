//Faça um Programa que verifique se uma letra digitada é vogal ou consoante.

package EstruturaDecisao;

import java.util.Scanner;

public class exercicio21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma letra");
		char letra = scan.next().charAt(0);
		
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			System.out.println("A letra e uma vogal");
			
		}else {
			System.out.println("A letra e uma consoante");
		}

	}

}
