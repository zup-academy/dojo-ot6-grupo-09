package br.com.zupedu.dojo.ot4dojo.turma;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author giovanni.moratto
 */

@RestController
public class TurmaController {
	
	@Autowired
	private TurmaRepository turmaRepository;

    @PostMapping("/turmas")
    public ResponseEntity<TurmaResponse> addTurma (@RequestBody @Valid TurmaDTO request){
    	
    	Optional<TurmaModel> turma = turmaRepository.findByNome(request.getNome());
    	if(turma.isPresent()) {
    		return ResponseEntity.badRequest().build();
    	}
        
    	TurmaModel newTurma = request.toModel();
        turmaRepository.save(newTurma);
        return ResponseEntity.status(201).body(new TurmaResponse(newTurma));
    }
}
