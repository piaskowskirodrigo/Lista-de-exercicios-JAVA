package OrientacaoObjetos.Atributos;

public class TesteLampada {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		lampada.corDaLuz = "Aamarela";
		lampada.formato = "Redonda";
		lampada.Garantia = 12;
		lampada.potencia = 60;
		lampada.tipo = "Florescente";
		lampada.valor = 20.00;
		
		System.out.println(lampada.corDaLuz);
		System.out.println(lampada.formato);
		System.out.println(lampada.Garantia);
		System.out.println(lampada.potencia);
		System.out.println(lampada.tipo);
		System.out.println(lampada.valor);

	}

}
