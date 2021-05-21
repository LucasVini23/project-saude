package br.com.portifolio.lucasvini.projectsaude.builder;

import br.com.portifolio.lucasvini.projectsaude.dto.IUsuario;

public class UsuarioDtoDirector {
	
	protected UsuarioDtoBuilder usuario;
	

	public UsuarioDtoDirector(UsuarioDtoBuilder usuario) {
		this.usuario = usuario;
	}
	
	public void build() {
		usuario.buildId();
		usuario.buildName();
		usuario.buildSobrenome();
		usuario.buildEmail();
		usuario.buildDataNascimento();
		usuario.buildDataCadastro();
		usuario.buildStatus();
		usuario.buildListaEspecialidades();
		usuario.buildPerfil();
		usuario.buildDocumentos();
	}
	
	public IUsuario get() {
		build();
		return usuario.get();
	}
	

}
