package br.com.portifolio.lucasvini.projectsaude.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.portifolio.lucasvini.projectsaude.dto.ClienteDto;
import br.com.portifolio.lucasvini.projectsaude.model.Cliente;
import br.com.portifolio.lucasvini.projectsaude.services.ClienteService;


@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService service;
	
	@GetMapping("/listar")
	public List<ClienteDto> listarTodos(@RequestParam String perfil) {
		return service.listarTodos(perfil);
	}
	
	@PostMapping("/dto")
	public Cliente inserirDto(@RequestBody ClienteDto dto) {
		return service.inserirDto(dto);
	}
	
	@PostMapping("/inserir")
	public Cliente inserir(@RequestBody Cliente cliente) {
		return service.inserir(cliente);
	}
	
	@PutMapping("/atualizar")
	public Cliente atualizar(ClienteDto dto) {
		return service.atualizar(dto);
	}
	
	
}
