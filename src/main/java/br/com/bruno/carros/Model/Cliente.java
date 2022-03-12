package br.com.bruno.carros.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente implements Comparable<Cliente> {
 
	@Id
	private Integer id;
	private String NomeCliente;


	public String getNomeCliente() {
		return NomeCliente;
	}
	
	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {

		return this.NomeCliente;
	}

	@Override
	public int compareTo(Cliente outroCliente) {
		// TODO Auto-generated method stub
		return this.NomeCliente.compareTo(outroCliente.NomeCliente);
	}
}
