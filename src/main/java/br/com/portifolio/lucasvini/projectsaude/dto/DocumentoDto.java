package br.com.portifolio.lucasvini.projectsaude.dto;

import br.com.portifolio.lucasvini.projectsaude.model.TipoDocumentoEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DocumentoDto {

	private Long id;
	private TipoDocumentoEnum tipoDocumento;
	private String numeroDocumento;
	
	public DocumentoDto() {
	}

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
	
}
