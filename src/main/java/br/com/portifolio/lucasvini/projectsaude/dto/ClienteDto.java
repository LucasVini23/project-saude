package br.com.portifolio.lucasvini.projectsaude.dto;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.portifolio.lucasvini.projectsaude.model.StatusEnum;

public class ClienteDto {
	
	private Long id;
	private String nome;
	private String sobrenome;
	private String email;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataNascimento;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataCadastro = LocalDate.now();
	private StatusEnum status;
	private PerfilDto perfil;
	private List<DocumentoDto> documentos;
	
	public ClienteDto() {
	}

	public ClienteDto(Long id, String nome, String sobrenome, String email, LocalDate dataNascimento,
			LocalDate dataCadastro, StatusEnum status, PerfilDto perfil, List<DocumentoDto> documentos) {
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.dataCadastro = dataCadastro;
		this.status = status;
		this.perfil = perfil;
		this.documentos = documentos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public PerfilDto getPerfil() {
		return perfil;
	}

	public void setPerfil(PerfilDto perfil) {
		this.perfil = perfil;
	}

	public List<DocumentoDto> getDocumentos() {
		return documentos;
	}

	public void setDocumentos(List<DocumentoDto> documentos) {
		this.documentos = documentos;
	}
	
}
