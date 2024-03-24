package Printf;

public class ExemploPrintf {

	public static void main(String[] args) {

		System.out.printf("%s", "Olá, Mundo!");
		System.out.println();
		System.out.printf("%S", "Olá, Mundo!");//Coloca em maiusculo
		System.out.println();

		System.out.printf("%c", 'c');
		System.out.println();
		System.out.printf("%C", 'c');//Caracter em maiusculo

		System.out.printf("%n");//pula linha

		int valor = 123456789;
		System.out.printf("%d", valor); //numero inteiro

		System.out.println();

		double pontoFlutuante = 3.1456789;
		System.out.printf("%f", pontoFlutuante);//ponto flutuante

		System.out.println();

		String olaMundo = "Olá, Mundo!";
		System.out.printf("%20s", olaMundo);//Numero antes do s é a qtd de espacos da string

		System.out.println();

		System.out.printf("%-20s", olaMundo);//igual o de cima mas na esquerda

		System.out.println();

		System.out.printf("%+d", valor);//imprime simbolo do positivo ou negativo

		System.out.println();

		System.out.printf("%015d", valor);//completa com 0 oq sobrar dos 15 espaco da string

		System.out.println();

		System.out.printf("%,d", valor); 
		
		System.out.println();
		
		int valor2 = -123456789;
		System.out.printf("% d", valor2);
		System.out.println();
		System.out.printf("% d", valor);

		System.out.println();

		System.out.printf("%.3f", pontoFlutuante);//apenas 3 digitos depois da ,

		System.out.println();

		System.out.printf("R$%10.2f", pontoFlutuante);// 10 espacos, e 2 depois da ,

		System.out.println();

		testeMaisCompleto();
	}
	
	private static void testeMaisCompleto(){
		
		double[] precos = {10000, 123.54, 7843.567, 1, 4.56789};
		
		for (int i=0; i<precos.length; i++){
			System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i+1, precos[i]);
		}
		
		//Java.util.Formater
	}

}