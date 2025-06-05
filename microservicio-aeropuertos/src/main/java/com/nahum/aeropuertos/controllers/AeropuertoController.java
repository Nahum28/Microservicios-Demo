package com.nahum.aeropuertos.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.nahum.aeropuertos.dto.AeropuertoDTO;
import com.nahum.aeropuertos.services.AeropuertoServiceImpl;
import com.nahum.commons.controllers.CommonsController;

@RestController
//@RequestMapping("/api/v1/aeropuertos")
public class AeropuertoController extends CommonsController<AeropuertoDTO,AeropuertoServiceImpl>{

	public AeropuertoController(AeropuertoServiceImpl service) {
		super(service);
		// TODO Auto-generated constructor stub
	}

}
