package br.com.portifolio.lucasvini.projectsaude.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.portifolio.lucasvini.projectsaude.dto.ProfissionalDto;
import br.com.portifolio.lucasvini.projectsaude.model.Profissional;
import br.com.portifolio.lucasvini.projectsaude.services.ProfissionalService;

@RestController
@RequestMapping("/profissional")
public class ProfissionalController{

	@Autowired
	private ProfissionalService service;
	
	@GetMapping("/listar")
	public List<ProfissionalDto> listarTodos(String perfil) {
		return service.listarTodos(perfil);
	}
	
	@PostMapping("/dto")
	public Profissional inserir(@RequestBody ProfissionalDto dto) {
		return service.inserirDto(dto);
	}
	
	@PostMapping("/inserir")
	public Profissional inserir(@RequestBody Profissional profissional) {
		return service.inserir(profissional);
	}
	
	@PutMapping("/atualizar")
	public Profissional atualizar(ProfissionalDto dto) {
		return service.atualizar(dto);
	}
	
	
}
