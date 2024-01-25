/*Faça um programa que leia um nome de usuário e a sua senha e não
aceite a senha igual ao nome do usuário, mostrando uma mensagem
de erro e voltando a pedir as informações.*/
package EstruturaRepeticaoLoiane;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe seu usuario: ");
		int usuario = scan.nextInt(); //fiz int pq to com preguica
		System.out.println("Informe sua senha: ");
		int senha = scan.nextInt();
		
		
		while (senha == usuario) {
			System.out.println("A senha nao pode ser a mesma que o usuario ");
			System.out.println("Informe sua senha: ");
			senha = scan.nextInt();
		}
		System.out.println("Obrigado! ");

	}

}
