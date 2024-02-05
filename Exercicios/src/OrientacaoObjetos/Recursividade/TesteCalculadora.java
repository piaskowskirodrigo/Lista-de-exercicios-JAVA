package OrientacaoObjetos.Recursividade;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		int fatorialNR = Calculadora.FatorialNaoRcursivo(5);
		System.out.println(fatorialNR);
		
		int fatorialR = Calculadora.fatorial(5);
		System.out.println(fatorialR);
	}

}
