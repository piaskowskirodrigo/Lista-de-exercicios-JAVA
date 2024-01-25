/*Altere o programa anterior para mostrar no final a soma dos números.*/

package EstruturaRepeticaoLoiane;



public class exercicio11 {

	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		
		int num1 = 2;
		int num2 = 10;
		int soma = 0;
		System.out.println("Os numero inteiros entre eles sao: ");
		for (int i = num1; i < num2; i++) {
			soma += i;
			
		}
		System.out.println("A soma entre os numeros e: "+soma);

	}

}
