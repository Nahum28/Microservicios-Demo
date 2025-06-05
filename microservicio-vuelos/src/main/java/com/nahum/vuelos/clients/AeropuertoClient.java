package com.nahum.vuelos.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.nahum.commons.models.entitites.Aeropuerto;

@FeignClient(name = "microservicio-aeropuertos")
public interface AeropuertoClient {

	@GetMapping("/{id}")
	public Aeropuerto getAeropuertoById(@PathVariable Long id);
}
