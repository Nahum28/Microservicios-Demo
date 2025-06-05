package com.nahum.avion.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nahum.commons.models.entitites.Avion;

@Repository
public interface AvionRepository  extends JpaRepository<Avion, Long> {

}
