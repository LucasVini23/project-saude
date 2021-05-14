package br.com.portifolio.lucasvini.projectsaude.model;

public enum TipoDocumentoEnum {

	CPF("cpf"), CNPJ("cnpj"), CRM("crm");
	
	private String tipo;

	private TipoDocumentoEnum(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}
	
}
