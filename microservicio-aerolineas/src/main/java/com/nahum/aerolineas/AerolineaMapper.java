package com.nahum.aerolineas;

import org.springframework.stereotype.Component;

import com.nahum.aerolineas.dto.AerolineaDTO;
import com.nahum.aerolineas.models.repository.AerolineaRepository;
import com.nahum.commons.mappers.CommonsMapper;
import com.nahum.commons.models.entitites.Aerolinea;

@Component
public class AerolineaMapper extends CommonsMapper<AerolineaDTO, Aerolinea, AerolineaRepository>{

	@Override
	public AerolineaDTO entityToDTO(Aerolinea entity) {
		AerolineaDTO dto = new AerolineaDTO();
		dto.setId(entity.getId());
		dto.setNombre(entity.getNombre());
		dto.setIata(entity.getIata());
		dto.setPais(entity.getPais());
		dto.setEstatus(entity.getEstatus());
		dto.setFechaFundacion(entity.getFechaFundacion());
		
		return dto;
	}

	@Override
	public Aerolinea dtoToEntity(AerolineaDTO dto) {
		Aerolinea entity = new Aerolinea();
		entity.setId(dto.getId());
		entity.setNombre(dto.getNombre());
		entity.setIata(dto.getIata());
		entity.setPais(dto.getPais());
		entity.setEstatus(dto.getEstatus());
		entity.setFechaFundacion(dto.getFechaFundacion());
		
		return entity;
	}
	
	

}
