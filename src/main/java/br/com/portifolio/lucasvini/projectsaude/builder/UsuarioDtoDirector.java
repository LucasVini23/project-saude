package br.com.portifolio.lucasvini.projectsaude.builder;

import br.com.portifolio.lucasvini.projectsaude.dto.UsuarioDto;

public class UsuarioDtoDirector {
	
	protected UsuarioDtoBuilder usuario;
	

	public UsuarioDtoDirector(UsuarioDtoBuilder usuario) {
		this.usuario = usuario;
	}
	
	public void build() {
		usuario.buildName();
		usuario.buildSobrenome();
		usuario.buildEmail();
		usuario.buildDataNascimento();
		usuario.buildStatus();
		usuario.buildListaEspecialidades();
		usuario.buildPerfil();
		usuario.buildDocumentos();
	}
	
	public UsuarioDto get() {
		return usuario.get();
	}
	

}
