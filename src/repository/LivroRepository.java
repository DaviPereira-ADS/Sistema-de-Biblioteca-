package repository;

import model.Livro;

import java.util.ArrayList;
import java.util.List;

public class LivroRepository {
    private List<Livro> livros;

    public LivroRepository() {
        this.livros = new ArrayList<>();
    }

    public void addLivro(Livro livro) {
        livros.add(livro);
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public Livro findLivroById(String id) {
        return livros.stream().filter(livro -> livro.getId().equals(id)).findFirst().orElse(null);
    }

    public void removeLivro(String id) {
        livros.removeIf(livro -> livro.getId().equals(id));
    }
}
