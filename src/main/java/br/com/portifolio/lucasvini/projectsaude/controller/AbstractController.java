package br.com.portifolio.lucasvini.projectsaude.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.portifolio.lucasvini.projectsaude.services.AbstractService;

@RestController
public abstract class AbstractController<T> {
	
	@Autowired
	private AbstractService<T> service;
	
	@GetMapping("/listar")
	public List<T> listarTodos() {
		return service.listar();
	}
	
	@GetMapping("/unico/{id}")
	public Optional<T> pegarPorId(@PathVariable Long id) {
		return service.pegarPorId(id);
	}
	
	@PostMapping("/inserir")
	public T inserir(@RequestBody T generics) {
		return service.inserir(generics);
	}
}
