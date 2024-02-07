package OrientacaoObjetos.Recursividade;

public class Somatoria {
	
	public static int somatorio(int num) {
		if (num == 0) {
			return 1;
		}
		
		return num + somatorio(num-1);
			
		}
	}
	


