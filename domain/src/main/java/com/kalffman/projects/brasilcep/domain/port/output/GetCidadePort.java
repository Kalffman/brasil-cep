package com.kalffman.projects.brasilcep.domain.port.output;

import com.kalffman.projects.brasilcep.domain.model.Cidade;

import java.util.List;

import static com.kalffman.projects.brasilcep.domain.utils.DomainExceptions.notImplemented;

public interface GetCidadePort {

    default Cidade byCep(String cep) {
        throw notImplemented("GetCidadePort.byCep");
    }

    default List<Cidade> byUf(String uf) {
        throw notImplemented("GetCidadePort.byUf");
    }
}
