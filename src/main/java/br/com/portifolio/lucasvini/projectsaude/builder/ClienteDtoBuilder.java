package br.com.portifolio.lucasvini.projectsaude.builder;

import java.util.ArrayList;

import br.com.portifolio.lucasvini.projectsaude.dto.ClienteDto;
import br.com.portifolio.lucasvini.projectsaude.dto.DocumentoDto;
import br.com.portifolio.lucasvini.projectsaude.factory.DocumentoFactory;
import br.com.portifolio.lucasvini.projectsaude.factory.PerfilFactory;
import br.com.portifolio.lucasvini.projectsaude.model.Documento;
import br.com.portifolio.lucasvini.projectsaude.model.Perfil;
import br.com.portifolio.lucasvini.projectsaude.model.Usuario;

public class ClienteDtoBuilder extends UsuarioDtoBuilder {

	private Usuario usuarioBean;
	
	public ClienteDtoBuilder(Usuario usuario) {
		this.usuarioBean = usuario;
		this.dto = new ClienteDto(null, null, null, null, null, null, null, null, null);
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
	public void buildDataCadastro() {
		this.dto.setDataCadastro(this.usuarioBean.getDataCadastro());
	}

	@Override
	public void buildStatus() {
		this.dto.setStatus(this.usuarioBean.getStatus());
	}

	@Override
	public void buildListaEspecialidades() {
		
	}

	@Override
	public void buildPerfil() {
		var listaPerfis = this.usuarioBean.getListaPerfis();
		for (Perfil perfilUnico : listaPerfis) {
			this.dto.setPerfil(PerfilFactory.create(perfilUnico));
		}
	}

	@Override
	public void buildDocumentos() {
		var listaDocumentosBean = this.usuarioBean.getDocumentos();
		ArrayList<DocumentoDto> listDto = new ArrayList<>();
		for (Documento documento : listaDocumentosBean) {
			DocumentoDto dto = DocumentoFactory.create(documento);
			listDto.add(dto);
		}
		this.dto.setDocumentos(listDto);
		
	}

}
