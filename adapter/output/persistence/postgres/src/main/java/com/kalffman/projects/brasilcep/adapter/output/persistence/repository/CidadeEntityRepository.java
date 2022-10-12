package com.kalffman.projects.brasilcep.adapter.output.persistence.repository;

import com.kalffman.projects.brasilcep.adapter.output.persistence.entity.CidadeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CidadeEntityRepository extends JpaRepository<CidadeEntity, Integer> {

    Optional<CidadeEntity> findByCep(String cep);

    Optional<List<CidadeEntity>> findAllByUfIgnoreCase(String uf);
}
