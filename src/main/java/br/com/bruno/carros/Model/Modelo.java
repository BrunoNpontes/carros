package br.com.bruno.carros.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Modelo {
	@Id
	private Integer id;
	private String nomeDoModelo;
	

	

	public String getNomeDoModelo() {
		return nomeDoModelo;
	}

	public void setNomeDoModelo(String nomeDoModelo) {
		this.nomeDoModelo = nomeDoModelo;
	}

	public Integer getId() {
		return id;
	}

}
