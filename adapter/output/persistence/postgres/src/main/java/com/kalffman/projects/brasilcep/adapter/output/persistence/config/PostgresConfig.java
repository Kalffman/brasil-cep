package com.kalffman.projects.brasilcep.adapter.output.persistence.config;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories({"com.kalffman.projects.brasilcep.adapter.output.persistence.repository"})
public class PostgresConfig {
}
