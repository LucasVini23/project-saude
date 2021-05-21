package br.com.portifolio.lucasvini.projectsaude.dto;

import java.time.LocalDate;

import br.com.portifolio.lucasvini.projectsaude.model.StatusEnum;

public class PerfilDto {

	private Long id;
	private String descricao;
	private LocalDate dataCadastro = LocalDate.now();
	private String atribuicoes;
	private StatusEnum status;
	
	public PerfilDto(Long id, String descricao, LocalDate dataCadastro, String atribuicoes, StatusEnum status) {
		this.id = id;
		this.descricao = descricao;
		this.dataCadastro = dataCadastro;
		this.atribuicoes = atribuicoes;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public String getAtribuicoes() {
		return atribuicoes;
	}

	public StatusEnum getStatus() {
		return status;
	}
	
}
