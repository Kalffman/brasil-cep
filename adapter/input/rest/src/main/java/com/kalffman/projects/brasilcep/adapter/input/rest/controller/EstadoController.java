package com.kalffman.projects.brasilcep.adapter.input.rest.controller;

import com.kalffman.projects.brasilcep.adapter.output.persistence.service.GetCidadeAdapter;
import com.kalffman.projects.brasilcep.adapter.output.persistence.service.GetEstadoAdapter;
import com.kalffman.projects.brasilcep.domain.model.Cidade;
import com.kalffman.projects.brasilcep.domain.model.Estado;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class EstadoController {

    private final GetEstadoAdapter getEstado;
    private final GetCidadeAdapter getCidade;

    @GetMapping("/estado/{uf}")
    public ResponseEntity<Estado> getEstadoByUf(@PathVariable String uf) {
        return ResponseEntity.ok(getEstado.byUF(uf));
    }

    @GetMapping("/estado/{uf}/cidades")
    public ResponseEntity<List<Cidade>> getCidadeListByUf(@PathVariable String uf) {
        return ResponseEntity.ok(getCidade.byUf(uf));
    }
}
