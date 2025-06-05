package com.nahum.aeropuertos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.nahum.commons.models.entitites"})
public class MicroservicioAeropuertosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioAeropuertosApplication.class, args);
	}

}
