package br.com.bruno.carros.ControllerRest.Dto;

import br.com.bruno.carros.Model.Caracteristicas;

public class CaracteristicasDto {

	private Integer id;
	private String caracteristica;
	
	public CaracteristicasDto(Caracteristicas caracteristicas){
		
		this.id = caracteristicas.getId();
		this.caracteristica = caracteristicas.getCaracteristica();
	}

	public Integer getId() {
		return id;
	}

	public String getCaracteristica() {
		return caracteristica;
	}
	
	
}
