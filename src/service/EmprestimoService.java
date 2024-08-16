package service;

import model.Emprestimo;
import model.Livro;
import model.Usuario;
import repository.EmprestimoRepository;
import repository.LivroRepository;
import repository.UsuarioRepository;

import java.time.LocalDate;
import java.util.List;

public class EmprestimoService {
	private EmprestimoRepository emprestimoRepository;
	private LivroRepository livroRepository;
	private UsuarioRepository usuarioRepository;

	public EmprestimoService(EmprestimoRepository emprestimoRepository, LivroRepository livroRepository,
			UsuarioRepository usuarioRepository) {
		this.emprestimoRepository = emprestimoRepository;
		this.livroRepository = livroRepository;
		this.usuarioRepository = usuarioRepository;
	}

	public void registrarEmprestimo(String livroId, String usuarioId) {
		Livro livro = livroRepository.findLivroById(livroId);
		Usuario usuario = usuarioRepository.findUsuarioById(usuarioId);

		if (livro != null && usuario != null && livro.isDisponivel()) {
			Emprestimo emprestimo = new Emprestimo(generateId(), livro, usuario, LocalDate.now());
			livro.emprestar();
			emprestimoRepository.addEmprestimo(emprestimo);
		} else {
			throw new IllegalArgumentException("Livro ou usuário inválido, ou livro não disponível.");
		}
	}

	public void registrarDevolucao(String emprestimoId) {
		Emprestimo emprestimo = emprestimoRepository.findEmprestimoById(emprestimoId);
		if (emprestimo != null && "Em andamento".equals(emprestimo.getStatus())) {
			emprestimo.devolver(LocalDate.now());
		} else {
			throw new IllegalArgumentException("Empréstimo inválido ou já finalizado.");
		}
	}

	public List<Emprestimo> listarEmprestimos() {
		return emprestimoRepository.getEmprestimos();
	}

	private String generateId() {
		return "EMP-" + Math.random(); // Simples gerador de ID
	}
}
