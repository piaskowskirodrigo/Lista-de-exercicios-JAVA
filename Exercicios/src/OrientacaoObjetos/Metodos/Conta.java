package OrientacaoObjetos.Metodos;

import java.util.Scanner;

public class Conta {
	
	long numeroConta;
	long saldo,saldoAtt;
	String status;
	long limite;

	
	void sacar() {
		if (saldo > 0 ) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Qual o valor a ser sacado?: ");
			long saque = scan.nextLong();
			System.out.println("Saque realizado com sucesso");
			saldoAtt = saldo - saque  ; 
			
		}else {
			System.out.println("Saldo insuficiente para saque");
			
		}
		
	}
	void depositar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual o valor a ser depositado?: ");
		long deposito = scan.nextLong();
		saldoAtt = saldoAtt + deposito;
		
		System.out.println("Deposito concluido");
		
		
		
	}
	void consultarSaldo() {
		System.out.println("Seu saldo atual e de: "+saldoAtt);
	}
	
	void chequeEspecial() {
		if (saldoAtt < 0) {
			System.out.println("Cliente esta utilizando o cheque especial");
			
		}else {
			System.out.println("Cliente nao esta utilizando o cheque especial ");
		}
	}
	

}
