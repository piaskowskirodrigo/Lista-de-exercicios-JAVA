package ClassesUtilitarias;

import java.util.Date; //cuidar para n importar o errado

public class ClasseDate {

	public static void main(String[] args) {
		
		Date hoje = new Date();
		
		System.out.println(hoje);
		
		System.out.println("Milisegundos desde 1 Jan 1970 " + hoje.getTime());
		
		System.out.println(hoje.getMonth());

	}

}