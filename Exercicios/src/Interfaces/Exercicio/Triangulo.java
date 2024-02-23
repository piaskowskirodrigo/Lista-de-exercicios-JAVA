package Interfaces.Exercicio;

public class Triangulo extends Figura2D implements DimensaoSuperficial{
	
	private double lado;
	private double base;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		
	}

}
