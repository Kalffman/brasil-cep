package com.kalffman.projects.brasilcep.adapter.output.persistence.service;

import com.kalffman.projects.brasilcep.adapter.output.persistence.entity.EstadoEntity;
import com.kalffman.projects.brasilcep.adapter.output.persistence.repository.EstadoEntityRepository;
import com.kalffman.projects.brasilcep.domain.model.Estado;
import com.kalffman.projects.brasilcep.domain.port.output.GetEstadoPort;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GetEstadoAdapter implements GetEstadoPort {

    private final EstadoEntityRepository estadoEntityRepository;
    private final ModelMapper modelMapper;

    @Override
    public Estado byUF(String uf) {
        EstadoEntity entity = estadoEntityRepository
            .findByUfIgnoreCase(uf)
            .orElse(null);

        return modelMapper.map(entity, Estado.class);
    }

}
