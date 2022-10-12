package com.kalffman.projects.brasilcep.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Endereco {
    private String cep;
    private String logradouro;
    private String tipoLogradouro;
    private String complemento;
    private String local;
}
