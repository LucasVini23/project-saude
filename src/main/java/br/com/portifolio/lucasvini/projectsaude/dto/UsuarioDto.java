package br.com.portifolio.lucasvini.projectsaude.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import br.com.portifolio.lucasvini.projectsaude.model.StatusEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioDto implements IUsuario, Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	private String sobrenome;
	private String email;
	private LocalDate dataNascimento;
	private LocalDate dataCadastro = LocalDate.now();
	private StatusEnum status;
	private List<EspecialidadeDoProfissionalDto> listaEspecialidades;
	private PerfilDto Perfil;
	private List<DocumentoDto> documentos;
	
	public UsuarioDto(String nome, String sobrenome, String email, LocalDate dataNascimento, LocalDate dataCadastro,
			StatusEnum status, List<EspecialidadeDoProfissionalDto> listaEspecialidades, PerfilDto perfil,
			List<DocumentoDto> documentos) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.dataCadastro = dataCadastro;
		this.status = status;
		this.listaEspecialidades = listaEspecialidades;
		Perfil = perfil;
		this.documentos = documentos;
	}
	
}
