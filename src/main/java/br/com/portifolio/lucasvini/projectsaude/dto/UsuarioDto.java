package br.com.portifolio.lucasvini.projectsaude.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import br.com.portifolio.lucasvini.projectsaude.model.Documento;
import br.com.portifolio.lucasvini.projectsaude.model.EspecialidadeDoProfissional;
import br.com.portifolio.lucasvini.projectsaude.model.Perfil;
import br.com.portifolio.lucasvini.projectsaude.model.StatusEnum;

public class UsuarioDto implements IUsuario, Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	private String sobrenome;
	private String email;
	private LocalDate dataNascimento;
	private LocalDate dataCadastro = LocalDate.now();
	private StatusEnum status;
	private List<EspecialidadeDoProfissional> listaEspecialidades;
	private Perfil Perfil;
	private List<Documento> documentos;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public void setListaEspecialidades(List<EspecialidadeDoProfissional> listaEspecialidades) {
		this.listaEspecialidades = listaEspecialidades;
	}

	public void setPerfil(Perfil perfil) {
		Perfil = perfil;
	}

	public void setDocumentos(List<Documento> documentos) {
		this.documentos = documentos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public List<EspecialidadeDoProfissional> getListaEspecialidades() {
		return listaEspecialidades;
	}

	public Perfil getPerfil() {
		return Perfil;
	}

	public List<Documento> getDocumentos() {
		return documentos;
	}
	
}
