package Interfaces.Exercicio;

public class Cilindro extends Figura3D implements DimensaoSuperficial,DimensaoVolumetrica{
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
	public void calcularArea() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calcularVolume() {
		// TODO Auto-generated method stub
		
	}

}
