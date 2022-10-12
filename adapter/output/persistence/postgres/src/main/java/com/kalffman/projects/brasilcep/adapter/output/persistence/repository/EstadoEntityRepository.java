package com.kalffman.projects.brasilcep.adapter.output.persistence.repository;

import com.kalffman.projects.brasilcep.adapter.output.persistence.entity.EstadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface EstadoEntityRepository extends JpaRepository<EstadoEntity, Integer> {

    Optional<EstadoEntity> findByUfIgnoreCase(String uf);

}
