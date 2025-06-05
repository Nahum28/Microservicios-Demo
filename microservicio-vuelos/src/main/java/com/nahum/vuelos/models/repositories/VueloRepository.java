package com.nahum.vuelos.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nahum.commons.models.entitites.Vuelo;

@Repository
public interface VueloRepository extends JpaRepository<Vuelo, Long> {

}
