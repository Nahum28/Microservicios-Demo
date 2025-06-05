package com.nahum.avion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EntityScan("com.nahum.commons.models.entitites")
@EnableFeignClients
public class MicroservicioAvionApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioAvionApplication.class, args);
	}

}
