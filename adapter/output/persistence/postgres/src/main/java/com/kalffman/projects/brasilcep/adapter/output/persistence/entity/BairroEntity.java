package com.kalffman.projects.brasilcep.adapter.output.persistence.entity;

import com.kalffman.projects.brasilcep.domain.model.Bairro;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bairro")
@Getter @Setter
public class BairroEntity {

    @Id
    private Integer id;

    private String nome;

    @ManyToOne
    private CidadeEntity cidade;
}
