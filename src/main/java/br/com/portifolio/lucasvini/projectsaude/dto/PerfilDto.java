package br.com.portifolio.lucasvini.projectsaude.dto;

import java.time.LocalDate;

import br.com.portifolio.lucasvini.projectsaude.model.StatusEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
	
}
