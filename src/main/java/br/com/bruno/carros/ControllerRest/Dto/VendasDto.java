package br.com.bruno.carros.ControllerRest.Dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.bruno.carros.Model.Vendas;

public class VendasDto {

	private Integer id;
	private String modelo;
	private double valor;
	private Integer quilometragem;
	private String cor;
	private List<CaracteristicasDto> caracteristica;

	private String NomeCliente;
	private String nomeVendedor;
	private double desconto;
	private double valorFinal;

	public VendasDto(Vendas vendas) {
		super();
		this.id = vendas.getId();
		this.modelo = vendas.getCarros().getModelo().getNomeDoModelo();
		this.valor = vendas.getCarros().getValor();
		this.quilometragem = vendas.getCarros().getQuilometragem();
		this.cor = vendas.getCarros().getCor();
		this.caracteristica = new ArrayList<>();
		this.caracteristica.addAll(vendas.getCarros().getCaracteristicas().stream().map(CaracteristicasDto::new)
				.collect(Collectors.toList()));

		this.NomeCliente = vendas.getCliente().getNomeCliente();
		this.nomeVendedor = vendas.getVendedores().getNomeVendedor();
		this.desconto = vendas.getDesconto();
		this.valorFinal = vendas.getCarros().getValor() - vendas.getDesconto();

	}

	

	public Integer getId() {
		return id;
	}



	public String getModelo() {
		return modelo;
	}



	public double getValor() {
		return valor;
	}



	public Integer getQuilometragem() {
		return quilometragem;
	}



	public String getCor() {
		return cor;
	}



	public List<CaracteristicasDto> getCaracteristica() {
		return caracteristica;
	}



	public String getNomeCliente() {
		return NomeCliente;
	}



	public String getNomeVendedor() {
		return nomeVendedor;
	}



	public double getDesconto() {
		return desconto;
	}



	public double getValorFinal() {
		return valorFinal;
	}



	public static List<VendasDto> converter(List<Vendas> vendas) {

		return vendas.stream().map(VendasDto::new).collect(Collectors.toList());
	}

}
