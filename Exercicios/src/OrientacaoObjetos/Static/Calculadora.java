/*Escreva	uma	classe	Calculadora	que	tenha	os seguintes	métodos:	somar,	
subtrair,	multiplicar,	dividir (dois	números),	elevar	à	potência	n.	
Desenvolva	um	programa	para	testar	essa	classe.*/

package OrientacaoObjetos.Static;

public class Calculadora {
	
	
	
	public static double Somar(double num1, double num2) {
		return num1+num2;	
	}
	
	public static double Subtrair(double num1, double num2) {
		return num1-num2;	
	}
	
	public static double Dividir(double num1, double num2) {
		return num1/num2;	
	}
	
	public static double Multiplicar(double num1, double num2) {
		return num1*num2;	
	}
	
	public static double Elevar(double num1, double num2) {
		return Math.pow(num1, num2);	
	
	}
	public static int Fatorial(int num) {
		int fatorial = 1;
		
		for (int i = num; i > 1; i--) {
			
			fatorial *= i;
			
		}
		return fatorial;
		
	}
	
	

}
