package com.nahum.vuelos.mappers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nahum.commons.mappers.CommonsMapper;
import com.nahum.commons.models.entitites.Aeropuerto;
import com.nahum.commons.models.entitites.Avion;
import com.nahum.commons.models.entitites.Vuelo;
import com.nahum.vuelos.clients.AeropuertoClient;
import com.nahum.vuelos.clients.AvionClient;
import com.nahum.vuelos.dto.VueloDTO;
import com.nahum.vuelos.models.repositories.VueloRepository;

@Component
public class VueloMapper extends CommonsMapper<VueloDTO, Vuelo,VueloRepository>{

	@Autowired
	private AvionClient avionClient;
	
	@Autowired	
	private AeropuertoClient aeropuertoClient;
	
	
	@Override
	public VueloDTO entityToDTO(Vuelo entity) {
		VueloDTO dto = new VueloDTO();
		dto.setId(entity.getId());
		dto.setCodigoVuelo(entity.getCodigoVuelo());
		dto.setIdAvion(entity.getIdAvion().getId());
		dto.setIdOrigen(entity.getIdOrigen().getId());
		dto.setIdDestino(entity.getIdDestino().getId());
		dto.setFechaSalida(entity.getFechaSalida());
		dto.setEstatus(entity.getEstatus());
		return dto;
	}

	@Override
	public Vuelo dtoToEntity(VueloDTO dto) {
		Vuelo vuelo = new Vuelo();
		
		vuelo.setCodigoVuelo(dto.getCodigoVuelo());
		
		Aeropuerto aeropuertoDestino = aeropuertoClient.getAeropuertoById(dto.getIdDestino());
		if (aeropuertoDestino != null)
			vuelo.setIdDestino(aeropuertoDestino);
		
		Aeropuerto aeropuertoOrigen = aeropuertoClient.getAeropuertoById(dto.getIdOrigen());
		if (aeropuertoOrigen != null)
			vuelo.setIdOrigen(aeropuertoOrigen);
		
		Avion avion = avionClient.getAvionById(dto.getIdAvion());
		if (aeropuertoOrigen != null)
			vuelo.setIdAvion(avion);
		
		
		vuelo.setFechaSalida(dto.getFechaSalida());
		vuelo.setEstatus(dto.getEstatus());
		
		return vuelo;
	}

	
	
	
	
}