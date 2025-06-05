package com.nahum.vuelos.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nahum.commons.models.entitites.Vuelo;
import com.nahum.commons.services.CommonsServiceImpl;
import com.nahum.vuelos.dto.VueloDTO;
import com.nahum.vuelos.mappers.VueloMapper;
import com.nahum.vuelos.models.repositories.VueloRepository;

@Service
public class VueloServiceImpl extends CommonsServiceImpl<VueloDTO, Vuelo, VueloMapper,
	VueloRepository> implements VueloService {


	
	@Override
	@Transactional(readOnly = true)
	public List<VueloDTO> listar() {
		List<VueloDTO> lista = new ArrayList<>();
		repository.findAll().forEach(linea -> {
			lista.add(mapper.entityToDTO(linea));
		});
		return lista;
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<VueloDTO> obtenerPorId(Long id) {
		Optional<Vuelo> opt = repository.findById(id);
		if (opt.isPresent()) {
			return Optional.of(mapper.entityToDTO(opt.get()));
		}
		return Optional.empty();
	}

	@Override
	@Transactional
	public VueloDTO insertar(VueloDTO dto) {
		Vuelo vuelo = mapper.dtoToEntity(dto);
		repository.save(vuelo);
		return dto;
	}

	@Override
	@Transactional
	public VueloDTO editar(VueloDTO dto, Long id) {
		Optional<Vuelo> opt = repository.findById(id);
		if (opt.isPresent()) {
			dto.setId(id);
			return mapper.entityToDTO(repository.save(mapper.dtoToEntity(dto)));
		}
		return null;
	}

	@Override
	@Transactional
	public VueloDTO eliminar(Long id) {
		Optional<Vuelo> opt = repository.findById(id);
		if (opt.isPresent()) {
			VueloDTO dto = mapper.entityToDTO(opt.get());
			repository.deleteById(id);
			return dto;
		}
		return null;
	}

	
}
