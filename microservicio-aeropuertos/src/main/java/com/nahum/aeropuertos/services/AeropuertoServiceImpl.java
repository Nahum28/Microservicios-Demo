package com.nahum.aeropuertos.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nahum.aeropuertos.dto.AeropuertoDTO;
import com.nahum.aeropuertos.mappers.AeropuertoMapper;
import com.nahum.aeropuertos.models.repositories.AeropuertoRepository;
import com.nahum.commons.models.entitites.Aeropuerto;
import com.nahum.commons.services.CommonsServiceImpl;

@Service
public class AeropuertoServiceImpl extends CommonsServiceImpl<AeropuertoDTO, Aeropuerto,
     AeropuertoMapper,AeropuertoRepository>  implements AeropuertoService{

	@Override
	@Transactional(readOnly = true)
	public List<AeropuertoDTO> listar() {
		List<AeropuertoDTO> lista = new ArrayList<>();
		repository.findAll().forEach(linea -> {
			lista.add(mapper.entityToDTO(linea));
		});
		return lista;
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<AeropuertoDTO> obtenerPorId(Long id) {
		Optional<Aeropuerto> opt = repository.findById(id);
		if (opt.isPresent()) {
			return Optional.of(mapper.entityToDTO(opt.get()));
		}
		return Optional.empty();
	}

	@Override
	@Transactional
	public AeropuertoDTO insertar(AeropuertoDTO dto) {
		Aeropuerto aeropuerto = mapper.dtoToEntity(dto);
		repository.save(aeropuerto);
		return dto;
	}

	@Override
	@Transactional
	public AeropuertoDTO editar(AeropuertoDTO dto, Long id) {
		Optional<Aeropuerto> opt = repository.findById(id);
		if (opt.isPresent()) {
			Aeropuerto entity = new Aeropuerto();
			entity.setId(id);
			entity.setNombre(dto.getNombre());
			entity.setLatitud(dto.getLatitud());
			entity.setLongitud(dto.getLatitud());
			entity.setPais(dto.getPais());
			entity.setEstatus(dto.getEstatus());
			entity.setIata(dto.getCodigo());
			repository.save(entity);
			return mapper.entityToDTO(entity);
		}
		return null;
	}

	@Override
	@Transactional
	public AeropuertoDTO eliminar(Long id) {
		Optional<Aeropuerto> opt = repository.findById(id);
		if (opt.isPresent()) {
			AeropuertoDTO dto = mapper.entityToDTO(opt.get());
			repository.deleteById(id);
			return dto;
		}
		return null;
	}
	
	

}
