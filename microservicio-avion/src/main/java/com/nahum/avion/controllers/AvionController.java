package com.nahum.avion.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.nahum.avion.dto.AvionDTO;
import com.nahum.avion.services.AvionServiceImpl;
import com.nahum.commons.controllers.CommonsController;

@RestController
//@RequestMapping("/api/v1/aviones")
public class AvionController extends CommonsController<AvionDTO, AvionServiceImpl>{

	public AvionController(AvionServiceImpl service) {
		super(service);
		// TODO Auto-generated constructor stub
	}

}
