package OrientacaoObjetos.Metodos;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;//capacidade combustivel
	double consumoCombustivel;
	
	//metodo sem retorno usa VOID
	void exibirAutonomia() {
		System.out.println("A autonomia do carro e: "+capCombustivel*consumoCombustivel +" Km");
	}
	
	//se for metodo com retorno declara o tipo
	double obterAutonomia() {
		
		System.out.println("Metodo obterAutonomia foi chamado");
		return capCombustivel*consumoCombustivel;
	}

}