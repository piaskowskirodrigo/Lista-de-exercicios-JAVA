package OrientacaoObjetos.Metodos;



public class TesteCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		
		van.marca = "Teste";
		van.modelo = "Nao sei";
		van.numPassageiros = 5;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		
		van.exibirAutonomia(); //boas praticas: sempre comecar o metodo com algum verbo.
		
		

	}

}
