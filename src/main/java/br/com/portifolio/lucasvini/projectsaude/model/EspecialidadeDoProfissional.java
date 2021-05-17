package br.com.portifolio.lucasvini.projectsaude.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class EspecialidadeDoProfissional {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
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

	public Long getId() {
		return id;
	}
	
}
