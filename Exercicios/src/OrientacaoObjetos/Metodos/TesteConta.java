package OrientacaoObjetos.Metodos;

public class TesteConta {

	public static void main(String[] args) {
		Conta cliente = new Conta();
		cliente.saldo = 200;
		cliente.numeroConta = 35556;
		cliente.limite = 5000;
		cliente.status = "Cliente nao e especial";
		
		System.out.println("Seu saldo e de: "+cliente.saldo);
		
		cliente.sacar();
		cliente.consultarSaldo();
		cliente.depositar();
		cliente.consultarSaldo();
		cliente.chequeEspecial();
		
	}

}
