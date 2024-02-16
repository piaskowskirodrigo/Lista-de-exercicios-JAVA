package Heranca.Polimorfismo.Exercicios;

public class ContaBancaria {
	
	private String nomeCliente;
	private String numConta;

	private double saldo;
	

	public ContaBancaria() {
		// TODO Auto-generated constructor stub
	}

	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Conta Simples"+"\n"+"Nome Cliente=" + nomeCliente +"\n"+ "NumConta=" + numConta +"\n"+ "Saldo=" + saldo ;
	}
	
	public boolean sacar(long valor) {
		
		if((saldo-valor)>=0) {
			 saldo -= valor;
			return true;
		}
		return false;
	}
	public void depositar(long valor) {
		 saldo += valor;
	}
	
	
}
