package Strings;

public class StringBuilderBuffer { //contatena strings 
	public static void main(String[] args) {

		String[] letras = {"B", "C", "D", "E", "F"};

		String alfabeto = "";
		
		for (String letra : letras){//cria uma string com os elemntos do array
			alfabeto += letra;
		}

		System.out.println(alfabeto);
		
		StringBuffer sb = new StringBuffer();//cria uma string com os elemntos do array
		for (String letra : letras){
			sb.append(letra);
		}
		alfabeto = sb.toString();//inverte a ordem dos elementos 
		
		System.out.println(alfabeto);
		
		alfabeto = new String(sb);
		System.out.println(alfabeto);
		
		System.out.println(sb.reverse());
		
		StringBuilder sb_ = new StringBuilder();//mesma coisa, mas nao é thread safe
		for (String letra : letras){
			sb_.append(letra);
		}
		alfabeto = sb_.toString();
		
		System.out.println(alfabeto);
	}
	//perguntas, voce tem um array com 1000 elementos, como contatenas eles em uma string? utilizando o stringbuffer
}