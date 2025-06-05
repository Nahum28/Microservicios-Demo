package com.nahum.avion.dto;

import java.time.LocalDate;

import com.nahum.commons.models.entitites.Aerolinea;


public class AvionDTOGet {

	private Long id;

	private Long numRegistro;

	private String tipo; 

	private String codigoModelo; 
	
	private Long capacidad;
	
	private LocalDate fechaPrimerVuelo;
	
	private Long estatus;
	
	private Aerolinea idAerolinea;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNumRegistro() {
		return numRegistro;
	}

	public void setNumRegistro(Long numRegistro) {
		this.numRegistro = numRegistro;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCodigoModelo() {
		return codigoModelo;
	}

	public void setCodigoModelo(String codigoModelo) {
		this.codigoModelo = codigoModelo;
	}

	public Long getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Long capacidad) {
		this.capacidad = capacidad;
	}

	public LocalDate getFechaPrimerVuelo() {
		return fechaPrimerVuelo;
	}

	public void setFechaPrimerVuelo(LocalDate fechaPrimerVuelo) {
		this.fechaPrimerVuelo = fechaPrimerVuelo;
	}

	public Long getEstatus() {
		return estatus;
	}

	public void setEstatus(Long estatus) {
		this.estatus = estatus;
	}

	public Aerolinea getIdAerolinea() {
		return idAerolinea;
	}

	public void setIdAerolinea(Aerolinea idAerolinea) {
		this.idAerolinea = idAerolinea;
	}
	

}
