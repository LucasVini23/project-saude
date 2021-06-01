package br.com.portifolio.lucasvini.projectsaude.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EspecialidadeDoProfissionalDto {

	private Long id;
	private EspecialidadeDto especialidade;
	private Integer experienciaEmAnos;
	
	public EspecialidadeDoProfissionalDto(Long id, EspecialidadeDto especialidade, Integer experienciaEmAnos) {
		this.id = id;
		this.especialidade = especialidade;
		this.experienciaEmAnos = experienciaEmAnos;
	}
	
}
