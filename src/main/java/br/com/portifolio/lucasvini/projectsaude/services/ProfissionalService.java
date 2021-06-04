package br.com.portifolio.lucasvini.projectsaude.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.portifolio.lucasvini.projectsaude.builder.ProfissionalDirector;
import br.com.portifolio.lucasvini.projectsaude.builder.ProfissionalDtoBuilder;
import br.com.portifolio.lucasvini.projectsaude.builder.ProfissionalDtoDirector;
import br.com.portifolio.lucasvini.projectsaude.dto.ProfissionalDto;
import br.com.portifolio.lucasvini.projectsaude.model.Profissional;
import br.com.portifolio.lucasvini.projectsaude.repository.ProfissionalRepository;

@Service
public class ProfissionalService extends AbstractService<Profissional>{
	
	@Autowired
	private ProfissionalRepository repository;
	@Autowired
	private ProfissionalDirector director;
	
	public List<ProfissionalDto> listarTodos(String perfil) {
		List<Profissional> lista = repository.findByDescricao(perfil);
		List<ProfissionalDto> listaDto = new ArrayList<>();
		for (Profissional usuario : lista) {
			ProfissionalDtoDirector director = new ProfissionalDtoDirector(new ProfissionalDtoBuilder(usuario));
			director.build();
			listaDto.add(director.get());
		}
		return listaDto;
	}
	
	public Profissional inserirDto(ProfissionalDto dto) {
		Profissional profissional = director.build(dto).get();
		return repository.save(profissional);
	}
	
	public Profissional atualizar(ProfissionalDto dto) {
		Profissional profissional = director.build(dto).get();
		return repository.save(profissional);
	}

}