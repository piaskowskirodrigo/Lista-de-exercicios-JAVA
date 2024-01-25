package EstruturaRepeticaoLoiane;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		char sexo,civil;
		String nome;
		int idade;
		double salario;
		boolean infoValida = false;
		
		do {
			System.out.println("Informe seu nome: ");
			nome = scan.next();
			
			if (nome.length() >= 3){
                infoValida = true;
			}else {
				System.out.println("O nome precisa de no minimo 3 caracteres");
			}
		} while (!infoValida);
		
		infoValida = false;
		 do {
			 System.out.println("Informe sua idade: ");
				idade = scan.nextInt();
				if (idade > 0 || idade < 150) {
					infoValida = true;
				}else {
					System.out.println("A idade precisa ser entre 0 a 150 ");
				}
		} while (!infoValida);
		 infoValida = false; 
		 
		 do {
			 System.out.println("Informe seu salario: ");
			 salario = scan.nextDouble();
			 if (salario > 0) {
				infoValida = true;
				
			}else {
				System.out.println("Salario precisa ser maior que 0");
			}
		} while (!infoValida);
		 infoValida = false;
		 
		 do {
			 System.out.println("Informe seu sexo: ");
			 sexo = scan.next().charAt(0);
			 
			 if (sexo == 'm' || sexo =='f') {
				infoValida = true;
			}else {
				System.out.println("sexo invalido, tente F para feminino e M para masculino");
			}
		} while (!infoValida);
		 
		 infoValida = false;
		 
		 do {
			 System.out.println("Informe seu estado civil: ");
			 civil = scan.next().charAt(0);
			 if (civil =='s' || civil == 'c' || civil == 'd' || civil == 'v') {
				infoValida = true;
				
			}else {
				System.out.println("Estado civil invalido, tente S para solteiro, C casado, D divorciado e V viuvo");
			}
			 
		} while (!infoValida);
		 
		 System.out.println("As seguintes informacoes foram coletadas:");
	        System.out.println("Nome: " + nome);
	        System.out.println("Idade: " + idade);
	        System.out.println("Salário: " + salario);
	        System.out.println("Sexo: " + sexo);
	        System.out.println("Estado Civil: " + civil);
	}

}
