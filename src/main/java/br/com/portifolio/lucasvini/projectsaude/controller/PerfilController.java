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

import br.com.portifolio.lucasvini.projectsaude.model.Perfil;
import br.com.portifolio.lucasvini.projectsaude.services.PerfilService;

@RestController
@RequestMapping("/perfil")
public class PerfilController {

	@Autowired
	private PerfilService service;
	
	@GetMapping("/todos")
	public List<Perfil> listarTodos() {
		return service.listarPerfis();
	}
	
	@GetMapping("/unico/{id}")
	public Optional<Perfil> pegarPorId(@PathVariable Long id) {
		return service.pegarPorId(id);
	}
	
	@PostMapping("/inserir")
	public Perfil inserirPerfil(@RequestBody Perfil perfil) {
		return service.inserirPerfil(perfil);
	}
	
}
