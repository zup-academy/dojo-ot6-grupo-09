package br.com.zupedu.dojo.ot4dojo.turma;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @Author giovanni.moratto
 */

@RestController
public class TurmaController {

    public ResponseEntity<TurmaResponse> addTurma (@RequestBody @Valid TurmaDTO request){
        TurmaModel newTurma = request.toModel();

        return ResponseEntity.ok(new TurmaResponse);
    }
}
