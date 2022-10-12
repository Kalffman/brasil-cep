package com.kalffman.projects.brasilcep.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Cidade {
    private Integer id;
    private String nome;
    private String uf;
    private String cep;
    private Integer codIbge;
    private Long area;
}
