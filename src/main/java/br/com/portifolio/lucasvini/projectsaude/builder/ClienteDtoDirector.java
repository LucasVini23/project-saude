package br.com.portifolio.lucasvini.projectsaude.builder;

import br.com.portifolio.lucasvini.projectsaude.dto.ClienteDto;

public class ClienteDtoDirector {
	
	protected ClienteDtoBuilder cliente;
	

	public ClienteDtoDirector(ClienteDtoBuilder cliente) {
		this.cliente = cliente;
	}
	
	public ClienteDtoDirector build() {
		cliente.buildId();
		cliente.buildName();
		cliente.buildSobrenome();
		cliente.buildEmail();
		cliente.buildDataNascimento();
		cliente.buildDataCadastro();
		cliente.buildStatus();
		cliente.buildPerfil();
		cliente.buildDocumentos();
		return this;
	}
	
	public ClienteDto get() {
		return cliente.get();
	}
	

}
