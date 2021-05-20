package br.com.portifolio.lucasvini.projectsaude.builder;

import br.com.portifolio.lucasvini.projectsaude.dto.UsuarioDto;

public abstract class UsuarioDtoBuilder {

	protected UsuarioDto dto;
	
	public UsuarioDtoBuilder() {
		dto = new UsuarioDto();
	}
	
	public abstract void buildId();
	public abstract void buildName();
	public abstract void buildSobrenome();
	public abstract void buildEmail();
	public abstract void buildDataNascimento();
	public abstract void buildStatus();
	public abstract void buildListaEspecialidades();
	public abstract void buildPerfil();
	public abstract void buildDocumentos();
	
	public UsuarioDto get() {
		return dto;
	}
	
}
