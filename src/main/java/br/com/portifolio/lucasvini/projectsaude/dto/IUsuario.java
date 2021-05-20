package br.com.portifolio.lucasvini.projectsaude.dto;

import java.time.LocalDate;
import java.util.List;

import br.com.portifolio.lucasvini.projectsaude.model.Documento;
import br.com.portifolio.lucasvini.projectsaude.model.EspecialidadeDoProfissional;
import br.com.portifolio.lucasvini.projectsaude.model.StatusEnum;

public interface IUsuario {

	public void setNome(String nome);
	public void setSobrenome(String sobrenome);
	public void setEmail(String email);
	public void setDataNascimento(LocalDate dataNascimento);
	public void setDataCadastro(LocalDate dataCadastro);
	public void setStatus(StatusEnum status);
	public void setListaEspecialidades(List<EspecialidadeDoProfissional> listaEspecialidades);
	public void setDocumentos(List<Documento> documentos);
	public Long getId();
	public String getNome();
	public String getSobrenome();
	public String getEmail();
	public LocalDate getDataNascimento();
	public LocalDate getDataCadastro();
	public StatusEnum getStatus();
	public List<EspecialidadeDoProfissional> getListaEspecialidades();
	public List<Documento> getDocumentos();
}
