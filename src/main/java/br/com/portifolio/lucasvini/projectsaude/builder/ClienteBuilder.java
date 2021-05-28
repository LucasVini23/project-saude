package br.com.portifolio.lucasvini.projectsaude.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.portifolio.lucasvini.projectsaude.dto.ClienteDto;
import br.com.portifolio.lucasvini.projectsaude.dto.DocumentoDto;
import br.com.portifolio.lucasvini.projectsaude.factory.DocumentoFactory;
import br.com.portifolio.lucasvini.projectsaude.factory.PerfilFactory;
import br.com.portifolio.lucasvini.projectsaude.model.Cliente;
import br.com.portifolio.lucasvini.projectsaude.model.Documento;
import br.com.portifolio.lucasvini.projectsaude.model.Perfil;
import br.com.portifolio.lucasvini.projectsaude.repository.ClienteRepository;

@Component
public class ClienteBuilder {

	private Cliente clienteBean;
	private ClienteDto dto;
	@Autowired
	private ClienteRepository repository;
	
	public ClienteBuilder() {
		this.clienteBean = new Cliente();
	}
	
	public void setDto(ClienteDto dto) {
		this.dto = dto;
	}

	public void buildName() {
		this.clienteBean.setNome(this.dto.getNome());
	}

	public void buildSobrenome() {
		this.clienteBean.setSobrenome(this.dto.getSobrenome());
	}

	public void buildEmail() {
		this.clienteBean.setEmail(this.dto.getEmail());
	}

	public void buildDataNascimento() {
		this.clienteBean.setDataNascimento(this.dto.getDataNascimento());
	}
	
	public void buildDataCadastro() {
		this.clienteBean.setDataCadastro(this.dto.getDataCadastro());
	}

	public void buildStatus() {
		this.clienteBean.setStatus(this.dto.getStatus());
	}

	public void buildPerfil() {
		var perfil = this.dto.getPerfil();
		if(dto.getId() == null) {
			List<Perfil> listaPerfis = new ArrayList<>();
			listaPerfis.add(PerfilFactory.createEntity(perfil));
			this.clienteBean.setListaPerfis(listaPerfis);			
		}
		else {
			Optional<Cliente> cliente = repository.findById(dto.getId());
			var listaPerfis = cliente.get().getListaPerfis();
			if(listaPerfis != null) {
				for(Perfil p : listaPerfis) {
					if(p.getId().equals(perfil.getId())) {
						p.setAtribuicoes(perfil.getAtribuicoes());
						p.setDataCadastro(perfil.getDataCadastro());
						p.setDescricao(perfil.getDescricao());
						p.setStatus(perfil.getStatus());
					}
				}
			}
			else {
				cliente.get().setListaPerfis(new ArrayList<Perfil>());
				cliente.get().getListaPerfis().add(PerfilFactory.createEntity(perfil));
			}
		}
	}

	public void buildDocumentos() {
		var listaDocumentosDto = this.dto.getDocumentos();
		if(dto.getId() == null) {
			List<Documento> listDto = new ArrayList<>();
			for(DocumentoDto documentoDto : listaDocumentosDto) {
				listDto.add(DocumentoFactory.createEntity(documentoDto));
			}
			this.clienteBean.setDocumentos(listDto);
		}
		else {
			Optional<Cliente> cliente = repository.findById(dto.getId());
			var listaDocumentos = cliente.get().getDocumentos();
			if(listaDocumentos != null) {
				for(Documento d : listaDocumentos) {
					for(DocumentoDto documentoDto : listaDocumentosDto) {
						if(d.getId().equals(documentoDto.getId())) {
							d.setNumeroDocumento(documentoDto.getNumeroDocumento());
							d.setTipoDocumento(documentoDto.getTipoDocumento());
						}
					}
				}
			}
			else {
				cliente.get().setDocumentos(new ArrayList<Documento>());
				for(DocumentoDto documentoDto : listaDocumentosDto) {
					cliente.get().getDocumentos().add(DocumentoFactory.createEntity(documentoDto));
				}
			}
		}
	}
	
	public Cliente get() {
		return clienteBean;
	}

}
