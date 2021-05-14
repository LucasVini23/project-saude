package br.com.portifolio.lucasvini.projectsaude.model;

public enum StatusEnum {

	DESLIGADO(0),ATIVO(1);
	
	private int status;

	private StatusEnum(int status) {
		this.status = status;
	}

	public int getStatus() {
		return status;
	}
	
}
