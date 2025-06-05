package com.nahum.aerolineas.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.nahum.aerolineas.dto.AerolineaDTO;
import com.nahum.aerolineas.services.AerolineaService;
import com.nahum.commons.controllers.CommonsController;


@RestController
//@RequestMapping("/api/v1/aerolineas")
public class AerolineaController extends CommonsController<AerolineaDTO, AerolineaService> {

	public AerolineaController(AerolineaService service) {
		super(service);
	}

	
	
}
