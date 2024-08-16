package model;

public class Livro {
	private String id;
	private String titulo;
	private String autor;
	private String isbn;
	private boolean disponivel;

	public Livro(String id, String titulo, String autor, String isbn) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.disponivel = true;
	}

	public void emprestar() {
		if (disponivel) {
			disponivel = false;
		} else {
			throw new IllegalStateException("Livro não está disponível para empréstimo.");
		}
	}

	public void devolver() {
		this.disponivel = true;
	}

	// Getters e Setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public boolean isDisponivel() {
		return disponivel;
	}
}
