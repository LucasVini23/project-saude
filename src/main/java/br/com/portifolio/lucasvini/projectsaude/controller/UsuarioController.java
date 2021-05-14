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

import br.com.portifolio.lucasvini.projectsaude.model.Usuario;
import br.com.portifolio.lucasvini.projectsaude.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService service;
	
	@GetMapping("/todos")
	public List<Usuario> listarTodos() {
		return service.listarUsuarios();
	}
	
	@GetMapping("/unico/{id}")
	public Optional<Usuario> pegarPorId(@PathVariable Long id) {
		return service.pegarPorId(id);
	}
	
	@PostMapping("/inserir")
	public Usuario inserir(@RequestBody Usuario usuario) {
		return service.inserirUsuario(usuario);
	}
	
}
