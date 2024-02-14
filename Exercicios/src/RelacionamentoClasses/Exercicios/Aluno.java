package RelacionamentoClasses.Exercicios;

public class Aluno {
	private String nomeAluno;
	private String matricula;
	private int nota1,nota2,nota3,nota4;
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getNota1() {
		return nota1;
	}
	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}
	public int getNota2() {
		return nota2;
	}
	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}
	public int getNota3() {
		return nota3;
	}
	public void setNota3(int nota3) {
		this.nota3 = nota3;
	}
	public int getNota4() {
		return nota4;
	}
	public void setNota4(int nota4) {
		this.nota4 = nota4;
	}
	
	public int calculaMedia() {
		int media = (nota1+nota2+nota3+nota4)/4;
		if (media >= 7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		
		return media;
		
	}


	
}
