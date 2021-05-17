package br.com.portifolio.lucasvini.projectsaude.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import br.com.portifolio.lucasvini.projectsaude.model.Documento;
import br.com.portifolio.lucasvini.projectsaude.model.EspecialidadeDoProfissional;
import br.com.portifolio.lucasvini.projectsaude.model.Perfil;
import br.com.portifolio.lucasvini.projectsaude.model.StatusEnum;

public class UsuarioDto implements Serializable{

	private Long id;
	private String nome;
	private String sobrenome;
	private String email;
	private LocalDate dataNascimento;
	private LocalDate dataCadastro = LocalDate.now();
	private StatusEnum status;
	private List<EspecialidadeDoProfissional> listaEspecialidades;
	private List<Perfil> listaPerfis;
	private List<Documento> documentos;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public void setId(Long id) {
		this.id = id;
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

	public void setListaPerfis(List<Perfil> listaPerfis) {
		this.listaPerfis = listaPerfis;
	}

	public void setDocumentos(List<Documento> documentos) {
		this.documentos = documentos;
	}
}
