package br.com.portifolio.lucasvini.projectsaude.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.portifolio.lucasvini.projectsaude.model.Administrador;
import br.com.portifolio.lucasvini.projectsaude.services.AdministradorService;

@RestController
@RequestMapping("/administrador")
public class AdministradorController {

	@Autowired
	private AdministradorService administradorService;
	
	@GetMapping("/todos")
	public List<Administrador> listarTodos() {
		return administradorService.listarTodos();
	}
	
	@GetMapping("/unico/{id}")
	public Optional<Administrador> pegarPorId(@PathVariable Long id) {
		return administradorService.pegarPorId(id);
	}
	
	@PostMapping("/inserir")
	public Administrador inserirNovo(@Valid @RequestBody Administrador adm) {
		return administradorService.inserirNovo(adm);
	}
	
}
