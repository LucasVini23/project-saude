package br.com.portifolio.lucasvini.projectsaude.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portifolio.lucasvini.projectsaude.model.Documento;

public interface DocumentoRepository extends JpaRepository<Documento, Long>{

}
