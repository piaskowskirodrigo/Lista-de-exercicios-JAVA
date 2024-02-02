package OrientacaoObjetos.Exercicios;

import java.util.Scanner;

public class Conta {
	
	private long numeroConta;
	private long saldo,saldoAtt;
	private String status;
	private long limite;
	
	
	public Conta() {
		// TODO Auto-generated constructor stub
	}
	
	public Conta(long numeroConta, long saldo, long saldoAtt, String status, long limite) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.saldoAtt = saldoAtt;
		this.status = status;
		this.limite = limite;
	}
	
	

	public long getNumeroConta() {
		return numeroConta;
	}



	public void setNumeroConta(long numeroConta) {
		this.numeroConta = numeroConta;
	}



	public long getSaldo() {
		return saldo;
	}



	public void setSaldo(long saldo) {
		this.saldo = saldo;
	}



	public long getSaldoAtt() {
		return saldoAtt;
	}



	public void setSaldoAtt(long saldoAtt) {
		this.saldoAtt = saldoAtt;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public long getLimite() {
		return limite;
	}



	public void setLimite(long limite) {
		this.limite = limite;
	}


	
	public void sacar() {
		boolean podeSacar = false;
		
		while(podeSacar == false) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Qual o valor a ser sacado?: ");
			long saque = scan.nextLong();
			if (saque > saldo ) {
				System.out.println("Saldo insufisiente, tente novamente");
				
			}else {
				System.out.println("Saque realizado com sucesso");
				saldoAtt = saldo - saque  ;
				podeSacar = true;
				
			}
		}
		//codigo velho
		/*if (saldo > 0 ) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Qual o valor a ser sacado?: ");
			long saque = scan.nextLong();
			podeSacar = false;
			while (!podeSacar) {
			if (saque > saldo) {
				System.out.println("Saldo insufisiente");
				
			}else {
				System.out.println("Saque realizado com sucesso");
				saldoAtt = saldo - saque  ;
				
			}
			podeSacar = true;
		}
			 
			
		}else {
			System.out.println("Saldo insuficiente para saque");
			
		}*/
		
	}
	public void depositar() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual o valor a ser depositado?: ");
		long deposito = scan.nextLong();
		saldoAtt = (saldoAtt + deposito);
		
		System.out.println("Deposito concluido");
		
		
		
	}
	public void consultarSaldo() {
		System.out.println("Seu saldo atual e de: "+saldoAtt);
	}
	
	public void chequeEspecial() {
		if (saldoAtt < 0) {
			System.out.println("Cliente esta utilizando o cheque especial");
			
		}else {
			System.out.println("Cliente nao esta utilizando o cheque especial ");
		}
	}

}
