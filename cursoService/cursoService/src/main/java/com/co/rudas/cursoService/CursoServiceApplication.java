package com.co.rudas.cursoService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan({"com.co.rudas.cursoService", "com.co.rudas.entityLibrary.models.entity"})
@EnableJpaRepositories("com.co.rudas.cursoService.repository")
@EntityScan("com.co.rudas.entityLibrary.models.entity")
public class CursoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursoServiceApplication.class, args);
	}

}
