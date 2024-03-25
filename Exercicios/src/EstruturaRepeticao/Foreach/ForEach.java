package EstruturaRepeticao.Foreach;

import java.util.Random;

public class ForEach {

	public static void main(String[] args) {
		int[] notas = new int [10];
		
		Random random = new Random();
		
		for(int i=0; i<notas.length; i++) {
			notas[i] = random.nextInt(10);
		}
		
		for (int i = 0; i < notas.length; i++) {
			int nota = notas[i];
			System.out.println(nota);
		}
		
		System.out.println("Usando FOREACH");
		for (int nota : notas) {
			System.out.println(nota);
		}
		
		/*int numeros[] = {1,2,3,4,5,6};
		for (int i : numeros) {
			System.out.println(i); 	
		} */
		
	}

}
