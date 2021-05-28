package br.com.portifolio.lucasvini.projectsaude.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.portifolio.lucasvini.projectsaude.model.Profissional;
import br.com.portifolio.lucasvini.projectsaude.services.ProfissionalService;

@RestController
@RequestMapping("/profissional")
public class ProfissionalController{

	@Autowired
	private ProfissionalService service;
	
//	@GetMapping("listar")
//	public List<ClienteDto> listarTodos(String perfil) {
//		return service.listarTodos(perfil);
//	}
//	
//	@PostMapping("/dto")
//	public Cliente inserir(@RequestBody ClienteDto dto) {
//		return service.inserir(dto);
//	}
	
	@PostMapping("/inserir")
	public Profissional inserir(@RequestBody Profissional p) {
		return service.inserir(p);
	}
	
	
}
