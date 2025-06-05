package com.nahum.aeropuertos.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nahum.commons.models.entitites.Aeropuerto;

@Repository
public interface AeropuertoRepository extends JpaRepository<Aeropuerto, Long> {

}
