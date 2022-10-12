package com.kalffman.projects.brasilcep.adapter.output.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "endereco")
@Getter @Setter
public class EnderecoEntity {
    @Id
    private String cep;

    private String logradouro;

    @Column(name = "tipo_logradouro")
    private String tipoLogradouro;

    private String complemento;

    private String local;

    @ManyToOne
    private CidadeEntity cidade;

    @ManyToOne
    private BairroEntity bairro;
}
