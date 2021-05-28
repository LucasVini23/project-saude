package br.com.portifolio.lucasvini.projectsaude.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.portifolio.lucasvini.projectsaude.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	@Query(value="SELECT * FROM cliente_lista_perfis JOIN cliente JOIN perfil on cliente_lista_perfis.cliente_id = cliente.id and cliente_lista_perfis.lista_perfis_id = perfil.id where descricao = :perfil", nativeQuery = true)
	public List<Cliente> findByDescricao(String perfil);
	
}
