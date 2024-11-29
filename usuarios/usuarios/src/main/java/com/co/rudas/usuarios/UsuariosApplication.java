package com.co.rudas.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan({"com.co.rudas.usuarios", "com.co.rudas.entityLibrary.models.entity"})
@EnableJpaRepositories("com.co.rudas.usuarios.repository")
@EntityScan("com.co.rudas.entityLibrary.models.entity")
public class UsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsuariosApplication.class, args);
	}

}
