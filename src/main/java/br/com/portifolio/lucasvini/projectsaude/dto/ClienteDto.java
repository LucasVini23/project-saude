package br.com.portifolio.lucasvini.projectsaude.dto;

import java.time.LocalDate;
import java.util.List;

import br.com.portifolio.lucasvini.projectsaude.model.StatusEnum;

public class ClienteDto extends UsuarioDto {
	
	private static final long serialVersionUID = 1L;
	
	public ClienteDto(String nome, String sobrenome, String email, LocalDate dataNascimento, LocalDate dataCadastro,
			StatusEnum status, List<EspecialidadeDoProfissionalDto> listaEspecialidades, PerfilDto perfil,
			List<DocumentoDto> documentos) {
		super(nome, sobrenome, email, dataNascimento, dataCadastro, status, listaEspecialidades, perfil, documentos);
	}
	
}
