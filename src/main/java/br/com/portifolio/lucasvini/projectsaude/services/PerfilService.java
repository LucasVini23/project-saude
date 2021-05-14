package br.com.portifolio.lucasvini.projectsaude.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.portifolio.lucasvini.projectsaude.model.Perfil;
import br.com.portifolio.lucasvini.projectsaude.repository.PerfilRepository;

@Service
public class PerfilService {

	@Autowired
	private PerfilRepository repository;
	
	public List<Perfil> listarPerfis() {
		return repository.findAll();
	}
	
	public Optional<Perfil> pegarPorId(Long id) {
		return repository.findById(id);
	}
	
	public Perfil inserirPerfil(Perfil perfil) {
		return repository.save(perfil);
	}
	
}
