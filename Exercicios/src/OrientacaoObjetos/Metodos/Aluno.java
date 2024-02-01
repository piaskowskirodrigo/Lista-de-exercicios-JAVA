/*Escreva	uma	class	para	representar	um	Aluno.	Adicione	atributos	
relacionados	às	caracteristicas	de	um	Aluno,	como	nome,	matricula,	curso	
que	está	matriculado,	nome	de	3	disciplinas	que	está	cursando e	as	notas	
dessas 3 disciplinas. Desenvolva	um	método	para	verificar	se	o	aluno	está	
aprovado	(nota	maior	ou	igual	a	7)	em	uma determinada	disciplina.
Escreva	um	programa	para	testar	essa	classe,	que	pede	as	informações	do	
aluno	ao	usuário	e	ao	final	informa	o	nome	das	disciplinas,	mostra as	
notas e	mostra	se	o	aluno	foi	aprovado	ou	não.*/

package OrientacaoObjetos.Metodos;

import java.util.Scanner;

public class Aluno {
	

	String nome;
	int matricula;
	String nomeCurso;
	String disciplina1;
	String disciplina2;
	String disciplina3;
	double notaDisciplina1;
	double notaDisciplina2;
	double notaDisciplina3;
	
	
	
	void mostraDisciplinas () {
		System.out.println("Disciplina 1 = "+disciplina1);
		System.out.println("Nota da Disciplina 1 = "+notaDisciplina1);
		System.out.println("Disciplina 2 = "+disciplina2);
		System.out.println("Nota da Disciplina 2 = "+notaDisciplina2);
		System.out.println("Disciplina 3 = "+disciplina3);
		System.out.println("Nota da Disciplina 3 = "+notaDisciplina3);
	}
	
	
	void aprovaDisciplina1 () {
		if (notaDisciplina1 < 7) {
			System.out.println("Aluno reprovou em "+disciplina1);
		}else {
			System.out.println("Aluno passou em "+disciplina1);
		}
	}
	
	void aprovaDisciplina2 () {
		if (notaDisciplina2 < 7) {
			System.out.println("Aluno reprovou em "+disciplina2);
		}else {
			System.out.println("Aluno passou em "+disciplina2);
		}
	}
	
	void aprovaDisciplina3 () {
		if (notaDisciplina3 < 7) {
			System.out.println("Aluno reprovou em "+disciplina3);
		}else {
			System.out.println("Aluno passou em "+disciplina3);
		}
	}
	
	
	
	
	
	

}
