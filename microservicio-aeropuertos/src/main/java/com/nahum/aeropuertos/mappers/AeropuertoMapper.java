package com.nahum.aeropuertos.mappers;

import org.springframework.stereotype.Component;

import com.nahum.aeropuertos.dto.AeropuertoDTO;
import com.nahum.aeropuertos.models.repositories.AeropuertoRepository;
import com.nahum.commons.mappers.CommonsMapper;
import com.nahum.commons.models.entitites.Aeropuerto;

@Component
public class AeropuertoMapper extends CommonsMapper<AeropuertoDTO, Aeropuerto, AeropuertoRepository> {

	@Override
	public AeropuertoDTO entityToDTO(Aeropuerto entity) {
		AeropuertoDTO dto = new AeropuertoDTO();
		dto.setId(entity.getId());
		dto.setNombre(entity.getNombre());
		dto.setCodigo(entity.getIata());
		dto.setLatitud(entity.getLatitud());
		dto.setLongitud(entity.getLongitud());
		dto.setPais(entity.getPais());
		dto.setEstatus(entity.getEstatus());

		return  dto;
	}

	@Override
	public Aeropuerto dtoToEntity(AeropuertoDTO dto) {
		Aeropuerto entity = new Aeropuerto();
		entity.setId(dto.getId());
		entity.setNombre(dto.getNombre());
		entity.setLatitud(dto.getLatitud());
		entity.setLongitud(dto.getLatitud());
		entity.setPais(dto.getPais());
		entity.setEstatus(dto.getEstatus());
		entity.setIata(dto.getCodigo());
		return entity;
	}

	
}
