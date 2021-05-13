package br.com.portifolio.lucasvini.projectsaude.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.portifolio.lucasvini.projectsaude.model.Administrador;
import br.com.portifolio.lucasvini.projectsaude.repository.AdministradorRepository;

@Service
public class AdministradorService {
	
	@Autowired
	private AdministradorRepository repository;
	
	public List<Administrador> listarTodos() {
		return repository.findAll();
	}
	
	public Optional<Administrador> pegarPorId(Long id) {
		return repository.findById(id);
	}
	
	public Administrador inserirNovo(Administrador adm) {
		return repository.save(adm);
	}

}
