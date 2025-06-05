package com.nahum.aerolineas.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nahum.aerolineas.AerolineaMapper;
import com.nahum.aerolineas.dto.AerolineaDTO;
import com.nahum.aerolineas.models.repository.AerolineaRepository;
import com.nahum.commons.models.entitites.Aerolinea;
import com.nahum.commons.services.CommonsServiceImpl;

@Service
public class AerolineaServicesImpl extends CommonsServiceImpl<AerolineaDTO, Aerolinea, 
	AerolineaMapper, AerolineaRepository>
	implements AerolineaService {

	@Override
	@Transactional(readOnly = true)
	public List<AerolineaDTO> listar() {
		List<AerolineaDTO> lista = new ArrayList<>();
		repository.findAll().forEach(linea -> {
			lista.add(mapper.entityToDTO(linea));
		});
		return lista;
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<AerolineaDTO> obtenerPorId(Long id) {
		Optional<Aerolinea> optAerolinea = repository.findById(id);
		if (optAerolinea.isPresent()) {
			return Optional.of(mapper.entityToDTO(optAerolinea.get()));
		}
		return Optional.empty();
	}

	@Override
	@Transactional
	public AerolineaDTO insertar(AerolineaDTO dto) {
		Aerolinea aerolinea = repository.save(mapper.dtoToEntity(dto));;
		dto.setId(aerolinea.getId());
		return dto;
	}

	@Override
	@Transactional
	public AerolineaDTO editar(AerolineaDTO dto, Long id) {
		Optional<Aerolinea> opt = repository.findById(id);
		if (opt.isPresent()) {
			Aerolinea aerolinea = opt.get();
			aerolinea.setNombre(dto.getNombre());
			aerolinea.setIata(dto.getIata());
			aerolinea.setPais(dto.getPais());
			aerolinea.setEstatus(dto.getEstatus());
			aerolinea.setFechaFundacion(dto.getFechaFundacion());
			repository.save(aerolinea);
			return mapper.entityToDTO(aerolinea);
		}
		return null;
	}

	@Override
	@Transactional
	public AerolineaDTO eliminar(Long id) {
		Optional<Aerolinea> opt = repository.findById(id);
		if (opt.isPresent()) {
			AerolineaDTO dto = mapper.entityToDTO(opt.get());
			repository.deleteById(id);
			return dto;
		}
		return null;
	}

	
	
}
