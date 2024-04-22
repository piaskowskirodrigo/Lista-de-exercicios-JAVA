package Strings;

public class ModificandoStrings {
	public static void main(String[] args) {
		
		String teste = "Isso é um teste.";
		
		System.out.println(teste);
		System.out.println(teste.substring(10));//imprime apartir do 10 caracter
		System.out.println(teste.substring(10, 15));//imprime do 10 ao 15 caracter

		String ola = "olá";
		String mundo = " mundo";
		String olaMundo = ola.concat(mundo); //ola + mundo
		System.out.println(olaMundo);
		
		String espacos = "i s p a ç o";
		String semEspacos = espacos.replace('i', 'e');//muda os caracter i por e
		System.out.println(semEspacos);
		
		semEspacos = semEspacos.replaceAll(" ", "");//muda os caracter com espaco para sem espaco
		System.out.println(semEspacos);
		
		String nome = " meu nome é: ";
		System.out.println(nome);
		System.out.println(nome.trim());//remove os caracter que sobram antes e depois
		
		//web services
		//XML
	}

}