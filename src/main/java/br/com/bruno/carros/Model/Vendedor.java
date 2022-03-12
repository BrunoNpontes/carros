package br.com.bruno.carros.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vendedor {
	@Id
	private Integer id;
	private String nomeVendedor;



	public String getNomeVendedor() {
		return nomeVendedor;
	}

	public Integer getId() {
		return id;
	}

}
