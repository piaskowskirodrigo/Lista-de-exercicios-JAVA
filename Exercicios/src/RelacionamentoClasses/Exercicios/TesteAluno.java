package RelacionamentoClasses.Exercicios;

import java.util.Scanner;


public class TesteAluno {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Curso curso = new Curso();
		
		System.out.println("Insira o nome do curso: ");
		String nome = scan.next();
		curso.setNome(nome);
		
		System.out.println("Insira o nome do curso: ");
		String horario = scan.next();
		curso.setHorario(horario);
		
		Professor profesor = new Professor();
		System.out.println("Insira o nome do professor: ");
		nome = scan.next();
		profesor.setNomeProfessor(nome);
		
		System.out.println("Insira o departamento do professor: ");
		String departamento = scan.next();
		profesor.setDepartamento(departamento);
		
		System.out.println("Insira o email do professor: ");
		String email = scan.next();
		profesor.setEmail(email);
		
		Aluno[] alunos = new Aluno[5];
		for (int i = 0; i < alunos.length; i++) {
			Aluno a = new Aluno();
			System.out.println("Informe o nome do aluno "+(i+1));
			nome = scan.next();
			a.setNome(nome);
			
			System.out.println("Informe a matricula do aluno "+(i+1));
			String matricula = scan.next();
			a.setMatricula(matricula);
			
			double[] notas = new double[4];
		    for (int j=0; j<4; j++){
	              System.out.println("Entre com a nota " + (j+1));
	              notas[j] = scan.nextDouble();
	        }
		    
		    Aluno aluno = new Aluno();
            aluno.setNome(nome);
            aluno.setMatricula(matricula);
            aluno.setNotas(notas);
            
            alunos[i] = aluno;
	
		}
		scan.close();
		curso.setAlunos(alunos);
		System.out.println(curso.obterInfo());
	}

}
