package br.com.alura.forum.modelo;

public class Curso {

	private Long id;
	private String nome;
	private Subcategoria subcategoria;

	// construtor default exigido pela JPA
	protected Curso() {
	}

	public Curso(String nome, Subcategoria subcategoria) {
		this.nome = nome;
		this.subcategoria = subcategoria;
	}

	// getters
	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Subcategoria getSubcategoria() {
		return subcategoria;
	}

}
