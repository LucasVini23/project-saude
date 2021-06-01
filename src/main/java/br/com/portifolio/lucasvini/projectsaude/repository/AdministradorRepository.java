package br.com.portifolio.lucasvini.projectsaude.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portifolio.lucasvini.projectsaude.model.Administrador;

public interface AdministradorRepository extends JpaRepository<Administrador, Long> {

	public Administrador findByNome(String nome);
	
}
