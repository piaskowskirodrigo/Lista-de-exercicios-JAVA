package RelacionamentoClasses.Exercicios;

public class Professor {
	private String nomeProfessor;
	private String departamento;
	private String email;
	
	public Professor() {
		// TODO Auto-generated constructor stub
	}
	public String getNomeProfessor() {
		return nomeProfessor;
	}
	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String obterInfo(){
        return "Professor = " + nomeProfessor;
    }
	
}
