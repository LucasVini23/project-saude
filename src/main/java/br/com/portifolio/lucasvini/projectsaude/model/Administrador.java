package br.com.portifolio.lucasvini.projectsaude.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Administrador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(min=2, max= 50, message = "O nome precisa ter duas letras ou mais")
	private String nome;
	@Size(min=2, max= 50, message = "O sobrenome precisa ter duas letras ou mais")
	private String sobrenome;
	@NotNull
	@Email(message = "É preciso inserir um email valido")
	private String email;
	@NotNull(message = "É preciso inserir uma data de nascimento valida")
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataDeNascimento;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataDeCadastro = LocalDate.now();
	
	public Administrador() {
	}
	
	public Administrador(String nome, String sobrenome, String email, LocalDate dataDeNascimento) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.dataDeNascimento = dataDeNascimento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Administrador other = (Administrador) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
