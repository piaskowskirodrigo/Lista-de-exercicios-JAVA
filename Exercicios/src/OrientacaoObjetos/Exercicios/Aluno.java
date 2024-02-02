/*Escreva	uma	classe para	representar	um	Aluno.	Adicione	atributos	
relacionados	às	caracteristicas	de	um	Aluno,	como	nome,	matricula,	curso	
que	está	matriculado,	nome	de	3	disciplinas	que	está	cursando e	as	notas	
dessas 3 disciplinas. Desenvolva	um	método	para	verificar	se	o	aluno	está	
aprovado	(nota	maior	ou	igual	a	7)	em	uma determinada	disciplina.
Escreva	um	programa	para	testar	essa	classe,	que	pede	as	informações	do	
aluno	ao	usuário	e	ao	final	informa	o	nome	das	disciplinas,	mostra	as	
notas e	mostra	se	o	aluno	foi	aprovado	ou	não.*/


package OrientacaoObjetos.Exercicios;

public class Aluno {
		private String nome;
		private int matricula;
		private String nomeCurso;
		private String disciplina1;
		private String disciplina2;
		private String disciplina3;
		private double notaDisciplina1;
		private double notaDisciplina2;
		private double notaDisciplina3;
		
		public Aluno() {
			// TODO Auto-generated constructor stub
		}
		
		public Aluno(String nome, int matricula, String nomeCurso, String disciplina1, String disciplina2,
				String disciplina3, double notaDisciplina1, double notaDisciplina2, double notaDisciplina3) {
			super();
			this.nome = nome;
			this.matricula = matricula;
			this.nomeCurso = nomeCurso;
			this.disciplina1 = disciplina1;
			this.disciplina2 = disciplina2;
			this.disciplina3 = disciplina3;
			this.notaDisciplina1 = notaDisciplina1;
			this.notaDisciplina2 = notaDisciplina2;
			this.notaDisciplina3 = notaDisciplina3;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getMatricula() {
			return matricula;
		}

		public void setMatricula(int matricula) {
			this.matricula = matricula;
		}

		public String getNomeCurso() {
			return nomeCurso;
		}

		public void setNomeCurso(String nomeCurso) {
			this.nomeCurso = nomeCurso;
		}

		public String getDisciplina1() {
			return disciplina1;
		}

		public void setDisciplina1(String disciplina1) {
			this.disciplina1 = disciplina1;
		}

		public String getDisciplina2() {
			return disciplina2;
		}

		public void setDisciplina2(String disciplina2) {
			this.disciplina2 = disciplina2;
		}

		public String getDisciplina3() {
			return disciplina3;
		}

		public void setDisciplina3(String disciplina3) {
			this.disciplina3 = disciplina3;
		}

		public double getNotaDisciplina1() {
			return notaDisciplina1;
		}

		public void setNotaDisciplina1(double notaDisciplina1) {
			this.notaDisciplina1 = notaDisciplina1;
		}

		public double getNotaDisciplina2() {
			return notaDisciplina2;
		}

		public void setNotaDisciplina2(double notaDisciplina2) {
			this.notaDisciplina2 = notaDisciplina2;
		}

		public double getNotaDisciplina3() {
			return notaDisciplina3;
		}

		public void setNotaDisciplina3(double notaDisciplina3) {
			this.notaDisciplina3 = notaDisciplina3;
		}

		public void mostraDisciplinas () {
			System.out.println("Disciplina 1 = "+disciplina1);
			System.out.println("Nota da Disciplina 1 = "+notaDisciplina1);
			System.out.println("Disciplina 2 = "+disciplina2);
			System.out.println("Nota da Disciplina 2 = "+notaDisciplina2);
			System.out.println("Disciplina 3 = "+disciplina3);
			System.out.println("Nota da Disciplina 3 = "+notaDisciplina3);
		}
		
		
		public void aprovaDisciplina1 () {
			if (notaDisciplina1 < 7) {
				System.out.println("Aluno reprovou em "+disciplina1);
			}else {
				System.out.println("Aluno passou em "+disciplina1);
			}
		}
		
		public void aprovaDisciplina2 () {
			if (notaDisciplina2 < 7) {
				System.out.println("Aluno reprovou em "+disciplina2);
			}else {
				System.out.println("Aluno passou em "+disciplina2);
			}
		}
		
		public void aprovaDisciplina3 () {
			if (notaDisciplina3 < 7) {
				System.out.println("Aluno reprovou em "+disciplina3);
			}else {
				System.out.println("Aluno passou em "+disciplina3);
			}
		}
		

}
