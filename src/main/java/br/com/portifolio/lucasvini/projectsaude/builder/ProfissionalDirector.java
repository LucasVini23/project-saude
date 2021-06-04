package br.com.portifolio.lucasvini.projectsaude.builder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.portifolio.lucasvini.projectsaude.dto.ProfissionalDto;
import br.com.portifolio.lucasvini.projectsaude.model.Profissional;

@Component
public class ProfissionalDirector {
	
	protected ProfissionalBuilder builder;

	public ProfissionalDirector(@Autowired ProfissionalBuilder builder) {
		this.builder = builder;
	}
	
	public ProfissionalDirector build(ProfissionalDto dto) {
		builder.setDto(dto);
		builder.buildId();
		builder.buildName();
		builder.buildSobrenome();
		builder.buildEmail();
		builder.buildDataNascimento();
		builder.buildDataCadastro();
		builder.buildStatus();
		builder.buildListaEspecialidades();
		builder.buildPerfil();
		builder.buildDocumentos();
		return this;
	}
	
	public Profissional get() {
		return builder.get();
	}
	

}
