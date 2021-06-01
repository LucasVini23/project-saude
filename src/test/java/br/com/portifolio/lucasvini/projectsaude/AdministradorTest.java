package br.com.portifolio.lucasvini.projectsaude;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.portifolio.lucasvini.projectsaude.model.Administrador;
import br.com.portifolio.lucasvini.projectsaude.repository.AdministradorRepository;
import br.com.portifolio.lucasvini.projectsaude.services.AdministradorService;

@SpringBootTest
public class AdministradorTest {

	@Autowired
	private AdministradorService service;
	@Autowired
	private AdministradorRepository repository;
	
	@Test
	public void inserirAdm() {
		Administrador adm = new Administrador("Adriano", "Santos", "adriano@gmail.com", LocalDate.parse("23-07-2000", DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		service.inserir(adm);
		Administrador encontrado = repository.findByNome(adm.getNome());
		assertEquals(encontrado.getNome(), adm.getNome());
	}
	
}
