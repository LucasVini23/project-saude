package br.com.portifolio.lucasvini.projectsaude.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.portifolio.lucasvini.projectsaude.builder.ProfissionalDtoBuilder;
import br.com.portifolio.lucasvini.projectsaude.builder.UsuarioDtoDirector;
import br.com.portifolio.lucasvini.projectsaude.dto.ProfissionalDto;
import br.com.portifolio.lucasvini.projectsaude.model.Usuario;
import br.com.portifolio.lucasvini.projectsaude.repository.UsuarioRepository;

@Service
public class ProfissionalService {
	
	@Autowired
	private UsuarioRepository repository;
	
	public List<ProfissionalDto> listarTodos(String perfil) {
		List<Usuario> lista = repository.findByDescricao(perfil);
		List<ProfissionalDto> listaDto = new ArrayList<>();
		for (Usuario usuario : lista) {
			UsuarioDtoDirector director = new UsuarioDtoDirector(new ProfissionalDtoBuilder(usuario));
			director.build();
			listaDto.add((ProfissionalDto) director.get());
		}
		return listaDto;
	}

}