package br.com.portifolio.lucasvini.projectsaude.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.portifolio.lucasvini.projectsaude.dto.ProfissionalDto;
import br.com.portifolio.lucasvini.projectsaude.services.ProfissionalService;

@RestController
@RequestMapping("/profissional")
public class ProfissionalDtoController {

	@Autowired
	private ProfissionalService service;
	
	@GetMapping("/todos")
	public List<ProfissionalDto> listar() {
		return service.listarTodos();
	}
	
}
