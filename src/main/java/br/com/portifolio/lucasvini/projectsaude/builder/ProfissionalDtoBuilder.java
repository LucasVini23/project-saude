package br.com.portifolio.lucasvini.projectsaude.builder;

import br.com.portifolio.lucasvini.projectsaude.dto.ProfissionalDto;
import br.com.portifolio.lucasvini.projectsaude.model.Usuario;

public class ProfissionalDtoBuilder extends UsuarioDtoBuilder {
	
	private Usuario usuarioBean;
	
	public ProfissionalDtoBuilder(Usuario usuario) {
		this.usuarioBean = usuario;
	}

	@Override
	public void buildName() {
		this.usuario.setNome(this.usuarioBean.getNome());
	}

	@Override
	public void buildSobrenome() {
		this.usuario.setSobrenome(this.usuarioBean.getSobrenome());
	}


	@Override
	public void buildEmail() {
		this.usuario.setEmail(this.usuarioBean.getEmail());
	}

	@Override
	public void buildDataNascimento() {
		this.usuario.setDataNascimento(this.usuarioBean.getDataNascimento());
	}

	@Override
	public void buildStatus() {
		this.usuario.setStatus(this.usuarioBean.getStatus());
	}

	@Override
	public void buildListaEspecialidades() {
		this.usuario.setListaEspecialidades(this.usuarioBean.getListaEspecialidades());
	}

	@Override
	public void buildPerfil() {
		this.usuario.setListaPerfis(this.usuarioBean.getListaPerfis());
	}

	@Override
	public void buildDocumentos() {
		this.usuario.setDocumentos(this.usuarioBean.getDocumentos());
	}
	
	@Override
	public ProfissionalDto get() {
		return (ProfissionalDto) usuario;
	}

}
