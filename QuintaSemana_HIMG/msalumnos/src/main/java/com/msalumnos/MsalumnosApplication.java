package com.msalumnos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
// Habilitamos el uso de repositorios del proyecto persistence
@EnableJpaRepositories("com.persistence.repository")
// Habilitamos el escaneo de entidades del proyecto persistences
@EntityScan("com.persistence.entity")
public class MsalumnosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsalumnosApplication.class, args);
	}

}
