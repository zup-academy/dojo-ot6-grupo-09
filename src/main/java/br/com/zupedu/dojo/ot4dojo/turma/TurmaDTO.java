package br.com.zupedu.dojo.ot4dojo.turma;

import br.com.zupedu.dojo.ot4dojo.validator.UniqueValue;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

/**
 * @Author giovanni.moratto
 */

public class TurmaDTO {

	@NotBlank
	@Length(max = 50)
	@UniqueValue(domainClass = TurmaModel.class, fieldName = "nome" )
	private String nome;

	@NotNull
	@UniqueValue(domainClass = TurmaModel.class, fieldName = "iniciaEm")
	private LocalDate iniciaEm;

	@NotNull
	private LocalDate terminaEm;

	public TurmaDTO(String nome, LocalDate iniciaEm, LocalDate terminaEm) {
		this.nome = nome;
		this.iniciaEm = iniciaEm;
		this.terminaEm = terminaEm;
	}

	public TurmaModel toModel() {
		return new TurmaModel(this.nome, this.iniciaEm, this.terminaEm);
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getIniciaEm() {
		return iniciaEm;
	}

	public LocalDate getTerminaEm() {
		return terminaEm;
	}

}
