package br.com.portifolio.lucasvini.projectsaude.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EspecialidadeDto {

	private Long id;
	private String descricao;
	
	public EspecialidadeDto(Long id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

}
