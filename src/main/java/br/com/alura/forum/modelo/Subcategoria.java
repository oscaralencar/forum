package br.com.alura.forum.modelo;

public class Subcategoria {

	private Long id;
	private String nome;
	private Categoria categoria;

	// construtor default exigido pela JPA
	protected Subcategoria() {
	}

	public Subcategoria(String nome, Categoria categoria) {
		this.nome = nome;
		this.categoria = categoria;
	}

	// getters
	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Categoria getCategoria() {
		return categoria;
	}

}
