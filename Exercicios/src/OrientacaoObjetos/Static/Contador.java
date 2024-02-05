/*Escreva	uma classe chamada	Contador,	que	tem	um	atributo	estático	que	
é	incrementado	sempre	que	a	classe	for	instanciada. Crie	métodos	para	
zerar,	incrementar	e	retornar	o	valor	do	contador. Desenvolva	um	
programa	para	testar	essa	classe.*/

package OrientacaoObjetos.Static;

public class Contador {
	
	static int cont;
	
	public static void encrementar() {
		cont++;
	}
	
	public static void zerar() {
		cont  = 0;
	}
	
	public static int valorCont() {
		return cont;
	}
	
	public static void imprimirValor() {
		System.out.println(valorCont());
	}

}
