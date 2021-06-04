package br.com.portifolio.lucasvini.projectsaude.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
import br.com.portifolio.lucasvini.projectsaude.repository.ProfissionalRepository;

@Component
public class ProfissionalBuilder {

	private Profissional profissionalBean;
	private ProfissionalDto dto;
	@Autowired
	private ProfissionalRepository repository;
	
	public ProfissionalBuilder() {
		this.profissionalBean = new Profissional();
	}
	
	public void setDto(ProfissionalDto dto) {
		this.dto = dto;
	}
	
	public void buildId() {
		if(dto.getId() != null) {
			this.profissionalBean.setId(this.dto.getId());
		}
	}

	public void buildName() {
		this.profissionalBean.setNome(this.dto.getNome());
	}

	public void buildSobrenome() {
		this.profissionalBean.setSobrenome(this.dto.getSobrenome());
	}

	public void buildEmail() {
		this.profissionalBean.setEmail(this.dto.getEmail());
	}

	public void buildDataNascimento() {
		this.profissionalBean.setDataNascimento(this.dto.getDataNascimento());
	}
	
	public void buildDataCadastro() {
		this.profissionalBean.setDataCadastro(this.dto.getDataCadastro());
	}

	public void buildStatus() {
		this.profissionalBean.setStatus(this.dto.getStatus());
	}

	public void buildPerfil() {
		var perfil = this.dto.getPerfil();
		if(dto.getId() == null) {
			List<Perfil> listaPerfis = new ArrayList<>();
			listaPerfis.add(PerfilFactory.createEntity(perfil));
			this.profissionalBean.setListaPerfis(listaPerfis);			
		}
		else {
			Optional<Profissional> profissional = repository.findById(dto.getId());
			var listaPerfis = profissional.get().getListaPerfis();
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
				profissional.get().setListaPerfis(new ArrayList<Perfil>());
				profissional.get().getListaPerfis().add(PerfilFactory.createEntity(perfil));
			}
		}
	}
	
	public void buildListaEspecialidades() {
		var listaEspecialidadesDto = this.dto.getListaEspecialidades();
		if(dto.getId() == null) {
			List<EspecialidadeDoProfissional> listDto = new ArrayList<>();
			for(EspecialidadeDoProfissionalDto especialidadeDto : listaEspecialidadesDto) {
				listDto.add(EspecialidadeDoProfissionalFactory.createEntity(especialidadeDto));
			}
			this.profissionalBean.setListaEspecialidades(listDto);
		}
		else {
			Optional<Profissional> profissional = repository.findById(dto.getId());
			var listaEspecialidades = profissional.get().getListaEspecialidades();
			if(listaEspecialidades != null) {
				for(EspecialidadeDoProfissional e : listaEspecialidades) {
					for(EspecialidadeDoProfissionalDto especialidadeDto : listaEspecialidadesDto) {
						if(e.getId().equals(especialidadeDto.getId())) {
//							e.setEspecialidade(especialidadeDto.getEspecialidade());
							e.setExperienciaEmAnos(especialidadeDto.getExperienciaEmAnos());
						}
					}
				}
			}
			else {
				profissional.get().setListaEspecialidades(new ArrayList<EspecialidadeDoProfissional>());
				for(EspecialidadeDoProfissionalDto especialidadeDto : listaEspecialidadesDto) {
					profissional.get().getListaEspecialidades().add(EspecialidadeDoProfissionalFactory.createEntity(especialidadeDto));
				}
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
			this.profissionalBean.setDocumentos(listDto);
		}
		else {
			Optional<Profissional> profissional = repository.findById(dto.getId());
			var listaDocumentos = profissional.get().getDocumentos();
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
				profissional.get().setDocumentos(new ArrayList<Documento>());
				for(DocumentoDto documentoDto : listaDocumentosDto) {
					profissional.get().getDocumentos().add(DocumentoFactory.createEntity(documentoDto));
				}
			}
		}
	}
	
	public Profissional get() {
		return profissionalBean;
	}

}
