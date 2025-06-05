package com.nahum.avion.dto;

import java.time.LocalDate;

import com.nahum.commons.models.entitites.Aerolinea;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;




public class AvionDTO {
	
	
	private Long id;
	

	private Long numRegistro;

	@NotBlank( message = "El tipo no puede ser blnaco")
	private String tipo; 

	@NotBlank( message = "El codigo de registro no puede ser blnaco")
	private String codigoModelo; 
	
	@Min(value = 1 , message = "La capacida debe ser mayor a 1")
	private Long capacidad;
	
	@Past(message = "LA fecha debe ser menor al dia de hoy")
	private LocalDate fechaPrimerVuelo;
	
	@Min ( value = 1, message = "el estats no puede ser menor a 1")
	@Max ( value = 2, message = "El estatus no puedes ser mayor a 2")
	private Long estatus;
	
	@NotNull
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
