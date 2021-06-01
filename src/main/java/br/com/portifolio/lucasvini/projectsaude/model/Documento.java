package br.com.portifolio.lucasvini.projectsaude.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Documento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Enumerated(EnumType.STRING)
	private TipoDocumentoEnum tipoDocumento;
	private String numeroDocumento;
	
	public Documento() {
	}

	public Documento(TipoDocumentoEnum tipoDocumento, String numeroDocumento) {
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
	}
	
	public Documento(Long id, TipoDocumentoEnum tipoDocumento, String numeroDocumento) {
		this.id = id;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
	}
}
