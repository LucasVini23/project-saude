package br.com.portifolio.lucasvini.projectsaude.factory;

import br.com.portifolio.lucasvini.projectsaude.dto.DocumentoDto;
import br.com.portifolio.lucasvini.projectsaude.model.Documento;
import br.com.portifolio.lucasvini.projectsaude.model.TipoDocumentoEnum;

public class DocumentoFactory {
	
	public static DocumentoDto createCNPJ() {
		return new DocumentoDto(TipoDocumentoEnum.CNPJ);
	}
	
	public static DocumentoDto createCNPJ(Long id, String numeroDocumento) {
		return new DocumentoDto(id, TipoDocumentoEnum.CNPJ, numeroDocumento);
	}
	
	public static DocumentoDto createCPF() {
		return new DocumentoDto(TipoDocumentoEnum.CPF);
	}
	
	public static DocumentoDto createCPF(Long id, String numeroDocumento) {
		return new DocumentoDto(id, TipoDocumentoEnum.CPF, numeroDocumento);
	}
	
	public static DocumentoDto createCRM() {
		return new DocumentoDto(TipoDocumentoEnum.CRM);
	}
	
	public static DocumentoDto createCRM(Long id, String numeroDocumento) {
		return new DocumentoDto(id, TipoDocumentoEnum.CRM, numeroDocumento);
	}

	public static DocumentoDto create(Documento documento) {
		return new DocumentoDto(documento.getId(), documento.getTipoDocumento(), documento.getNumeroDocumento());
	}
	
}
