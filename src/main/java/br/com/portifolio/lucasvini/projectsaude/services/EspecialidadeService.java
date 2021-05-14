package br.com.portifolio.lucasvini.projectsaude.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.portifolio.lucasvini.projectsaude.model.Especialidade;
import br.com.portifolio.lucasvini.projectsaude.repository.EspecialidadeRepository;

@Service
public class EspecialidadeService {

	@Autowired
	private EspecialidadeRepository repository;
	
	public List<Especialidade> listarEspecialidades() {
		return repository.findAll();
	}
	
	public Optional<Especialidade> pegarPorId(Long id) {
		return repository.findById(id);
	}
	
	public Especialidade inserir(Especialidade especialidade) {
		return repository.save(especialidade);
	}
	
}
