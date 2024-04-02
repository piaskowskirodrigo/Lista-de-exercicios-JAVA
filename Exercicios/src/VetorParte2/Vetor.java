package VetorParte2;

import java.util.Arrays;

public class Vetor {

	private String[] elementos; 
	private int tamanho;

	public Vetor(int capacidade){
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	
	/*public void adiciona(String elemento){
	for (int i=0; i<this.elementos.length; i++){
		if (this.elementos[i] == null){
			this.elementos[i] = elemento;
			break;
		}
	}
}*/
	/*public void adiciona(String elemento) throws Exception{

	if (this.tamanho < this.elementos.length){
		this.elementos[this.tamanho] = elemento;
		this.tamanho++;
	} else {
		throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos");
	}

}*/
	public boolean adiciona(String elemento) {
		
		if (this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		} 
		return false;
	}
	
	
		// 0 1 2 3 4 5 6 = tamanho é 5
		// B C E F G + +
		//
	public boolean adiciona(int posicao, String elemento) {
		
		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posição inválida");
		} 
		
		
		//mover todos os elementos
		for (int i=this.tamanho-1; i>=posicao; i--){
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return true;
	}
	
	public String busca(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)){
			throw new IllegalArgumentException("Posição inválida");
		} 
		return this.elementos[posicao];
	}
	
	
	public int busca(String elemento){//
		for (int i=0; i<this.tamanho; i++){
			if (this.elementos[i].equals(elemento)){//comparacao
				return i;
			}
		}
		return -1;//se nao existir
	}

	
	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for (int i=0; i<this.tamanho-1; i++){
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		if (this.tamanho>0){
			s.append(this.elementos[this.tamanho-1]);
		}
		
		s.append("]");
		
		return s.toString();
	}
	
	
	
}
