package br.com.portifolio.lucasvini.projectsaude.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.portifolio.lucasvini.projectsaude.builder.ProfissionalDtoBuilder;
import br.com.portifolio.lucasvini.projectsaude.dto.ProfissionalDto;
import br.com.portifolio.lucasvini.projectsaude.model.Usuario;
import br.com.portifolio.lucasvini.projectsaude.repository.UsuarioRepository;

@Service
public class ProfissionalService {
	
	@Autowired
	private UsuarioRepository repository;
	
	public List<ProfissionalDto> listarTodos() {
		List<Usuario> lista = repository.findAll();
		List<ProfissionalDto> listaDto = new ArrayList<>();
		for (Usuario usuario : lista) {
			ProfissionalDtoBuilder profissionalBuilder = new ProfissionalDtoBuilder(usuario);
			listaDto.add(profissionalBuilder.get());
		}
		return listaDto;
	}

}
