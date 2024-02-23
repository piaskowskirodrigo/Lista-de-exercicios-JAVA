package Interfaces.Exercicio;

public class Piramide extends Figura3D implements DimensaoSuperficial,DimensaoVolumetrica{
	private double altura;
	private double arestaBase;
	private double apotema;
	
	private Figura2D base;

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getArestaBase() {
		return arestaBase;
	}

	public void setArestaBase(double arestaBase) {
		this.arestaBase = arestaBase;
	}

	public double getApotema() {
		return apotema;
	}

	public void setApotema(double apotema) {
		this.apotema = apotema;
	}

	public Figura2D getBase() {
		return base;
	}

	public void setBase(Figura2D base) {
		this.base = base;
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
