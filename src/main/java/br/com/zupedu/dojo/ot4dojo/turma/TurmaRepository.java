package br.com.zupedu.dojo.ot4dojo.turma;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TurmaRepository extends JpaRepository<TurmaModel, Long> {
	Optional<TurmaModel> findByNome(String nome);
}
