package br.com.portifolio.lucasvini.projectsaude.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.portifolio.lucasvini.projectsaude.model.Profissional;

public interface ProfissionalRepository extends JpaRepository<Profissional, Long>{
	
	@Query(value="SELECT * FROM profissional_lista_perfis JOIN profissional JOIN perfil on profissional_lista_perfis.profissional_id = profissional.id and profissional_lista_perfis.lista_perfis_id = perfil.id where descricao = :perfil", nativeQuery = true)
	public List<Profissional> findByDescricao(String perfil);
	
}
