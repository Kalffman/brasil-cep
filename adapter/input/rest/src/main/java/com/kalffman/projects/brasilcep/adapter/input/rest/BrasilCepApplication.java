package com.kalffman.projects.brasilcep.adapter.input.rest;

import com.kalffman.projects.brasilcep.adapter.output.persistence.config.PostgresConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ComponentScan({
    "com.kalffman.projects.brasilcep.adapter.output.persistence.service",
    "com.kalffman.projects.brasilcep.adapter.output.persistence.mapper",
    "com.kalffman.projects.brasilcep.adapter.input.rest.controller",
})
@EntityScan({
    "com.kalffman.projects.brasilcep.adapter.output.persistence.entity"
})
@Import(PostgresConfig.class)
public class BrasilCepApplication {

    public static void main(String[] args) {
        SpringApplication.run(BrasilCepApplication.class, args);
    }

}
