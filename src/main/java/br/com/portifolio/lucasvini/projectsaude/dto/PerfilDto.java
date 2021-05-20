package br.com.portifolio.lucasvini.projectsaude.dto;

import java.time.LocalDate;

import br.com.portifolio.lucasvini.projectsaude.model.StatusEnum;

public class PerfilDto {

	private Long id;
	private String descricao;
	private LocalDate dataCadastro = LocalDate.now();
	private String atribuicoes;
	private StatusEnum status;
	
}
