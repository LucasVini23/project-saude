package br.com.portifolio.lucasvini.projectsaude.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
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

	public EspecialidadeDoProfissional(Long id, Especialidade especialidade, Integer experienciaEmAnos) {
		this.id = id;
		this.especialidade = especialidade;
		this.experienciaEmAnos = experienciaEmAnos;
	}
	
}
