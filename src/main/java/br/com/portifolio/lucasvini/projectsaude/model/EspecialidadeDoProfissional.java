package br.com.portifolio.lucasvini.projectsaude.model;

import javax.persistence.Embeddable;
import javax.persistence.OneToOne;

@Embeddable
public class EspecialidadeDoProfissional {

//	private Profissional profissional;
	@OneToOne
	private Especialidade especialidade;
	private Integer experienciaEmAnos;
	
	public EspecialidadeDoProfissional() {
	}
	
	public EspecialidadeDoProfissional(Especialidade especialidade, Integer experienciaEmAnos) {
		this.especialidade = especialidade;
		this.experienciaEmAnos = experienciaEmAnos;
	}

	public Especialidade getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}

	public Integer getExperienciaEmAnos() {
		return experienciaEmAnos;
	}

	public void setExperienciaEmAnos(Integer experienciaEmAnos) {
		this.experienciaEmAnos = experienciaEmAnos;
	}
	
}
