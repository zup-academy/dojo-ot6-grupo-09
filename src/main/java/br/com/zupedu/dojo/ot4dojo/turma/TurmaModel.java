package br.com.zupedu.dojo.ot4dojo.turma;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class TurmaModel {
  @Id
  @GeneratedValue
  private Long id;

  private String nome;

  @NotNull
  private LocalDate iniciaEm;
  @NotNull
  private LocalDate terminaEm;

  public TurmaModel(String nome, LocalDate iniciaEm, LocalDate terminaEm) {
    this.nome = nome;
    this.iniciaEm = iniciaEm;
    this.terminaEm = terminaEm;
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
