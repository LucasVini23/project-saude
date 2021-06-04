package br.com.portifolio.lucasvini.projectsaude.factory;

import br.com.portifolio.lucasvini.projectsaude.dto.EspecialidadeDto;
import br.com.portifolio.lucasvini.projectsaude.model.Especialidade;

public class EspecialidadeFactory {

	public static EspecialidadeDto create(Especialidade especialidade) {
		return new EspecialidadeDto(especialidade.getId(), especialidade.getDescricao());
	}
	
	public static Especialidade createEntity(EspecialidadeDto dto) {
		return new Especialidade(dto.getId(), dto.getDescricao());
	}
	
}
