package br.com.portifolio.lucasvini.projectsaude.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public abstract class AbstractService<T> {

	@Autowired
	protected JpaRepository<T, Long> repository;
	
	public List<T> listar() {
		return repository.findAll();
	}
	
	public Optional<T> pegarPorId(Long id) {
		return repository.findById(id);
	}
	
	public T inserir(T usuario) {
		return repository.save(usuario);
	}
	
}
