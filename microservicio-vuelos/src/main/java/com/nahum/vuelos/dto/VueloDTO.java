package com.nahum.vuelos.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;



public class VueloDTO {

	private Long id;

	@NotBlank ( message = "El condigo de vuelo no puede ser blanco")
	private String codigoVuelo; 

	@NotNull (message = "El id avion no puede ser nulo")
	private Long idAvion; 
	
	@NotNull (message = "El id origen no puede ser nulo")
	private Long idOrigen;
	
	@NotNull (message = "El id destino no puede ser nulo")
	private Long idDestino;
	
	@Future ( message = "La fecha de salida debe ser futura ")
	private LocalDate fechaSalida;
	

	@Min ( value = 1, message = "el estats no puede ser menor a 1")
	@Max ( value = 2, message = "El estatus no puedes ser mayor a 2")
	private Long estatus;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCodigoVuelo() {
		return codigoVuelo;
	}


	public void setCodigoVuelo(String codigoVuelo) {
		this.codigoVuelo = codigoVuelo;
	}


	public Long getIdAvion() {
		return idAvion;
	}


	public void setIdAvion(Long idAvion) {
		this.idAvion = idAvion;
	}


	public Long getIdOrigen() {
		return idOrigen;
	}


	public void setIdOrigen(Long idOrigen) {
		this.idOrigen = idOrigen;
	}


	public Long getIdDestino() {
		return idDestino;
	}


	public void setIdDestino(Long idDestino) {
		this.idDestino = idDestino;
	}


	public LocalDate getFechaSalida() {
		return fechaSalida;
	}


	public void setFechaSalida(LocalDate fechaSalida) {
		this.fechaSalida = fechaSalida;
	}


	public Long getEstatus() {
		return estatus;
	}


	public void setEstatus(Long estatus) {
		this.estatus = estatus;
	}
	
	
	
	
}
