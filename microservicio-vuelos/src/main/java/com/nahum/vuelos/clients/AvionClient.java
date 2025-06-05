package com.nahum.vuelos.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.nahum.commons.models.entitites.Avion;

@FeignClient("microservicio-avion")
public interface AvionClient {

	@GetMapping("/{id}")
	public Avion getAvionById(@PathVariable Long id);

}
