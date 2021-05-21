package br.com.portifolio.lucasvini.projectsaude.builder;

import br.com.portifolio.lucasvini.projectsaude.dto.IUsuario;

public class UsuarioDtoDirector {
	
	protected UsuarioDtoBuilder usuario;
	

	public UsuarioDtoDirector(UsuarioDtoBuilder usuario) {
		this.usuario = usuario;
	}
	
	public void build(String perfil) {
		usuario.buildId();
		usuario.buildName();
		usuario.buildSobrenome();
		usuario.buildEmail();
		usuario.buildDataNascimento();
		usuario.buildStatus();
		usuario.buildListaEspecialidades();
		usuario.buildPerfil(perfil);
		usuario.buildDocumentos();
	}
	
	public IUsuario get() {
		return usuario.get();
	}
	

}
