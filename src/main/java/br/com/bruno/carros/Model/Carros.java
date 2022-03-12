package br.com.bruno.carros.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Carros {

	@Id
	private Integer id;
	@OneToOne
	private Modelo modelo;
	private double valor;
	private Integer quilometragem;
	private String cor;
	@ManyToMany
	@JoinTable(name = "carros_caracteristicas", joinColumns = @JoinColumn(name = "carros_id"))
	private List<Caracteristicas> caracteristicas;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Integer getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(Integer quilometragem) {
		this.quilometragem = quilometragem;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public List<Caracteristicas> getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(List<Caracteristicas> caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

}
