package br.com.portifolio.lucasvini.projectsaude.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String sobrenome;
	private String email;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataNascimento;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataCadastro = LocalDate.now();
	private StatusEnum status;
	@ManyToMany
	private List<Perfil> listaPerfis;
	@ManyToMany
	private List<Documento> documentos;
	
	public Cliente() {
	}
	
	public Cliente(String nome, String sobrenome, String email, LocalDate dataNascimento, LocalDate dataCadastro,
			StatusEnum status, List<Perfil> listaPerfis, List<Documento> documentos) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.dataCadastro = dataCadastro;
		this.status = status;
		this.listaPerfis = listaPerfis;
		this.documentos = documentos;
	}
	
}
