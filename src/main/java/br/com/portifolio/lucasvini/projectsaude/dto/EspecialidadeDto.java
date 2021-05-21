package br.com.portifolio.lucasvini.projectsaude.dto;

public class EspecialidadeDto {

	private Long id;
	private String descricao;
	
	public EspecialidadeDto(Long id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
