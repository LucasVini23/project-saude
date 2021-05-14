package br.com.portifolio.lucasvini.projectsaude.model;

import javax.persistence.Embeddable;

@Embeddable
public class Documento {

	private TipoDocumentoEnum tipoDocumento;
	private String numeroDocumento;
	
	public Documento() {
	}

	public Documento(TipoDocumentoEnum tipoDocumento, String numeroDocumento) {
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
	}

	public TipoDocumentoEnum getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumentoEnum tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	
}
