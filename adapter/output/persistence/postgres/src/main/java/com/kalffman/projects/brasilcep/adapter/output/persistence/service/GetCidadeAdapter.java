package com.kalffman.projects.brasilcep.adapter.output.persistence.service;

import com.kalffman.projects.brasilcep.adapter.output.persistence.entity.CidadeEntity;
import com.kalffman.projects.brasilcep.adapter.output.persistence.repository.CidadeEntityRepository;
import com.kalffman.projects.brasilcep.domain.model.Cidade;
import com.kalffman.projects.brasilcep.domain.port.output.GetCidadePort;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GetCidadeAdapter implements GetCidadePort {

    private final CidadeEntityRepository cidadeEntityRepository;
    private final ModelMapper mapper;

    @Override
    public Cidade byCep(String cep) {
        CidadeEntity entity = cidadeEntityRepository
            .findByCep(cep)
            .orElse(null);

        return mapper.map(entity, Cidade.class);
    }

    @Override
    public List<Cidade> byUf(String uf) {
        List<CidadeEntity> entities = cidadeEntityRepository
            .findAllByUfIgnoreCase(uf)
            .orElse(null);

        return mapper.map(entities, new TypeToken<List<Cidade>>(){}.getType());
    }
}
