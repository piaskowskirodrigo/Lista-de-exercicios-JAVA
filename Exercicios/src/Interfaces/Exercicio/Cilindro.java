package Interfaces.Exercicio;

public class Cilindro extends Figura3D {
	private int altura;
	private double raio;

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		double areaBase = Math.PI * (raio*raio);
		double areaLetral = 2* Math.PI * raio * altura;
		double areaTotal = (2*areaBase) + areaLetral;
		
		
		return areaTotal;
		
	}

	@Override
	public double calcularVolume() {
		return Math.PI * (raio*raio) * altura;
		
	}

}
