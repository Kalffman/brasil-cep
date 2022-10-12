package com.kalffman.projects.brasilcep.adapter.input.rest.controller;

import com.kalffman.projects.brasilcep.domain.annotation.CEP;
import com.kalffman.projects.brasilcep.domain.model.Cidade;
import com.kalffman.projects.brasilcep.domain.port.output.GetCidadePort;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Validated
public class CidadeController {

    private final GetCidadePort getCidade;

    @GetMapping("/cidade/{cep}")
    public ResponseEntity<Cidade> getCidadeByCep(@CEP @PathVariable String cep) {
        return ResponseEntity.ok(getCidade.byCep(cep));
    }
}
