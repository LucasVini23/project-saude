package br.com.portifolio.lucasvini.projectsaude.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Perfil {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricao;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataCadastro = LocalDate.now();
	private String atribuicoes;
	private StatusEnum status;
	
	public Perfil() {
	}
	
	public Perfil(Long id, String descricao, LocalDate dataCadastro, String atribuicoes, StatusEnum status) {
		this.id = id;
		this.descricao = descricao;
		this.dataCadastro = dataCadastro;
		this.atribuicoes = atribuicoes;
		this.status = status;
	}
	
}
