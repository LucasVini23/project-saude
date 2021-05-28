package br.com.portifolio.lucasvini.projectsaude.builder;

import java.util.ArrayList;

import br.com.portifolio.lucasvini.projectsaude.dto.DocumentoDto;
import br.com.portifolio.lucasvini.projectsaude.dto.EspecialidadeDoProfissionalDto;
import br.com.portifolio.lucasvini.projectsaude.dto.ProfissionalDto;
import br.com.portifolio.lucasvini.projectsaude.factory.DocumentoFactory;
import br.com.portifolio.lucasvini.projectsaude.factory.EspecialidadeDoProfissionalFactory;
import br.com.portifolio.lucasvini.projectsaude.factory.PerfilFactory;
import br.com.portifolio.lucasvini.projectsaude.model.Documento;
import br.com.portifolio.lucasvini.projectsaude.model.EspecialidadeDoProfissional;
import br.com.portifolio.lucasvini.projectsaude.model.Perfil;
import br.com.portifolio.lucasvini.projectsaude.model.Profissional;

public class ProfissionalDtoBuilder {
	
	private Profissional profissionalBean;
	private ProfissionalDto dto;
	
	public ProfissionalDtoBuilder(Profissional profissional) {
		this.profissionalBean = profissional;
		this.dto = new ProfissionalDto(null, null, null, null, null, null, null, null, null);
	}
	
	public void buildId() {
		this.dto.setId(this.profissionalBean.getId());
	}

	public void buildName() {
		this.dto.setNome(this.profissionalBean.getNome());
	}

	public void buildSobrenome() {
		this.dto.setSobrenome(this.profissionalBean.getSobrenome());
	}


	public void buildEmail() {
		this.dto.setEmail(this.profissionalBean.getEmail());
	}

	public void buildDataNascimento() {
		this.dto.setDataNascimento(this.profissionalBean.getDataNascimento());
	}
	
	public void buildDataCadastro() {
		this.dto.setDataCadastro(this.profissionalBean.getDataCadastro());
	}

	public void buildStatus() {
		this.dto.setStatus(this.profissionalBean.getStatus());
	}

	public void buildListaEspecialidades() {
		var listaEspecialidas = this.profissionalBean.getListaEspecialidades();
		ArrayList<EspecialidadeDoProfissionalDto> listDto = new ArrayList<>();
		for (EspecialidadeDoProfissional especialidadeDoProfissional : listaEspecialidas) {
			EspecialidadeDoProfissionalDto dto = EspecialidadeDoProfissionalFactory.create(especialidadeDoProfissional);
			listDto.add(dto);
		}
		this.dto.setListaEspecialidades(listDto);
	}

	public void buildPerfil() {
		var listaPerfis = this.profissionalBean.getListaPerfis();
		for (Perfil perfilUnico : listaPerfis) {
			this.dto.setPerfil(PerfilFactory.create(perfilUnico));
		}
	}

	public void buildDocumentos() {
		var listaDocumentosBean = this.profissionalBean.getDocumentos();
		ArrayList<DocumentoDto> listDto = new ArrayList<>();
		for (Documento documento : listaDocumentosBean) {
			DocumentoDto dto = DocumentoFactory.create(documento);
			listDto.add(dto);
		}
		this.dto.setDocumentos(listDto);
	}
	
	public ProfissionalDto get() {
		return dto;
	}


}
