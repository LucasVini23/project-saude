package br.com.portifolio.lucasvini.projectsaude.dto;

import br.com.portifolio.lucasvini.projectsaude.model.TipoDocumentoEnum;

public class DocumentoDto {

	private Long id;
	private TipoDocumentoEnum tipoDocumento;
	private String numeroDocumento;
	
	public DocumentoDto(TipoDocumentoEnum tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public DocumentoDto(Long id, TipoDocumentoEnum tipoDocumento, String numeroDocumento) {
		this.id = id;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
	}

	public DocumentoDto(TipoDocumentoEnum tipoDocumento, String numeroDocumento) {
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
	}

	public Long getId() {
		return id;
	}

	public TipoDocumentoEnum getTipoDocumento() {
		return tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	
}
