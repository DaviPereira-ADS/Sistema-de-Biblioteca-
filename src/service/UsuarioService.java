package service;

import model.Usuario;
import repository.UsuarioRepository;

import java.util.List;

public class UsuarioService {
	private UsuarioRepository usuarioRepository;

	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	public void cadastrarUsuario(Usuario usuario) {
		usuarioRepository.addUsuario(usuario);
	}

	public List<Usuario> listarUsuarios() {
		return usuarioRepository.getUsuarios();
	}

	public Usuario buscarUsuarioPorId(String id) {
		return usuarioRepository.findUsuarioById(id);
	}

	public void removerUsuario(String id) {
		usuarioRepository.removeUsuario(id);
	}
}
