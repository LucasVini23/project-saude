package br.com.portifolio.lucasvini.projectsaude.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.portifolio.lucasvini.projectsaude.dto.ClienteDto;
import br.com.portifolio.lucasvini.projectsaude.services.ClienteService;


@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteService service;
	
	@GetMapping("/todos")
	public List<ClienteDto> listar(@RequestParam("perfil") String perfil) {
		return service.listarTodos(perfil);
	}
	
}
