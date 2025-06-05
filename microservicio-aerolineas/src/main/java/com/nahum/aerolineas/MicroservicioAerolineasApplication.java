package com.nahum.aerolineas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.nahum.commons.models.entitites"})
public class MicroservicioAerolineasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioAerolineasApplication.class, args);
	}

}
