package br.com.portifolio.lucasvini.projectsaude.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.portifolio.lucasvini.projectsaude.builder.ClienteDtoBuilder;
import br.com.portifolio.lucasvini.projectsaude.builder.UsuarioDtoDirector;
import br.com.portifolio.lucasvini.projectsaude.dto.ClienteDto;
import br.com.portifolio.lucasvini.projectsaude.model.Usuario;
import br.com.portifolio.lucasvini.projectsaude.repository.UsuarioRepository;

@Service
public class ClienteService {

	@Autowired
	private UsuarioRepository repository;
	
	public List<ClienteDto> listarTodos(String perfil) {
		List<Usuario> lista = repository.findByDescricao(perfil);
		List<ClienteDto> listaDto = new ArrayList<>();
		for (Usuario usuario : lista) {
			UsuarioDtoDirector director = new UsuarioDtoDirector(new ClienteDtoBuilder(usuario));
			listaDto.add((ClienteDto) director.get());
		}
		return listaDto;
	}
	
}
