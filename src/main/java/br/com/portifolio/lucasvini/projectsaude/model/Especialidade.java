package br.com.portifolio.lucasvini.projectsaude.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Especialidade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricao;
	
	public Especialidade() {
	}
	
	public Especialidade(String descricao) {
		this.descricao = descricao;
	}
}
