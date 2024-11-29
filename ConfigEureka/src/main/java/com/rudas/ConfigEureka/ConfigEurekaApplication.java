package com.rudas.ConfigEureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigEurekaApplication.class, args);
	}

}
