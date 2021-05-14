package br.com.portifolio.lucasvini.projectsaude.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.portifolio.lucasvini.projectsaude.model.Usuario;
import br.com.portifolio.lucasvini.projectsaude.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	public List<Usuario> listarUsuarios() {
		return repository.findAll();
	}
	
	public Optional<Usuario> pegarPorId(Long id) {
		return repository.findById(id);
	}
	
	public Usuario inserirUsuario(Usuario usuario) {
		return repository.save(usuario);
	}
	
}
