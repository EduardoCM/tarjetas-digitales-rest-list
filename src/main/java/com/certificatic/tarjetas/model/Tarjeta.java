package com.certificatic.tarjetas.model;

import java.io.Serializable;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Tarjeta implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nombreTitular;
	private String nombreEntidad;
	private String numeroTarjeta;
	private String cvv;
	private String fechaCaudicidad;
	private String marca;
	
	

}
