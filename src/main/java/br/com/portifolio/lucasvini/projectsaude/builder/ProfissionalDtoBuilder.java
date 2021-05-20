package br.com.portifolio.lucasvini.projectsaude.builder;

import br.com.portifolio.lucasvini.projectsaude.dto.ProfissionalDto;
import br.com.portifolio.lucasvini.projectsaude.model.Usuario;

public class ProfissionalDtoBuilder extends UsuarioDtoBuilder {
	
	private Usuario usuarioBean;
	
	public ProfissionalDtoBuilder(Usuario usuario) {
		this.usuarioBean = usuario;
		this.dto = new ProfissionalDto();
	}
	
	@Override
	public void buildId() {
		this.dto.setId(this.usuarioBean.getId());
	}

	@Override
	public void buildName() {
		this.dto.setNome(this.usuarioBean.getNome());
	}

	@Override
	public void buildSobrenome() {
		this.dto.setSobrenome(this.usuarioBean.getSobrenome());
	}


	@Override
	public void buildEmail() {
		this.dto.setEmail(this.usuarioBean.getEmail());
	}

	@Override
	public void buildDataNascimento() {
		this.dto.setDataNascimento(this.usuarioBean.getDataNascimento());
	}

	@Override
	public void buildStatus() {
		this.dto.setStatus(this.usuarioBean.getStatus());
	}

	@Override
	public void buildListaEspecialidades() {
		this.dto.setListaEspecialidades(this.usuarioBean.getListaEspecialidades());
	}

	@Override
	public void buildPerfil() {
		this.dto.setPerfil(this.usuarioBean.getListaPerfis().get(0));
	}

	@Override
	public void buildDocumentos() {
		this.dto.setDocumentos(this.usuarioBean.getDocumentos());
	}
	
	@Override
	public ProfissionalDto get() {
		return (ProfissionalDto) dto;
	}

}
