package OrientacaoObjetos.Metodos;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;//capacidade combustivel
	double consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("A autonomia do carro e: "+capCombustivel*consumoCombustivel +" Km");
	}

}