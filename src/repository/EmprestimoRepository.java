package repository;

import model.Emprestimo;

import java.util.ArrayList;
import java.util.List;

public class EmprestimoRepository {
	private List<Emprestimo> emprestimos;

	public EmprestimoRepository() {
		this.emprestimos = new ArrayList<>();
	}

	public void addEmprestimo(Emprestimo emprestimo) {
		emprestimos.add(emprestimo);
	}

	public List<Emprestimo> getEmprestimos() {
		return emprestimos;
	}

	public Emprestimo findEmprestimoById(String id) {
		return emprestimos.stream().filter(emprestimo -> emprestimo.getId().equals(id)).findFirst().orElse(null);
	}
}
