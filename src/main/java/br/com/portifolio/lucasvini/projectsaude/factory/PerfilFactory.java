package br.com.portifolio.lucasvini.projectsaude.factory;

import br.com.portifolio.lucasvini.projectsaude.dto.PerfilDto;
import br.com.portifolio.lucasvini.projectsaude.model.Perfil;

public class PerfilFactory {
	
	public static PerfilDto create(Perfil perfil) {
		return new PerfilDto(perfil.getId(), perfil.getDescricao(), perfil.getDataCadastro(), perfil.getAtribuicoes(), perfil.getStatus());
	}

}
