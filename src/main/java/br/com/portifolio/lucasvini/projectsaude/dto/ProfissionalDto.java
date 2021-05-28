package br.com.portifolio.lucasvini.projectsaude.dto;

import java.time.LocalDate;
import java.util.List;

import br.com.portifolio.lucasvini.projectsaude.model.StatusEnum;

public class ProfissionalDto {

	private Long id;
	private String nome;
	private String sobrenome;
	private String email;
	private LocalDate dataNascimento;
	private LocalDate dataCadastro = LocalDate.now();
	private StatusEnum status;
	private List<EspecialidadeDoProfissionalDto> listaEspecialidades;
	private PerfilDto Perfil;
	private List<DocumentoDto> documentos;
	
	public ProfissionalDto(String nome, String sobrenome, String email, LocalDate dataNascimento,
			LocalDate dataCadastro, StatusEnum status, List<EspecialidadeDoProfissionalDto> listaEspecialidades,
			PerfilDto perfil, List<DocumentoDto> documentos) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.dataCadastro = dataCadastro;
		this.status = status;
		this.listaEspecialidades = listaEspecialidades;
		Perfil = perfil;
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

	public List<EspecialidadeDoProfissionalDto> getListaEspecialidades() {
		return listaEspecialidades;
	}

	public void setListaEspecialidades(List<EspecialidadeDoProfissionalDto> listaEspecialidades) {
		this.listaEspecialidades = listaEspecialidades;
	}

	public PerfilDto getPerfil() {
		return Perfil;
	}

	public void setPerfil(PerfilDto perfil) {
		Perfil = perfil;
	}

	public List<DocumentoDto> getDocumentos() {
		return documentos;
	}

	public void setDocumentos(List<DocumentoDto> documentos) {
		this.documentos = documentos;
	}

}
