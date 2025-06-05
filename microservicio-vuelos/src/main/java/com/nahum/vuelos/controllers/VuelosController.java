package com.nahum.vuelos.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.nahum.commons.controllers.CommonsController;
import com.nahum.vuelos.dto.VueloDTO;
import com.nahum.vuelos.services.VueloServiceImpl;

@RestController
//@RequestMapping("/api/v1/vuelos")
public class VuelosController extends CommonsController<VueloDTO,VueloServiceImpl>{

	public VuelosController(VueloServiceImpl service) {
		super(service);
		// TODO Auto-generated constructor stub
	}

}
