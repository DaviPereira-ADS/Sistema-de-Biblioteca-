package model;

public class Aluno extends Usuario {
	private String matricula;

	public Aluno(String id, String nome, String email, String matricula) {
		super(id, nome, email);
		this.matricula = matricula;
	}

	// Getters e Setters
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
}
