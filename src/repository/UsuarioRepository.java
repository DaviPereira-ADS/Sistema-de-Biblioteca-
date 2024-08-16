package repository;

import model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository {
	private List<Usuario> usuarios;

	public UsuarioRepository() {
		this.usuarios = new ArrayList<>();
	}

	public void addUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public Usuario findUsuarioById(String id) {
		return usuarios.stream().filter(usuario -> usuario.getId().equals(id)).findFirst().orElse(null);
	}

	public void removeUsuario(String id) {
		usuarios.removeIf(usuario -> usuario.getId().equals(id));
	}
}
