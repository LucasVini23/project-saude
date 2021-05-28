package br.com.portifolio.lucasvini.projectsaude.dto;

import java.time.LocalDate;
import java.util.List;

import br.com.portifolio.lucasvini.projectsaude.model.StatusEnum;

public interface IUsuario {

	public void setNome(String nome);
	public void setSobrenome(String sobrenome);
	public void setEmail(String email);
	public void setDataNascimento(LocalDate dataNascimento);
	public void setDataCadastro(LocalDate dataCadastro);
	public void setStatus(StatusEnum status);
	public void setListaEspecialidades(List<EspecialidadeDoProfissionalDto> listaEspecialidades);
	public void setDocumentos(List<DocumentoDto> documentos);
	public Long getId();
	public String getNome();
	public String getSobrenome();
	public String getEmail();
	public LocalDate getDataNascimento();
	public LocalDate getDataCadastro();
	public StatusEnum getStatus();
	public List<EspecialidadeDoProfissionalDto> getListaEspecialidades();
	public List<DocumentoDto> getDocumentos();
}
