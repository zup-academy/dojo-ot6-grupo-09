package br.com.zupedu.dojo.ot4dojo.turma;

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
    private String nome;

    @NotNull
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
}
