package com.kalffman.projects.brasilcep.adapter.output.persistence.exception;

import javax.persistence.EntityNotFoundException;

public class EstadoNotFoundExcepiton extends EntityNotFoundException {

    public EstadoNotFoundExcepiton() {
        super("Estado não encontrado");
    }
}
