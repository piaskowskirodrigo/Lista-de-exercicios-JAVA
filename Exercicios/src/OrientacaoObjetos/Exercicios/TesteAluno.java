package OrientacaoObjetos.Exercicios;

import java.util.Scanner;


public class TesteAluno {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		
		
		
		System.out.println("Informe o nome do aluno: ");
		aluno1.setNome(scan.next());;
		
		System.out.println("Informe a matricula do aluno: ");
		aluno1.setMatricula(scan.nextInt());
		
		System.out.println("Informe o curso do aluno: ");
		aluno1.setNomeCurso(scan.next());
		
		System.out.println("Informe o nome da disciplina 1: ");
		aluno1.setDisciplina1(scan.next());
		
		System.out.println("Informe o nome da disciplina 2: ");
		aluno1.setDisciplina2(scan.next());
		
		System.out.println("Informe o nome da disciplina 3: ");
		aluno1.setDisciplina3(scan.next());
		
		System.out.println("Informe a nota da disciplina 1: ");
		aluno1.setNotaDisciplina1(scan.nextDouble());
		
		System.out.println("Informe a nota da disciplina 2: ");
		aluno1.setNotaDisciplina2(scan.nextDouble());
		
		System.out.println("Informe a nota da disciplina 3: ");
		aluno1.setNotaDisciplina3(scan.nextDouble());
		
		
		aluno1.mostraDisciplinas();
		aluno1.aprovaDisciplina1();
		aluno1.aprovaDisciplina2();
		aluno1.aprovaDisciplina3();
	}

}
