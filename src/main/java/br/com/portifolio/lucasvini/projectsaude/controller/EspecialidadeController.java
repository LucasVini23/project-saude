package br.com.portifolio.lucasvini.projectsaude.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.portifolio.lucasvini.projectsaude.model.Especialidade;
import br.com.portifolio.lucasvini.projectsaude.services.EspecialidadeService;

@RestController
@RequestMapping("/especialidade")
public class EspecialidadeController {

	@Autowired
	private EspecialidadeService service;
	
	@GetMapping("/todos")
	public List<Especialidade> listarTodos() {
		return service.listarEspecialidades();
	}
	
	@GetMapping("/unico/{id}")
	public Optional<Especialidade> pegarPorId(@PathVariable Long id) {
		return service.pegarPorId(id);
	}
	
	@PostMapping("/inserir")
	public Especialidade inserir(@RequestBody Especialidade especialidade) {
		return service.inserir(especialidade);
	}
	
	
}
