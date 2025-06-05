package com.nahum.aeropuertos.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class AeropuertoDTO  {

	private Long id;

	@NotBlank(message = "El Nombre no puede estar en blanco")
	private String nombre; 

	@NotBlank(message = "El Codigo no puede estar en blanco")
	private String codigo; 
	
	@NotBlank(message = "La Latitud no puede estar en blanco")
	private String latitud;
	
	@NotBlank(message = "La Longitud no puede estar en blanco")
	private String longitud;
	
	@NotBlank(message = "El Pais no puede estar en blanco")
	private String pais;
	
	@Min ( value = 1, message = "el estats no puede ser menor a 1")
	@Max ( value = 2, message = "El estatus no puedes ser mayor a 2")
	private Long estatus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Long getEstatus() {
		return estatus;
	}

	public void setEstatus(Long estatus) {
		this.estatus = estatus;
	}

	
	
	
	
}
