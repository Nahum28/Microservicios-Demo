package com.nahum.aerolineas.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nahum.commons.models.entitites.Aerolinea;

public interface AerolineaRepository extends JpaRepository<Aerolinea, Long> {

}
