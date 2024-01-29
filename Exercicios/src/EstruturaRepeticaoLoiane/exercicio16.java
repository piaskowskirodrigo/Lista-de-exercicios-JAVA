/*A série de Fibonacci é formada pela seqüência
0,1,1,2,3,5,8,13,21,34,55,... Faça um programa que gere a série até
que o valor seja maior que 500*/

package EstruturaRepeticaoLoiane;



public class exercicio16 {

	public static void main(String[] args) {
		
		int num = 500;
		int primeiro = 1;
		int segundo = 1;
		int aux;
		
		for (int i = 3; i <= num; i++) {
			aux = primeiro + segundo;
			primeiro = segundo;
			segundo = aux;
			
			System.out.println(aux);
		}
	
	}

}
