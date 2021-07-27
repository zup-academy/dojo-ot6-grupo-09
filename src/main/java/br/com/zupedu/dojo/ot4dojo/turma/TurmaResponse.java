package br.com.zupedu.dojo.ot4dojo.turma;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class TurmaResponse {
  private Long id;

  private String nome;

  private LocalDate iniciaEm;

  private LocalDate terminaEm;

  public TurmaResponse(TurmaModel turmaModel) {
    this.id = turmaModel.getId();
    this.nome = turmaModel.getNome();
    this.iniciaEm = turmaModel.getIniciaEm();
    this.terminaEm = turmaModel.getTerminaEm();
  }

  public Long getId() {
    return this.id;
  }

  public String getNome() {
    return this.nome;
  }

  public LocalDate getIniciaEm() {
    return this.iniciaEm;
  }

  public LocalDate getTerminaEm() {
    return this.terminaEm;
  }
}
