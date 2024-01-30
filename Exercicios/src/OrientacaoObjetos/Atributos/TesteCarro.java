package OrientacaoObjetos.Atributos;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		
		van.marca = "Teste";
		van.modelo = "Nao sei";
		van.numPassageiros = 5;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		Carro fusca = new Carro();
		
		fusca.marca = "Wolks";
		fusca.modelo = "fusca";
		fusca.numPassageiros = 5;
		fusca.capCombustivel = 100;
		fusca.consumoCombustivel = 0.2;
		
		System.out.println(fusca.marca);
		System.out.println(fusca.modelo);
		
		
		
	}

}
