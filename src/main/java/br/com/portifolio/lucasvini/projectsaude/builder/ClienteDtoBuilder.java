package br.com.portifolio.lucasvini.projectsaude.builder;

import java.util.ArrayList;

import br.com.portifolio.lucasvini.projectsaude.dto.ClienteDto;
import br.com.portifolio.lucasvini.projectsaude.dto.DocumentoDto;
import br.com.portifolio.lucasvini.projectsaude.factory.DocumentoFactory;
import br.com.portifolio.lucasvini.projectsaude.factory.PerfilFactory;
import br.com.portifolio.lucasvini.projectsaude.model.Cliente;
import br.com.portifolio.lucasvini.projectsaude.model.Documento;
import br.com.portifolio.lucasvini.projectsaude.model.Perfil;

public class ClienteDtoBuilder {

	private Cliente clienteBean;
	private ClienteDto dto;
	
	public ClienteDtoBuilder(Cliente cliente) {
		this.clienteBean = cliente;
		this.dto = new ClienteDto(null, null, null, null, null, null, null, null, null);
	}
	
	public void buildId() {
		this.dto.setId(this.clienteBean.getId());
	}

	public void buildName() {
		this.dto.setNome(this.clienteBean.getNome());
	}

	public void buildSobrenome() {
		this.dto.setSobrenome(this.clienteBean.getSobrenome());
	}

	public void buildEmail() {
		this.dto.setEmail(this.clienteBean.getEmail());
	}

	public void buildDataNascimento() {
		this.dto.setDataNascimento(this.clienteBean.getDataNascimento());
	}
	
	public void buildDataCadastro() {
		this.dto.setDataCadastro(this.clienteBean.getDataCadastro());
	}

	public void buildStatus() {
		this.dto.setStatus(this.clienteBean.getStatus());
	}

	public void buildPerfil() {
		var listaPerfis = this.clienteBean.getListaPerfis();
		for (Perfil perfilUnico : listaPerfis) {
			this.dto.setPerfil(PerfilFactory.create(perfilUnico));
		}
	}

	public void buildDocumentos() {
		var listaDocumentosBean = this.clienteBean.getDocumentos();
		ArrayList<DocumentoDto> listDto = new ArrayList<>();
		for (Documento documento : listaDocumentosBean) {
			DocumentoDto dto = DocumentoFactory.create(documento);
			listDto.add(dto);
		}
		this.dto.setDocumentos(listDto);
		
	}
	
	public ClienteDto get() {
		return dto;
	}

}
