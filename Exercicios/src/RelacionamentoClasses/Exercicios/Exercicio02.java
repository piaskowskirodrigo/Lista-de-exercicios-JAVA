package RelacionamentoClasses.Exercicios;

import java.util.Scanner;
import java.util.Set;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		Curso curso = new Curso();
		curso.setNome("Ingles");
		curso.setHorario("15:00");
		
		Professor professor = new Professor();
		professor.setNomeProfessor("Prof felipe");
		professor.setDepartamento("TI");
		professor.setEmail("prof@kddjdjdk");
		
		Aluno [] alunos = new Aluno[5];
		for (int i = 0; i < alunos.length; i++) {
			System.out.println("Entre com as notas do aluno " +(i+1));
			Aluno a = new Aluno();
			
			System.out.println("Informe a nota 1: ");
			a.setNota1(scan.nextInt());
			
			System.out.println("Informe a nota 2: ");
			a.setNota2(scan.nextInt());
			
			System.out.println("Informe a nota 3: ");
			a.setNota3(scan.nextInt());
			
			System.out.println("Informe a nota 4: ");
			a.setNota4(scan.nextInt());
			
			alunos[i] = a;
		}
		
		curso.setAlunos(alunos);


	}

}
