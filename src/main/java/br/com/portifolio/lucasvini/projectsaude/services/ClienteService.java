package br.com.portifolio.lucasvini.projectsaude.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.portifolio.lucasvini.projectsaude.builder.ClienteDirector;
import br.com.portifolio.lucasvini.projectsaude.builder.ClienteDtoBuilder;
import br.com.portifolio.lucasvini.projectsaude.builder.ClienteDtoDirector;
import br.com.portifolio.lucasvini.projectsaude.dto.ClienteDto;
import br.com.portifolio.lucasvini.projectsaude.model.Cliente;
import br.com.portifolio.lucasvini.projectsaude.repository.ClienteRepository;

@Service
public class ClienteService extends AbstractService<Cliente>{

	@Autowired
	private ClienteRepository repository;
	@Autowired
	private ClienteDirector director;
	
	public List<ClienteDto> listarTodos(String perfil) {
		List<Cliente> lista = repository.findByDescricao(perfil);
		List<ClienteDto> listaDto = new ArrayList<>();
		for (Cliente cliente : lista) {
			ClienteDtoDirector director = new ClienteDtoDirector(new ClienteDtoBuilder(cliente));
			director.build();
			listaDto.add(director.get());
		}
		return listaDto;
	}
	
	public Cliente inserirDto(ClienteDto dto) {
		Cliente cliente = director.build(dto).get();
		return repository.save(cliente);
	}
	
	public Cliente atualizar(ClienteDto dto) {
		Cliente cliente = director.build(dto).get();
		return repository.save(cliente);
	}
	
}
