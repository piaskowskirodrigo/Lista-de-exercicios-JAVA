package OrientacaoObjetos.Exercicios;



public class TesteConta {

	public static void main(String[] args) {
		Conta cliente = new Conta();
		
		cliente.setSaldo(200);
		cliente.setNumeroConta(5454);
		cliente.setLimite(1400);
		cliente.setStatus("Cliente nao e especial");
	
		System.out.println("Seu saldo e de: "+cliente.getSaldo());
		
		cliente.sacar();
		cliente.consultarSaldo();
		cliente.depositar();
		cliente.consultarSaldo();
		cliente.chequeEspecial();
		
	

	}

}
