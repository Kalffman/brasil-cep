package com.kalffman.projects.brasilcep.adapter.output.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estado")
@Getter @Setter
public class EstadoEntity {
    @Id
    private Integer id;

    @Column(length = 2)
    private String uf;

    private String nome;

    @Column(name = "cod_ibge")
    private Integer codIbge;

}
