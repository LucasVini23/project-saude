package br.com.portifolio.lucasvini.projectsaude.builder;

import br.com.portifolio.lucasvini.projectsaude.dto.ProfissionalDto;

public class ProfissionalDtoDirector {
	
	protected ProfissionalDtoBuilder profissional;
	

	public ProfissionalDtoDirector(ProfissionalDtoBuilder profissional) {
		this.profissional = profissional;
	}
	
	public ProfissionalDtoDirector build() {
		profissional.buildId();
		profissional.buildName();
		profissional.buildSobrenome();
		profissional.buildEmail();
		profissional.buildDataNascimento();
		profissional.buildDataCadastro();
		profissional.buildStatus();
		profissional.buildListaEspecialidades();
		profissional.buildPerfil();
		profissional.buildDocumentos();
		return this;
	}
	
	public ProfissionalDto get() {
		return profissional.get();
	}
	

}
