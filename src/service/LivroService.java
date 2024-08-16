package service;

import model.Livro;
import repository.LivroRepository;

import java.util.List;

public class LivroService {
	private LivroRepository livroRepository;

	public LivroService(LivroRepository livroRepository) {
		this.livroRepository = livroRepository;
	}

	public void cadastrarLivro(Livro livro) {
		livroRepository.addLivro(livro);
	}

	public List<Livro> listarLivros() {
		return livroRepository.getLivros();
	}

	public Livro buscarLivroPorId(String id) {
		return livroRepository.findLivroById(id);
	}

	public void removerLivro(String id) {
		livroRepository.removeLivro(id);
	}
}
