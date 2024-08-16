package controller;

import model.Livro;
import model.Usuario;
import service.EmprestimoService;
import service.LivroService;
import service.UsuarioService;

import java.util.List;

public class BibliotecaController {
	private LivroService livroService;
	private UsuarioService usuarioService;
	private EmprestimoService emprestimoService;

	public BibliotecaController(LivroService livroService, UsuarioService usuarioService,
			EmprestimoService emprestimoService) {
		this.livroService = livroService;
		this.usuarioService = usuarioService;
		this.emprestimoService = emprestimoService;
	}

	public void cadastrarLivro(Livro livro) {
		livroService.cadastrarLivro(livro);
	}

	public void cadastrarUsuario(Usuario usuario) {
		usuarioService.cadastrarUsuario(usuario);
	}

	public void registrarEmprestimo(String livroId, String usuarioId) {
		emprestimoService.registrarEmprestimo(livroId, usuarioId);
	}

	public void registrarDevolucao(String emprestimoId) {
		emprestimoService.registrarDevolucao(emprestimoId);
	}

	public List<Livro> listarLivros() {
		return livroService.listarLivros();
	}

	public List<Usuario> listarUsuarios() {
		return usuarioService.listarUsuarios();
	}
}
