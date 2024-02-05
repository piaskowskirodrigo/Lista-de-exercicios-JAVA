package OrientacaoObjetos.Static;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		
		System.out.println("Soma: ");
		imprimirTela(Calculadora.Somar(20, 30));
		System.out.println("Subtracao: ");
		imprimirTela(Calculadora.Subtrair(20, 10));
		System.out.println("Dividir: ");
		imprimirTela(Calculadora.Dividir(50, 2));
		System.out.println("Elevar: ");
		imprimirTela(Calculadora.Elevar(10, 2));
		System.out.println("Fatorial: ");
		imprimirTela(Calculadora.Fatorial(3));
		
		
		

	}
		static void imprimirTela(double num) {
			System.out.println(num);
		}

}
