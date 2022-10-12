package com.kalffman.projects.brasilcep.adapter.output.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "cidade")
@Getter @Setter
public class CidadeEntity {
    @Id
    private Integer id;

    private String nome;

    private String uf;

    private String cep;

    @Column(name = "cod_ibge")
    private Integer codIbge;

    private Double area;

    @ManyToOne
    @JoinColumn(name = "municipio_subordinado_id")
    private CidadeEntity municipioSubordinado;

    @ManyToOne
    @JoinColumn(name = "estado_id")
    private EstadoEntity estado;
}
