package com.nahum.commons.models.entitites;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "VUELO")
public class Vuelo {
	
	@Id
	@GeneratedValue( strategy = GenerationType.SEQUENCE , generator = "SEQ_VUELO")
	@SequenceGenerator (name = "SEQ_VUELO" , sequenceName = "SEQ_VUELO", allocationSize = 1)
	@Column(name = "ID_VUELO")
	private Long id;

	@Column(name = "CODIGO_VUELO")
	private String codigoVuelo; 

	@ManyToOne
	@JoinColumn(name = "ID_AVION", referencedColumnName = "ID_AVION")
	private Avion idAvion; 
	
	@ManyToOne
	@JoinColumn(name = "ID_ORIGEN", referencedColumnName = "ID_AEROPUERTO")
	private Aeropuerto idOrigen;
	
	@ManyToOne
	@JoinColumn(name = "ID_DESTINO", referencedColumnName = "ID_AEROPUERTO")
	private Aeropuerto idDestino;
	
	
	@Column(name = "FECHA_SALIDA")
	private LocalDate fechaSalida;
	
	@Column(name = "ID_ESTATUS")
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

	public Avion getIdAvion() {
		return idAvion;
	}

	public void setIdAvion(Avion idAvion) {
		this.idAvion = idAvion;
	}

	public Aeropuerto getIdOrigen() {
		return idOrigen;
	}

	public void setIdOrigen(Aeropuerto idOrigen) {
		this.idOrigen = idOrigen;
	}

	public Aeropuerto getIdDestino() {
		return idDestino;
	}

	public void setIdDestino(Aeropuerto idDestino) {
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
