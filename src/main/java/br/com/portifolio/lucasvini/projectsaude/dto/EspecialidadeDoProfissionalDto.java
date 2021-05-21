package br.com.portifolio.lucasvini.projectsaude.dto;

import br.com.portifolio.lucasvini.projectsaude.model.Especialidade;

public class EspecialidadeDoProfissionalDto {

	private Long id;
	private Especialidade especialidade;
	private Integer experienciaEmAnos;
	
	public EspecialidadeDoProfissionalDto(Long id, Especialidade especialidade, Integer experienciaEmAnos) {
		this.id = id;
		this.especialidade = especialidade;
		this.experienciaEmAnos = experienciaEmAnos;
	}

	public Long getId() {
		return id;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public Integer getExperienciaEmAnos() {
		return experienciaEmAnos;
	}
	
}
