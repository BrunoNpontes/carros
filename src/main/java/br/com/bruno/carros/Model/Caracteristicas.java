package br.com.bruno.carros.Model;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Caracteristicas{

	@Id
	private Integer id;
	private String caracteristica;
	
	
	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}
