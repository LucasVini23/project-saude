package br.com.portifolio.lucasvini.projectsaude.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.portifolio.lucasvini.projectsaude.dto.ClienteDto;
import br.com.portifolio.lucasvini.projectsaude.model.Cliente;

@Component
public class ClienteDirector {
	
	protected ClienteBuilder builder;

	public ClienteDirector(@Autowired ClienteBuilder builder) {
		this.builder = builder;
	}
	
	public ClienteDirector build(ClienteDto dto) {
		builder.setDto(dto);
		builder.buildName();
		builder.buildSobrenome();
		builder.buildEmail();
		builder.buildDataNascimento();
		builder.buildDataCadastro();
		builder.buildStatus();
		builder.buildPerfil();
		builder.buildDocumentos();
		return this;
	}
	
	public Cliente get() {
		return builder.get();
	}
	

}
