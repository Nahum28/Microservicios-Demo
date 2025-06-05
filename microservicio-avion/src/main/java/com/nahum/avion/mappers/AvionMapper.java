package com.nahum.avion.mappers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nahum.avion.clients.AerolineaClient;
import com.nahum.avion.dto.AvionDTO;
import com.nahum.avion.models.repositories.AvionRepository;
import com.nahum.commons.mappers.CommonsMapper;
import com.nahum.commons.models.entitites.Aerolinea;
import com.nahum.commons.models.entitites.Avion;

@Component
public class AvionMapper extends CommonsMapper<AvionDTO, Avion,AvionRepository> {

	@Autowired
	private AerolineaClient client;
	
	@Override
	public AvionDTO entityToDTO(Avion entity) {
		AvionDTO dto = new AvionDTO();
		dto.setId(entity.getId());
		dto.setNumRegistro(entity.getNumRegistro());
		dto.setTipo(entity.getTipo());
		dto.setCodigoModelo(entity.getCodigoModelo());
		dto.setCapacidad(entity.getCapacidad());
		dto.setFechaPrimerVuelo(entity.getFechaPrimerVuelo());
		dto.setEstatus(entity.getEstatus());
		dto.setIdAerolinea(entity.getAerolinea());
		
		
		return dto;
	}

	@Override
	public Avion dtoToEntity(AvionDTO dto) {
		Avion entity = new Avion();
		entity.setId(dto.getId());
		entity.setNumRegistro(dto.getNumRegistro());
		entity.setTipo(dto.getTipo());
		entity.setCodigoModelo(dto.getCodigoModelo());
		entity.setCapacidad(dto.getCapacidad());
		entity.setFechaPrimerVuelo(dto.getFechaPrimerVuelo());
		entity.setEstatus(dto.getEstatus());
		Aerolinea aerolinea = client.getAerolineaById(dto.getIdAerolinea().getId());
		if (aerolinea != null)
			entity.setAerolinea(aerolinea);
		return entity;
	}

	
}
