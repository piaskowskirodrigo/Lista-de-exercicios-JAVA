package OrientacaoObjetos.Metodos;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		Aluno aluno1 = new Aluno();
		System.out.println("Informe o nome do aluno: ");
		aluno1.nome = scan.next();
		
		System.out.println("Informe a matricula do aluno: ");
		aluno1.matricula = scan.nextInt();
		
		System.out.println("Informe o curso do aluno: ");
		aluno1.nomeCurso = scan1.next();
		
		System.out.println("Informe o nome da disciplina 1: ");
		aluno1.disciplina1 = scan.next();
		
		System.out.println("Informe o nome da disciplina 2: ");
		aluno1.disciplina2 = scan.next();
		
		System.out.println("Informe o nome da disciplina 3: ");
		aluno1.disciplina3 = scan.next();
		
		System.out.println("Informe a nota da disciplina 1: ");
		aluno1.notaDisciplina1 = scan.nextDouble();
		
		System.out.println("Informe a nota da disciplina 2: ");
		aluno1.notaDisciplina2 = scan.nextDouble();
		
		System.out.println("Informe a nota da disciplina 3: ");
		aluno1.notaDisciplina3 = scan.nextDouble();
		
		
		aluno1.mostraDisciplinas();
		aluno1.aprovaDisciplina1();
		aluno1.aprovaDisciplina2();
		aluno1.aprovaDisciplina3();

	}

}
