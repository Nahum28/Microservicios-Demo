package com.nahum.avion.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nahum.avion.dto.AvionDTO;
import com.nahum.avion.mappers.AvionMapper;
import com.nahum.avion.models.repositories.AvionRepository;
import com.nahum.commons.models.entitites.Avion;
import com.nahum.commons.services.CommonsServiceImpl;

@Service
public class AvionServiceImpl extends CommonsServiceImpl<AvionDTO, Avion, AvionMapper,AvionRepository> 
implements AvionService{


	
	@Override
	@Transactional(readOnly = true)
	public List<AvionDTO> listar() {
		List<AvionDTO> lista = new ArrayList<>();
		repository.findAll().forEach(linea -> {
			lista.add(mapper.entityToDTO(linea));
		});
		return lista;
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<AvionDTO> obtenerPorId(Long id) {
		Optional<Avion> opt = repository.findById(id);
		if (opt.isPresent()) {
			return Optional.of(mapper.entityToDTO(opt.get()));
		}
		return Optional.empty();
	}

	@Override
	@Transactional
	public AvionDTO insertar(AvionDTO dto) {
		Avion avion = mapper.dtoToEntity(dto);
		repository.save(avion);
		return dto;
	}

	@Override
	@Transactional
	public AvionDTO editar(AvionDTO dto, Long id) {
		Optional<Avion> opt = repository.findById(id);
		if (opt.isPresent()) {
			dto.setId(id);
			return  mapper.entityToDTO(repository.save(mapper.dtoToEntity(dto)));
		}
		return null;
	}

	@Override
	@Transactional
	public AvionDTO eliminar(Long id) {
		Optional<Avion> opt = repository.findById(id);
		if (opt.isPresent()) {
			AvionDTO dto = mapper.entityToDTO(opt.get());
			repository.deleteById(id);
			return dto;
		}
		return null;
	}

	
}
