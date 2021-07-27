package br.com.zupedu.dojo.ot4dojo.turma;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;

/**
 * @Author giovanni.moratto
 */

public class TurmaDTO {

    @NotBlank
    private String nome;
    private LocalDate iniciaEm;
    private LocalDate terminaEm;

}
