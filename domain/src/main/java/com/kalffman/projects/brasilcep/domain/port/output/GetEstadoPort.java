package com.kalffman.projects.brasilcep.domain.port.output;

import com.kalffman.projects.brasilcep.domain.model.Estado;

import java.util.List;

import static com.kalffman.projects.brasilcep.domain.utils.DomainExceptions.notImplemented;

public interface GetEstadoPort {

    default Estado byUF(String uf) {
        throw notImplemented("GetEstadoPort.byUF");
    }

    default Estado byCodIbge(Integer codIbge) {
        throw notImplemented("GetEstadoPort.byCodIbge");
    }

    default List<Estado> list() {
        throw notImplemented("GetEstadoPort.list");
    }

}
