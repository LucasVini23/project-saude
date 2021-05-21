package br.com.portifolio.lucasvini.projectsaude.dto;

public class EspecialidadeDoProfissionalDto {

	private Long id;
	private EspecialidadeDto especialidade;
	private Integer experienciaEmAnos;
	
	public EspecialidadeDoProfissionalDto(Long id, EspecialidadeDto especialidade, Integer experienciaEmAnos) {
		this.id = id;
		this.especialidade = especialidade;
		this.experienciaEmAnos = experienciaEmAnos;
	}

	public Long getId() {
		return id;
	}

	public EspecialidadeDto getEspecialidade() {
		return especialidade;
	}

	public Integer getExperienciaEmAnos() {
		return experienciaEmAnos;
	}
	
}
