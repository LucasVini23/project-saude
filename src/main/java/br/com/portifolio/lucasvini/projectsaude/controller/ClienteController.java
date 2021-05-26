package br.com.portifolio.lucasvini.projectsaude.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.portifolio.lucasvini.projectsaude.model.Cliente;


@RestController
@RequestMapping("/cliente")
public class ClienteController extends AbstractController<Cliente> {
	
}
