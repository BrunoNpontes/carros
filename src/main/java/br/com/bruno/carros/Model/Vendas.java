package br.com.bruno.carros.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Vendas {

	@Id 
	private Integer id;
	@OneToOne
	private Carros carros;
	@OneToOne
	private Vendedor vendedores;
	@OneToOne
	private Cliente cliente;
	private double desconto;
	
	
	public Vendas() {
		
	}


	public Integer getId() {
		return id;
	}

	public Vendedor getVendedores() {
		return vendedores;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Carros getCarros() {
		return carros;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setCarros(Carros carros) {
		this.carros = carros;
	}

	public void setVendedores(Vendedor vendedores) {
		this.vendedores = vendedores;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	
	


	
	
	


	

	
}
