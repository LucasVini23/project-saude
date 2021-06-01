package br.com.portifolio.lucasvini.projectsaude.dto;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.portifolio.lucasvini.projectsaude.model.StatusEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteDto {
	
	private Long id;
	private String nome;
	private String sobrenome;
	private String email;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataNascimento;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataCadastro = LocalDate.now();
	private StatusEnum status;
	private PerfilDto perfil;
	private List<DocumentoDto> documentos;
	
	public ClienteDto() {
	}

	public ClienteDto(Long id, String nome, String sobrenome, String email, LocalDate dataNascimento,
			LocalDate dataCadastro, StatusEnum status, PerfilDto perfil, List<DocumentoDto> documentos) {
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.dataCadastro = dataCadastro;
		this.status = status;
		this.perfil = perfil;
		this.documentos = documentos;
	}
	
}
