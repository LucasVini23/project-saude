package br.com.portifolio.lucasvini.projectsaude.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.portifolio.lucasvini.projectsaude.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	@Query(value="SELECT * FROM usuario_lista_perfis JOIN usuario JOIN perfil on usuario_lista_perfis.usuario_id = usuario.id and usuario_lista_perfis.lista_perfis_id = perfil.id where descricao = :perfil", nativeQuery = true)
	public List<Usuario> findByDescricao(String perfil);
	
}
