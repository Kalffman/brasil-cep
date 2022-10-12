package com.kalffman.projects.brasilcep.domain.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Estado {
    private String id;
    private String uf;
    private String nome;
    private Integer codIbge;
}
