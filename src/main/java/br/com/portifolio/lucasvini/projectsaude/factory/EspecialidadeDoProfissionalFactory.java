package br.com.portifolio.lucasvini.projectsaude.factory;

import br.com.portifolio.lucasvini.projectsaude.dto.EspecialidadeDoProfissionalDto;
import br.com.portifolio.lucasvini.projectsaude.model.EspecialidadeDoProfissional;

public class EspecialidadeDoProfissionalFactory {

	public static EspecialidadeDoProfissionalDto create(EspecialidadeDoProfissional especialidade) {
		return new EspecialidadeDoProfissionalDto(especialidade.getId(), EspecialidadeFactory.create(especialidade.getEspecialidade()), especialidade.getExperienciaEmAnos());
	}
	
}
